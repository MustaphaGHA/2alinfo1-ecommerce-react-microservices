package com.alinfo1.promomicroservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Promotion {
	
	@Id
	@GeneratedValue
	public int id;
	public String code;
	public float percentage;

	
	
	
	
	public Promotion(String code, float percentage, int id) {
		super();
		this.code = code;
		this.percentage = percentage;
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	
	@Override
	public String toString() {
		return "Promotion [code=" + code + ", percentage=" + percentage + "]";
	}
}