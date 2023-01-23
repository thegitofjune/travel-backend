package com.june.travel.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "locationGen")
	@SequenceGenerator(name = "locationGen", sequenceName = "location_seq", allocationSize = 1)
	private int locationId;

	private String name;

	public Location(String name) {
		super();
		this.name = name;
	}

	public Location() {
		super();
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(locationId, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Location other = (Location) obj;
		return locationId == other.locationId && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", name=" + name + "]";
	}

}
