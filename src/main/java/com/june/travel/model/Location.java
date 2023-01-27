package com.june.travel.model;

import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "locationGen")
	@SequenceGenerator(name = "locationGen", sequenceName = "location_seq", allocationSize = 1)
	private int locationId;

	private String name;

	private String review;

	@ManyToOne(cascade = CascadeType.PERSIST)
	private Attraction attractions;

	public Location(String name, String review, Attraction attractions) {
		super();
		this.name = name;
		this.review = review;
		this.attractions = attractions;
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

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public Attraction getAttractions() {
		return attractions;
	}

	public void setAttractions(Attraction attractions) {
		this.attractions = attractions;
	}

	@Override
	public int hashCode() {
		return Objects.hash(attractions, locationId, name, review);
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
		return Objects.equals(attractions, other.attractions) && locationId == other.locationId
				&& Objects.equals(name, other.name) && Objects.equals(review, other.review);
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", name=" + name + ", review=" + review + ", attractions="
				+ attractions + "]";
	}

}
