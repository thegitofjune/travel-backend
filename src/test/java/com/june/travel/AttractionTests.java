package com.june.travel;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.june.travel.model.Attraction;
import com.june.travel.model.Location;
import com.june.travel.service.AttractionService;
import com.june.travel.service.LocationService;

@SpringBootTest
public class AttractionTests {

	@Autowired
	private AttractionService attractionService;
	
	@Autowired
	private LocationService locationService;
	
	private List<Attraction> attractions = new ArrayList<>();
	
	@Test
	void test_thatAnAttactionCanBeCreated( ) {
		Attraction attraction = new Attraction();
		attractionService.create(attraction);
		assertNotEquals(0, attraction.getAttractionId());
	}
	
	@Test
	void test_thatAListOfAttractionsCanBeRetrivedForALocation() {
		Location mexico = locationService.retrieveById(1).get();
		List<Attraction> attractions = new ArrayList<>();
		attractions = mexico.getAttractions();
		System.err.println(attractions);
		assertFalse(attractions.isEmpty());
		
	}
}
