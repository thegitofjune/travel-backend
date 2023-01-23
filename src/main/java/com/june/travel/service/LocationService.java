package com.june.travel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
