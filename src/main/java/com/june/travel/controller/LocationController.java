package com.june.travel.controller;

import java.net.URI;
import java.util.EnumSet;
import java.util.List;

import com.june.travel.model.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.june.travel.model.Location;
import com.june.travel.service.LocationService;

@RestController
@RequestMapping("/api/v1/locations/")
@CrossOrigin(origins = "http://localhost:3000")
public class LocationController {

	@Autowired
	private LocationService locationService;

	@GetMapping
	public List<Location> allLocations() {
		return locationService.retreiveAll();
	}

	@PostMapping("/addLocation")
	public ResponseEntity<Location> addLocation(@RequestBody Location location) {
		locationService.createLocation(location);
		URI uriLocation = ServletUriComponentsBuilder.fromCurrentRequest().path("/{locationId}")
				.buildAndExpand(location.getLocationId()).toUri();
		return ResponseEntity.created(uriLocation).body(location);
	}

	@GetMapping("/{locationId}")
	public Location findById(@PathVariable int locationId) {
		return locationService.retrieveById(locationId).get();
	}

	@PutMapping("/{locationId}")
	public ResponseEntity<Location> updateLocation(@PathVariable int locationId, @RequestBody Location location) {
		return ResponseEntity.ok(locationService.updateLocation(location, locationId));
	}

	@GetMapping("/regions")
	public List<Region> getRegions() {
		return  locationService.getRegions();
	}


	@GetMapping("/getByRegion/{region}")
	public List<Location> getlocationByRegion(@PathVariable  Region region) {
		return  locationService.findByRegion(region);
	}

}
