package com.app;


import java.util.LinkedList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.app.pojos.Request;
import com.app.pojos.Response;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootApplication
public class BajajFinserv1Application {

	public static void main(String[] args) {
		SpringApplication.run(BajajFinserv1Application.class, args);
	}
	@PostMapping("/bfhl")
	public Response getData(@RequestBody Request req) {
		
		List<String> numbers = new LinkedList<>();
		List<String> alphabets = new LinkedList<>();
		
		for(String s : req.getData()) {
			
			try{
				Integer.parseInt(s);
				numbers.add(s);
			}catch(Exception e) {
				alphabets.add(s);
			}
		}
		
		Response s = new Response();
		s.setIsSuccess(true);
		s.setUserId("Prajakta_More_04051997");
		s.setEmail("moreprajakta64@gmail.com");
		s.setRollNumber("PD0029");
		s.setNumbers(numbers);
		s.setAlphabets(alphabets);
		
		return s;}


}
