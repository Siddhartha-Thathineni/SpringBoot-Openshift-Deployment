package com.microservice.openshift.deployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SpringController {

	
	@GetMapping("/")
	public String welcome() {

		return "HealthCheck is good";
	}
	
	@GetMapping("/{input}")
	public String welcomeMessage(@PathVariable String input) {

		return "Hello " +input+ " Welcome to Openshift Deployment service";
	}
}
