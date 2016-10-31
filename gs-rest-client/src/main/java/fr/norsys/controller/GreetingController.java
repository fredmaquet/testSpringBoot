package fr.norsys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    
	@Autowired
	public GreetingService service;
	
	@RequestMapping(value = "/version", method = RequestMethod.GET)
    public String getVersion(){
    	return service.version();
    }
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(@RequestParam(value="name") String name) {
        return service.hello(name);
    }
}
