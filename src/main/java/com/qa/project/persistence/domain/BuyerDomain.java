package com.qa.project.persistence.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "buyer")
public class BuyerDomain {
	
	@Id // This sets the variable to be the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // this Auto-Increments for us
	@Column(name = "buyer_id") // assign a custom name to the column
	private Long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "surname")
	private String surname;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "postcode")
	private String postcode;
	
	@Column(name = "phone")
	private String phone;
	
	// constructors
	
	// default constructor
	public BuyerDomain() {
		super();
	}
	
	// all arguments constructor
	public BuyerDomain(Long id, String firstName, String surname, String address, String postcode, String phone) {
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
