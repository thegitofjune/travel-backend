package com.june.travel;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.june.travel.model.Location;
import com.june.travel.service.LocationService;

@SpringBootTest
public class LocationTests {
	
	@Autowired
	private LocationService locationService;

	
	@Test
	void test_thatALocationCanBeCreated() {
		Location location1 = new Location();
		locationService.createLocation(location1);
		assertNotEquals(0, location1.getLocationId());
	}
}
