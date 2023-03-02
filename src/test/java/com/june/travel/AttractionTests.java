package com.june.travel;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
		assertFalse(attractions.isEmpty());
	}
	
	@Test
	void test_thatAListOfAttractionsCanBeRetrievedForALocation() {
		Location retrievedLocation = locationService.retrieveById(1).get();
		List<Attraction> attractionsForThisLocation = attractionService.findByLocation(retrievedLocation);
		System.err.println(attractionsForThisLocation);
		assertFalse(attractionsForThisLocation.isEmpty());
	}
	
	@Test
	void test_ThatAnAttractionCanBeAddedToAnExistingLocation() {
		Attraction attraction = new Attraction("another place in mexico", 5, "this is a review");
		Location locationToAddAttractionTo = locationService.retrieveById(1).get();
		List<Attraction> listOfAttractions = locationToAddAttractionTo.getAttractions();
		listOfAttractions.add(attraction);
		assertEquals(3, listOfAttractions.size());
	}
	
	@Test
	void test_thatASingleLocationCanBeRetrievedWithTheId() {
		Attraction attractionFromDb = attractionService.retrieveById(1).get();
		assertNotEquals(0, attractionFromDb.getAttractionId());
	}

	@Test
	void test_ThatAnAttractionCanBeUpdated() {
		Attraction attractionToUpdate = attractionService.findById(1);
		int attractionId = attractionToUpdate.getAttractionId();
		String nameBeforeUpdate = attractionToUpdate.getName();
		attractionToUpdate.setName("this attraction has been updated");
		attractionService.updateAttraction(attractionToUpdate, attractionId);
		Attraction updatedAttraction = attractionService.findById(1);
		String nameAfterUpdate = updatedAttraction.getName();
		assertNotEquals(nameBeforeUpdate, nameAfterUpdate);
	}
}
