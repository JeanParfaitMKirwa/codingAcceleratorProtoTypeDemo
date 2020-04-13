/**
 * 
 */
package com.frontin.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author training
 *
 */
@RestController
@RequestMapping("/flows")
public class FrontController {
	
	@GetMapping("/all")
	public ResponseEntity<String> listFlows() {
		HttpHeaders headers = new HttpHeaders();
		String response ="All themes or products";
		headers.add("Responded", "FrontController");
		return ResponseEntity.accepted().headers(headers).body(response);
	}

}
