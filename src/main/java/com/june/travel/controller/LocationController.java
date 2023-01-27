package com.june.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.june.travel.model.Location;
import com.june.travel.model.Review;
import com.june.travel.service.LocationService;
import com.june.travel.service.ReviewService;

@RestController
@RequestMapping("/api/v1/locations/")
@CrossOrigin(origins = "http://localhost:3000")
public class LocationController {

	@Autowired
	private LocationService locationService;
	
	@Autowired
	private ReviewService reviewService;

	@GetMapping
	public List<Location> allLocations() {
		return locationService.retreiveAll();
	}

	@GetMapping("/{locationId}")
	public Location findById(@PathVariable int locationId) {
		return locationService.retrieveById(locationId).get();
	}
	
	
}
