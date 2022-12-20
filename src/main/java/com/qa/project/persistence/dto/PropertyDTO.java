package com.qa.project.persistence.dto;

import com.qa.project.persistence.domain.BuyerDomain;
import com.qa.project.persistence.domain.SellerDomain;
import com.qa.project.persistence.enums.StatusEnum;
import com.qa.project.persistence.enums.TypeEnum;

public class PropertyDTO {

	// variables 
	
	private Long id;
	private String address;
	private String postcode;
	private TypeEnum type;
	private Integer bedrooms;
	private Integer bathrooms;
	private Boolean garden;
	private Float price;
	private StatusEnum status;
	private SellerDomain seller;
	private BuyerDomain buyer;
	
//	@Column(name = "seller_id")
//	private Long sellerId;
//
//	@Column(name = "buyer_id")
//	private Long buyerId;
	
	// constructors
	
	public PropertyDTO() {
		super();
	}
	
	// all args constructor
	public PropertyDTO(Long id, String address, String postcode, TypeEnum type, Integer bedrooms, Integer bathrooms,
			Boolean garden, Float price, StatusEnum status, SellerDomain seller, BuyerDomain buyer) {
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
		this.buyer = buyer;
	}
	
	// no buyer constructor
	public PropertyDTO(Long id, String address, String postcode, TypeEnum type, Integer bedrooms, Integer bathrooms,
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
