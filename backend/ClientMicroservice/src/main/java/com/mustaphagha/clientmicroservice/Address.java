package com.mustaphagha.clientmicroservice;




public class Address {
    private String country ;
    private String city ;
    private String fullAddress ;
    private String postalCode ;
    
	public Address(String country, String city, String fullAddress, String postalCode) {
		super();
		this.country = country;
		this.city = city;
		this.fullAddress = fullAddress;
		this.postalCode = postalCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


}
