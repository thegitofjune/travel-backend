package com.june.travel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.june.travel.model.Attraction;
import com.june.travel.service.AttractionService;

@RestController
@RequestMapping("/api/v1/attractions/")
@CrossOrigin(origins = "http://localhost:3000")
public class AttractionController {
	
	@Autowired
	private AttractionService attractionService;
	
	
	
	/*
	@GetMapping("/{locationId}/attractions")
	public Location findById(@PathVariable int locationId) {
		return attr.retrieveById(locationId).get();
	}
*/
}
