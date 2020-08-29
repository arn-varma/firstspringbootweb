/**
 * 
 */
package com.learn.avarma.firstspringbootweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author avarma
 *
 */
@RestController
public class HelloWorldController {
	@RequestMapping("/")
	public String HelloWorld(){
		return "This is my first Hello World Spring Boot Class - Thanks";
	}
}
