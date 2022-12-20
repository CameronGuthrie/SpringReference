package com.qa.project.business;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.project.persistence.domain.AgentDomain;
import com.qa.project.persistence.dto.AgentDTO;
import com.qa.project.persistence.repo.AgentRepo;

@Service
public class AgentService {
	
	// dependencies
	private AgentRepo repo; // our JPA repo for our Agent
	private ModelMapper mapper; // automatically maps DTOs onto Entities (need to create the Bean in config)
	
	// constructor
	@Autowired // saves us writing boilerplate to connect them
	public AgentService(AgentRepo repo, ModelMapper mapper) {
		this.repo = repo;
		this.mapper = mapper;
	}
	
	private AgentDTO mapToDto(AgentDomain model) {
		return this.mapper.map(model, AgentDTO.class);
	}
	
	/*
	 * C R U D
	 */
	
	// Create - POST
	public AgentDTO create(AgentDomain model) {
		return this.mapToDto(this.repo.save(model));
	}
	
	// Read - GET
	//	all (using a stream)
	public List<AgentDTO> readAll() {
		return this.repo.findAll().stream()
				.map(this::mapToDto)
				.collect(Collectors.toList());
	}
	//	one
	public AgentDTO readOne(Long id) {
		return this.mapToDto(this.repo.findById(id).orElseThrow());
	}
	
	// Update - PUT
	public AgentDTO update(Long id, AgentDomain model) {
		
		AgentDomain existing = this.repo.findById(id)
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
