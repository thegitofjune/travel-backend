package com.june.travel;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;

import com.june.travel.model.Location;
import com.june.travel.model.Review;
import com.june.travel.service.LocationService;
import com.june.travel.service.ReviewService;

@SpringBootTest
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
public class LocationTests {
	
	@Autowired
	private LocationService locationService;
	

	@Autowired
	private ReviewService reviewService;


	
	@Test
	void test_thatALocationCanBeCreated() {
		Location location1 = new Location();
		locationService.createLocation(location1);
		assertNotEquals(0, location1.getLocationId());
	}
	
	@Test
	void test_thatALocationCanBeCreatedWithAReview() {
		Location location1 = new Location();
		Review review1 = new Review();
		location1.setReviews(review1);
		locationService.createLocation(location1);
		assertNotEquals(0, location1.getLocationId());

	}
}
