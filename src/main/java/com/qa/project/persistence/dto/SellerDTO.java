package com.qa.project.persistence.dto;

public class SellerDTO{
	
	// variables
	
	private Long id;
	private String firstName;
	private String surname;
	private String address;
	private String postcode;
	private String phone;
	
	// constructors
	
	// default constructor
	public SellerDTO() {
		super();
	}
	
	// all arguments constructor
	public SellerDTO(Long id, String firstName, String surname, String address, String postcode, String phone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.surname = surname;
		this.address = address;
		this.postcode = postcode;
		this.phone = phone;
	}

	// getters and setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
