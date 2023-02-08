package com.june.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.june.travel.model.Attraction;
import com.june.travel.model.Location;
import com.june.travel.service.AttractionService;
import com.june.travel.service.LocationService;

@RestController
@RequestMapping("/api/v1/attractions/")
@CrossOrigin(origins = "http://localhost:3000")
public class AttractionController {

	@Autowired
	private AttractionService attractionService;

	@Autowired
	private LocationService locationService;

	@GetMapping("/{locationId}")
	public ResponseEntity<List<Attraction>> getAttractionsForLocation(@PathVariable int locationId) {
		Location location = locationService.retrieveById(locationId).get();
		return ResponseEntity.ok(attractionService.findByLocation(location));
	}

}
