package com.june.travel.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reviewGen")
	@SequenceGenerator(name = "reviewGen", sequenceName = "review_seq", allocationSize = 1)
	private int reviewId;

	private String reviewBody;

	public Review(String reviewBody) {
		super();
		this.reviewBody = reviewBody;
	}

	public Review() {
		super();
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public String getReviewBody() {
		return reviewBody;
	}

	public void setReviewBody(String reviewBody) {
		this.reviewBody = reviewBody;
	}

	@Override
	public int hashCode() {
		return Objects.hash(reviewBody, reviewId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Review other = (Review) obj;
		return Objects.equals(reviewBody, other.reviewBody) && reviewId == other.reviewId;
	}

	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", reviewBody=" + reviewBody + "]";
	}

}
