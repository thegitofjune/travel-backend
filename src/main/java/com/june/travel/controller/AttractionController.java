package com.june.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.june.travel.model.Attraction;
import com.june.travel.model.Location;
import com.june.travel.service.AttractionService;

@RestController
@RequestMapping("/api/v1/attractions/")
@CrossOrigin(origins = "http://localhost:3000")
public class AttractionController {
	
	@Autowired
	private AttractionService attractionService;
	
	@GetMapping("/{locationId}")
	public List<Attraction> getAllAttractionsByLocation(@RequestBody Location location){	
		return attractionService.findByLocation(location);
	}
	
	@GetMapping("location/{id}")
	public List<Attraction> getAllExamResultsByTraineeId(@PathVariable("locationId") int locationId){
		return attractionService.getAttractionsByLocationId(locationId);
	}
}
