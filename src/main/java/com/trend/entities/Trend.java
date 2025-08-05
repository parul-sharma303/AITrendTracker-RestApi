package com.trend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Trend {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String topic;
	private String category;
	private int popularityScore;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPopularityScore() {
		return popularityScore;
	}
	public void setPopularityScore(int popularityScore) {
		this.popularityScore = popularityScore;
	}
	public Trend(Long id, String topic, String category, int popularityScore) {
		super();
		this.id = id;
		this.topic = topic;
		this.category = category;
		this.popularityScore = popularityScore;
	}
	public Trend() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
