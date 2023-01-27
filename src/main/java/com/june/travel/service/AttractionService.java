package com.june.travel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.june.travel.model.Attraction;
import com.june.travel.repository.AtrtactionDao;

@Service
public class AttractionService {

	private AtrtactionDao attractionDao;

	@Autowired
	public AttractionService(AtrtactionDao attractionDao) {
		super();
		this.attractionDao = attractionDao;
	}

	public void create(Attraction attraction) {
		attractionDao.save(attraction);
	}


}
