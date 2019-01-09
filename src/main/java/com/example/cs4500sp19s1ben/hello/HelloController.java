package com.example.cs4500sp19s1ben.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	// Return a hello string when the user goes to /api/hello/string.
	@RequestMapping("/api/hello/string")
	public String sayHello() {
		return "Hello CS4500!";
	}

	// Return a new HelloObject when the user goes to /api/hello/object.
	@RequestMapping("/api/hello/object")
	public HelloObject sayHelloObject() {
		HelloObject obj = new HelloObject("Hello Object CS4500!");
		return obj;
	}
}
