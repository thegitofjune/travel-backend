package com.june.travel;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;

import com.june.travel.model.Attraction;
import com.june.travel.model.Location;
import com.june.travel.model.Review;
import com.june.travel.service.LocationService;
import com.june.travel.service.ReviewService;

@SpringBootTest
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
public class LocationTests {
	
	@Autowired
	private LocationService locationService;
	
	@Test
	void test_thatALocationCanBeCreated() {
		Location location = new Location();
		locationService.createLocation(location);
		assertNotEquals(0, location.getLocationId());
	}
	
	@Test
	void test_thatALocationCanBeCreatedWithAReview() {
		Location location = new Location();
		Review review = new Review();
		location.setReviews(review);
		locationService.createLocation(location);
		assertNotEquals(0, location.getLocationId());
	}
	
	@Test
	void test_thatAnLocationCanBeSaved_withAnAttractionAndAReview() {
		Location location = new Location();
		Review review = new Review();
		Attraction attraction = new Attraction();
		location.setAttractions(attraction);
		location.setReviews(review);
		locationService.createLocation(location);
		assertNotEquals(0, location.getLocationId());
	}
	
	
}
