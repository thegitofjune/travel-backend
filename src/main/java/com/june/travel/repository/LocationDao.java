package com.june.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.june.travel.model.Location;

public interface LocationDao extends JpaRepository<Location, Integer>{


}
