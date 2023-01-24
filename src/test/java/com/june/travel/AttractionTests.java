package com.june.travel;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.june.travel.model.Attraction;
import com.june.travel.service.AttractionService;

@SpringBootTest
public class AttractionTests {

	@Autowired
	private AttractionService attractionService;
	
	@Test
	void test_thatAnAttactionCanBeCreated( ) {
		Attraction attraction = new Attraction();
		attractionService.create(attraction);
		assertNotEquals(0, attraction.getAttractionId());
	}
}
