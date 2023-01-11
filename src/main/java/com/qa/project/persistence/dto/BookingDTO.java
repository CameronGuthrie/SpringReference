package com.qa.project.persistence.dto;

import java.sql.Timestamp;

import com.qa.project.persistence.domain.AgentDomain;
import com.qa.project.persistence.domain.BuyerDomain;
import com.qa.project.persistence.domain.PropertyDomain;

public class BookingDTO {
	
	// variables
	
	private Long id;
	private AgentDomain agent;
	private BuyerDomain buyer;
	private PropertyDomain property;
	private Timestamp time;
	
	// constructors
	
	public BookingDTO() {
		super();
	}
	// all args constructor

	public BookingDTO(Long id, AgentDomain agent, BuyerDomain buyer, PropertyDomain property, Timestamp time) {
		super();
		this.id = id;
		this.agent = agent;
		this.buyer = buyer;
		this.property = property;
		this.time = time;
	}
	
	// getters and setters

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
