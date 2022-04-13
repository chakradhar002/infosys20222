package com.demo.address;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	
	@Id
	@GeneratedValue
	@Column(name = "ADDRESS_Id")
	private long addressId;
	/// added  colum for street same for other too...
	@Column(name = "ADDRESS_STREET", nullable = false, length = 20)
	private String street;
	
	@Column(name = "ADDRESS_CITY", nullable = false, length = 50)
	private String city;
	
	@Column(name = "ADDRESS_STATE", nullable = false, length = 50)
	private String state;
	
	@Column(name = "ADDRESS_ZIP", nullable = false, length = 50)
	private String zip;
	
	public Address(){
		
	}
	
	public Address( String street, String city, String state, String zip) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	
	public long getAddressId() {
		return addressId;
	}
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}


}
