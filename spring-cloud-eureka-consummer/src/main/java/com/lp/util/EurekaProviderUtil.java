package com.lp.util;

import com.lp.pojo.User;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class EurekaProviderUtil {

    public static ResponseEntity<List<User>> get(String provider, String url, LoadBalancerClient loadBalancerClient){
        //选择调用的服务的名称
        //ServiceInstance 封装了服务的基本信息，如 IP，端口
        ServiceInstance si = loadBalancerClient.choose(provider);
        //拼接访问服务的URL
        StringBuffer sb = new StringBuffer();
        //http://localhost:9090/user
        sb.append("http://").append(si.getHost()).append(":").append(si.getPort()).append("/").append(url);


        //springMVC RestTemplate
        RestTemplate rt = new RestTemplate();

        ParameterizedTypeReference<List<User>> type = new ParameterizedTypeReference<List<User>>() {};

        //ResponseEntity:封装了返回值信息
        ResponseEntity<List<User>> response = rt.exchange(sb.toString(), HttpMethod.GET, null, type);
        return response;
    }
}
