package fr.norsys.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("http://localhost:9000")
public interface GreetingService{  

	@RequestMapping(method = RequestMethod.GET, value = "/version")
    String version();
	
	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	String hello(@RequestParam("name") String name);
}
