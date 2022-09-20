package com.example.mockservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MockServiceController {
	
	
	
	@RequestMapping(value = "/postMessage/{message}", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Integer> postMessage(@PathVariable("message") String message) {
		
		System.out.println("message===="+message);
       
        HttpStatus status = message != null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        
        int statusCode= message != null ? 200 :404;
        
        return new ResponseEntity<Integer>(statusCode,status);
    }

}
