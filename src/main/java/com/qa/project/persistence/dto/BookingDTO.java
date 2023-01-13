package com.qa.project.persistence.dto;

import java.sql.Timestamp;

import com.qa.project.persistence.domain.AgentDomain;
import com.qa.project.persistence.domain.BuyerDomain;
import com.qa.project.persistence.domain.PropertyDomain;

/*
 * This class BookingDTO is used to represent an 'booking' object in the application.
 * This class is a simple POJO (Plain Old Java Object) class that is used to hold data 
 * and transfer it between different layers of the application. It is also commonly 
 * known as a Data Transfer Object (DTO) and is used to transfer data between the 
 * different layers of the application.
 */

public class BookingDTO {

	// private fields to hold information
	private Long id;
	private AgentDomain agent;
	private BuyerDomain buyer;
	private PropertyDomain property;
	private Timestamp time;
	
	// default constructor
	public BookingDTO() {
		super();
	}
	
	// all arguments constructor
	public BookingDTO(Long id, AgentDomain agent, BuyerDomain buyer, PropertyDomain property, Timestamp time) {
		super();
		this.id = id;
		this.agent = agent;
		this.buyer = buyer;
		this.property = property;
		this.time = time;
	}
	
	// getters and setters for each of the fields
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AgentDomain getAgent() {
		return agent;
	}

	public void setAgent(AgentDomain agent) {
		this.agent = agent;
	}

	public BuyerDomain getBuyer() {
		return buyer;
	}

	public void setBuyer(BuyerDomain buyer) {
		this.buyer = buyer;
	}

	public PropertyDomain getProperty() {
		return property;
	}

	public void setProperty(PropertyDomain property) {
		this.property = property;
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}
	
}
