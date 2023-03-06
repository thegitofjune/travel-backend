package com.june.travel;

import java.util.ArrayList;
import java.util.List;

import com.june.travel.model.Region;
import org.hibernate.metamodel.mapping.internal.NoValueGeneration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;

import com.june.travel.model.Attraction;
import com.june.travel.model.Location;
import com.june.travel.service.LocationService;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
public class LocationTests {

	@Autowired
	private LocationService locationService;

	private Location location;

	private List<Attraction> attractions;

	private Attraction attraction1;
	private Attraction attraction2;

	@BeforeEach
	void setup() {
		attractions = new ArrayList<>();
		location = new Location();
		attraction1 = new Attraction();
		attraction2 = new Attraction();
	}

	@Test
	void test_thatALocationCanBeCreated() {
		locationService.createLocation(location);
		assertNotEquals(0, location.getLocationId());
	}

	@Test
	void test_thatAnLocationCanBeSaved_withATwottractions() {
		attractions.add(attraction1);
		attractions.add(attraction2);
		locationService.createLocation(location);
		assertNotEquals(0, location.getLocationId());
	}

	@Test
	void test_thatALocationCanBeCreatedUsingRealValues() {
		Attraction attractionMexico = new Attraction("Mayan sites", 5, "A review for Mayan sites");
		attractions.add(attractionMexico);
		Location locationMexico = new Location("Mexico",
				"Mexico is a warm country and Mexicans are a warm people, the food is spicy and the Mayan trial is out of this world",
				null, 5);
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

	@Test
	void test_ThatALocationCanBeUpdated() {
		Location locationToUpdate = locationService.retrieveById(1).get();
		int locationId = locationToUpdate.getLocationId();
		String nameBeforeUpdate = locationToUpdate.getName();
		locationToUpdate.setName("Updated name");
		locationService.updateLocation(locationToUpdate, locationId);
		Location updatedLocation = locationService.retrieveById(1).get();
		String nameAfterUpdate = updatedLocation.getName();
		System.err.println(updatedLocation);
		assertNotEquals(nameAfterUpdate, nameBeforeUpdate);
	}

	@Test
	void test_ThatALocationThatDoesNotExistWillNotBeCreatedByUpdateAttempt() {
		Location locationToUpdate = locationService.retrieveById(1).get();
		int locationId = locationToUpdate.getLocationId();
		int numberBeforeUpdate = locationService.retreiveAll().size();
		locationService.updateLocation(locationToUpdate, locationId);
		int numberAfterUpdate = locationService.retreiveAll().size();
		assertEquals(numberAfterUpdate, numberBeforeUpdate);
	}

	@Test
	void test_thatARegionCanBeAddedToALocation() {
		Location locationWithRegion = new Location("Hong Kong", "A great place", 5 , null, Region.APAC);
		locationService.createLocation(locationWithRegion);
		assertEquals("Asia Pacific", locationWithRegion.getRegion().getName());
	}

	@Test
	void test_thatAListOfLocationsCanBeFoundForARegion() {
		List<Location> allLocations = locationService.retreiveAll();
		int sizeAllLocations = allLocations.size();
		List<Location> locationsInApac = locationService.findByRegion(Region.APAC);
		int sizeAPACLocations = locationsInApac.size();
		System.err.println(locationsInApac);
		assertNotEquals(sizeAllLocations, sizeAPACLocations);
	}

}
