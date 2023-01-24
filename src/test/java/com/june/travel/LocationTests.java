package com.june.travel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;

import com.june.travel.model.Attraction;
import com.june.travel.model.Location;
import com.june.travel.model.Review;
import com.june.travel.service.LocationService;

@SpringBootTest
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
public class LocationTests {

	@Autowired
	private LocationService locationService;

	private Location location;

	private Review review;

	private Attraction attraction;

	@BeforeEach
	void setup() {
		location = new Location();
		review = new Review();
		attraction = new Attraction();
	}

	@Test
	void test_thatALocationCanBeCreated() {
		locationService.createLocation(location);
		assertNotEquals(0, location.getLocationId());
	}

	@Test
	void test_thatALocationCanBeCreatedWithAReview() {
		location.setReviews(review);
		locationService.createLocation(location);
		assertNotEquals(0, location.getLocationId());
	}

	@Test
	void test_thatAnLocationCanBeSaved_withAnAttractionAndAReview() {
		location.setAttractions(attraction);
		location.setReviews(review);
		locationService.createLocation(location);
		assertNotEquals(0, location.getLocationId());
	}
	
	@Test
	void test_thatALocationCanBeCreatedUsingRealValues() {
		Review reviewMexico = new Review("very warm, Mayan culture, great food");
		Attraction attractionMexico = new Attraction("Mayan sites", 5);
		Location locationMexico = new Location("Mexico", reviewMexico, attractionMexico);
		locationService.createLocation(locationMexico);
	}
	
	@Test
	void test_thatALocationCanBeRetrievedUsingId() {
		Location retrievedLocation = locationService.retrieveById(1).get();
		assertEquals(1, retrievedLocation.getLocationId());
	}
	
	@Test
	void test_thatAListOfLocationsCanBeRetrieved() {
		List<Location> locations = locationService.retreiveAll();
		assertFalse(locations.isEmpty());
	}

}
