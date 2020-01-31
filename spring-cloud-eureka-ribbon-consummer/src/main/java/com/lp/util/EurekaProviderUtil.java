package com.lp.util;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class EurekaProviderUtil {

    public static ResponseEntity<List<?>> getList(String provider, String url, LoadBalancerClient loadBalancerClient){
        //选择调用的服务的名称
        //ServiceInstance 封装了服务的基本信息，如 IP，端口
        ServiceInstance si = loadBalancerClient.choose(provider);
        //springMVC RestTemplate
        RestTemplate rt = new RestTemplate();
        //拼接访问服务的URL
        ParameterizedTypeReference<List<?>> type = new ParameterizedTypeReference<List<?>>() {};

        //ResponseEntity:封装了返回值信息
        ResponseEntity<List<?>> response = rt.exchange("http://" + si.getHost() + ":" + si.getPort() + "/" + url
                //springMVC RestTemplate
                //ResponseEntity:封装了返回值信息
                , HttpMethod.GET, null, type);
        System.out.println(si.getHost()+":"+si.getPort());
        return response;
    }
	
	    public static ResponseEntity<?> getOne(String provider, String url, LoadBalancerClient loadBalancerClient){
        //选择调用的服务的名称
        //ServiceInstance 封装了服务的基本信息，如 IP，端口
        ServiceInstance si = loadBalancerClient.choose(provider);
        //springMVC RestTemplate
        RestTemplate rt = new RestTemplate();
        //拼接访问服务的URL
        ParameterizedTypeReference<?> type = new ParameterizedTypeReference<Object>() {};

        //ResponseEntity:封装了返回值信息
        ResponseEntity<?> response = rt.exchange("http://" + si.getHost() + ":" + si.getPort() + "/" + url
                //springMVC RestTemplate
                //ResponseEntity:封装了返回值信息
                , HttpMethod.GET, null, type);
        System.out.println(si.getHost()+":"+si.getPort());
        return response;
    }
}
