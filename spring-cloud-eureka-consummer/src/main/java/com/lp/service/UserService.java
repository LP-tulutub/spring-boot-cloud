package com.lp.service;

import java.util.List;

import com.lp.pojo.User;
import com.lp.util.EurekaProviderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class UserService {

	@Autowired
	private LoadBalancerClient loadBalancerClient;//ribbon负载均衡器
	
	public List<User> getUsers(){

		ResponseEntity<List<User>> response =
				EurekaProviderUtil.get("eureka-provider", "start", loadBalancerClient);

		List<User> list =response.getBody();

		return list;
	}
}
