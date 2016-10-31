package fr.norsys.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.norsys.domain.Greeting;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping("/hello")
    public String hello(@RequestParam(value="name", defaultValue="World") String name) {
        return "Hello "+name+" !";
    }
    
    @RequestMapping("/version")
    public String getVersion(){
    	return "version 2.0 !!!";
    }
}
