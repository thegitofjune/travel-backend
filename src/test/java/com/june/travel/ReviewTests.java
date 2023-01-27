package com.june.travel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.june.travel.model.Location;
import com.june.travel.model.Review;
import com.june.travel.service.LocationService;
import com.june.travel.service.ReviewService;

@SpringBootTest
public class ReviewTests {
	
	@Autowired
	private ReviewService reviewService;
	
	@Autowired
	private LocationService locationService;

	
	@Test
	void test_thatALocationCanBeCreated() {
		Review review1 = new Review();
		reviewService.createReview(review1);
		assertNotEquals(0, review1.getReviewId());
	}

	@Test
	void test_ThatAReviewCanBeRetrievedFromALocation() {
		Location retrievedLocation = locationService.retrieveById(1).get();
		Review reviewFromLocation = retrievedLocation.getReviews();
		assertEquals(1, reviewFromLocation.getReviewId());
	}
}
