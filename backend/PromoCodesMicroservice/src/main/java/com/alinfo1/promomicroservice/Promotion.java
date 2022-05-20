package com.alinfo1.promomicroservice;

public class Promotion {

	public String code;
	public float percentage;
	public int id;
	
	
	
	
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
