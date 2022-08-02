package com.casmir.org;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
public class FirstController {
	
	@GetMapping
	public String getUser() {
		
		return "HTTP GET REQUEST WAS SENT";
	}
	
	@PostMapping
   public String createUser() {
		
		return "HTTP POST REQUEST WAS SENT";
	}
	
	@PutMapping
	   public String updateUser() {
			
			return "HTTP PUT REQUEST WAS SENT";
		}
		
	@DeleteMapping
	   public String deleteUser() {
			
			return "HTTP DELETE REQUEST WAS SENT";
		}
		
	
	
	

}
