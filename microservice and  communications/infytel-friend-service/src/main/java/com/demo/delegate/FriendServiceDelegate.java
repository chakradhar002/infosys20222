package com.demo.delegate;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FriendServiceDelegate {
	@Autowired
	RestTemplate restTemplate;
	
	public String callFriendServiceAndGetData(String familyname) {
		System.out.println("Consul Demo - Getting School details for " + familyname);
		String response = restTemplate.exchange("http://family-service/getFamilyDetails/{familyname}", HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
		}, familyname).getBody();
		

		System.out.println("Response Received as " + response + " -  " + new Date());

		return "Family Name -  " + familyname + " :::  Friend Details " + response + " -  " + new Date();
	}
	

}
