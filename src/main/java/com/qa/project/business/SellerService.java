package com.qa.project.business;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.project.persistence.domain.SellerDomain;
import com.qa.project.persistence.dto.SellerDTO;
import com.qa.project.persistence.repo.SellerRepo;

@Service
public class SellerService {
	
	// dependencies
	private SellerRepo repo; // our JPA repo for our Seller
	private ModelMapper mapper; // automatically maps DTOs onto Entities (need to create the Bean in config)
	
	// constructor
	@Autowired // saves us writing boilerplate to connect them
	public SellerService(SellerRepo repo, ModelMapper mapper) {
		this.repo = repo;
		this.mapper = mapper;
	}
	
	private SellerDTO mapToDto(SellerDomain model) {
		return this.mapper.map(model, SellerDTO.class);
	}
	
	/*
	 * C R U D
	 */
	
	// Create - POST
	public SellerDTO create(SellerDomain model) {
		return this.mapToDto(this.repo.save(model));
	}
	
	// Read - GET
	//	all (using a stream)
	public List<SellerDTO> readAll() {
		return this.repo.findAll().stream()
				.map(this::mapToDto)
				.collect(Collectors.toList());
	}
	//	one
	public SellerDTO readOne(Long id) {
		return this.mapToDto(this.repo.findById(id).orElseThrow());
	}
	
	// Update - PUT
	public SellerDTO update(Long id, SellerDomain model) {
		
		SellerDomain existing = this.repo.findById(id)
							   .orElseThrow();
		
		existing.setFirstName(model.getFirstName());
		existing.setSurname(model.getSurname());
		existing.setPhone(model.getPhone());

		return this.mapToDto(this.repo.save(existing));
	}
	
	// Delete - DELETE
	public boolean delete(Long id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}
	
}
