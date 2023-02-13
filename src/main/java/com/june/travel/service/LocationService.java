package com.june.travel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.june.travel.model.Attraction;
import com.june.travel.model.Location;
import com.june.travel.repository.LocationDao;

@Service
public class LocationService {

	private LocationDao locationDao;

	@Autowired
	public LocationService(LocationDao locationDao) {
		super();
		this.locationDao = locationDao;
	}

	public void createLocation(Location location) {
		locationDao.save(location);
	}

	public Optional<Location> retrieveById(int locationId) {
		return locationDao.findById(locationId);
	}

	public List<Location> retreiveAll() {
		return locationDao.findAll();
	}

	public Location updateLocation(Location location, int locationId) {
		if (!locationDao.existsById(locationId)) {
			System.err.println("no such location exitst");
		}
		return locationDao.save(location);
	}

}
