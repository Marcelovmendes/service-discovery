package com.example.api_02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

	@GetMapping("/health")
	public String healthCheck() {
		return "API-O2 is up and running!";
	}
}
