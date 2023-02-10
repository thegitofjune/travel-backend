package com.june.travel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.june.travel.model.Attraction;
import com.june.travel.model.Location;
import com.june.travel.repository.AtrtactionDao;

@Service
public class AttractionService {

	private AtrtactionDao attractionDao;

	@Autowired
	public AttractionService(AtrtactionDao attractionDao) {
		super();
		this.attractionDao = attractionDao;
	}

	public void create(Attraction attraction, Location location) {
		attraction.setLocation(location);
		attractionDao.save(attraction);
	}
	
	public void create(Attraction attraction) {
		attractionDao.save(attraction);
	}

	public List<Attraction> findByLocation(Location location) {
		return attractionDao.findByLocation(location);
	}


}
