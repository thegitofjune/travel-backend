package com.june.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.june.travel.model.Location;

@Repository
public interface LocationDao extends JpaRepository<Location, Integer>{


}
