package com.qa.project.persistence.domain;

import com.qa.project.persistence.enums.StatusEnum;
import com.qa.project.persistence.enums.TypeEnum;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "property")
public class PropertyDomain {
	
	@Id // This sets the variable to be the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // this Auto-Increments for us
	@Column(name = "property_id") // assign a custom name to the column
	private Long id;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "postcode")
	private String postcode;
	
	@Column(name = "type")
    @Enumerated(EnumType.STRING)
	private TypeEnum type;
	
	@Column(name = "number_of_bedrooms")
	private Integer bedrooms;
	
	@Column(name = "number_of_bathrooms")
	private Integer bathrooms;

	@Column(name = "garden")
	private Boolean garden;

	@Column(name = "price")
	private Float price;
	
	@Column(name = "status")
    @Enumerated(EnumType.STRING)
	private StatusEnum status;
	
	@ManyToOne()
	@JoinColumn(name = "seller_id")
	private SellerDomain seller;
	
	// one to one link (unidirectional)
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "buyer_id", referencedColumnName = "buyer_id") 
	private BuyerDomain buyer;
	
	// constructors
	
	public PropertyDomain() {
		super();
	}
	
	// no buyer constructor
	public PropertyDomain(Long id, String address, String postcode, TypeEnum type, Integer bedrooms, Integer bathrooms,
			Boolean garden, Float price, StatusEnum status, SellerDomain seller) {
		super();
		this.id = id;
		this.address = address;
		this.postcode = postcode;
		this.type = type;
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		this.garden = garden;
		this.price = price;
		this.status = status;
		this.seller = seller;
	}
	
	// getters and setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public TypeEnum getType() {
		return type;
	}

	public void setType(TypeEnum type) {
		this.type = type;
	}

	public Integer getBedrooms() {
		return bedrooms;
	}

	public void setBedrooms(Integer bedrooms) {
		this.bedrooms = bedrooms;
	}

	public Integer getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(Integer bathrooms) {
		this.bathrooms = bathrooms;
	}

	public Boolean getGarden() {
		return garden;
	}

	public void setGarden(Boolean garden) {
		this.garden = garden;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public SellerDomain getSeller() {
		return seller;
	}

	public void setSeller(SellerDomain seller) {
		this.seller = seller;
	}

	public BuyerDomain getBuyer() {
		return buyer;
	}

	public void setBuyer(BuyerDomain buyer) {
		this.buyer = buyer;
	}
	
}
