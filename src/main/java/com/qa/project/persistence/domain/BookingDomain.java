package com.qa.project.persistence.domain;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "booking")
public class BookingDomain {
	
	@Id // This sets the variable to be the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // this Auto-Increments for us
	@Column(name = "booking_id") // assign a custom name to the column
	private Long id;
	
	@ManyToOne()
	@JoinColumn(name = "agent_id")
	private AgentDomain agent;
	
	@ManyToOne()
	@JoinColumn(name = "buyer_id")
	private BuyerDomain buyer;
	
	@ManyToOne()
	@JoinColumn(name = "property_id")
	private PropertyDomain property;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "time")
	private Timestamp time;
	
	// constructors
	
	public BookingDomain() {
		super();
	}
	// all args constructor
	
	public BookingDomain(Long id, AgentDomain agent, BuyerDomain buyer, PropertyDomain property, Timestamp time) {
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
