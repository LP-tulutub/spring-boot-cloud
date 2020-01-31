package com.lp.service;

import com.lp.pojo.User;
import com.lp.util.EurekaProviderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

	@Autowired
	private LoadBalancerClient loadBalancerClient;//ribbon负载均衡器
	
	public List<User> getUsers(){
		ResponseEntity<List<?>> response =
				EurekaProviderUtil.getList("eureka-ribbon-provider", "provider", loadBalancerClient);

		List<?> body = response.getBody();
		return (List<User>)body;
	}
}
