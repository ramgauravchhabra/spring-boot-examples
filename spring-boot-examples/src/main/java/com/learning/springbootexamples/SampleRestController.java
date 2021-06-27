package com.learning.springbootexamples;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

	@RequestMapping("/sampleApi")
	public String sampleApi() {
		return "Hello World";
	}
}
