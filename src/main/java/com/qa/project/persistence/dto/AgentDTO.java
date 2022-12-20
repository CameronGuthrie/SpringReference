package com.qa.project.persistence.dto;

public class AgentDTO {
	
	// variables
	
	private Long id;
	private String firstName;
	private String surname;
	private String phone;
	
	// constructors
	
	public AgentDTO() {
		super();
	}
	
	public AgentDTO(Long id, String firstName, String surname, String phone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.surname = surname;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
