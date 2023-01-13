package com.qa.project.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.project.business.AgentService;
import com.qa.project.persistence.domain.AgentDomain;
import com.qa.project.persistence.dto.AgentDTO;

/*
 * This AgentController class is a Spring REST controller that maps HTTP requests 
 * to methods that perform CRUD operations on Agent entities using AgentService class.
 */

@RestController
@RequestMapping("/agent") // end-point at http://localhost:port/agent
public class AgentController {
	
	// mapping URLs to Methods
	
	// dependencies
	private AgentService service;
	
	// constructor
	@Autowired // grab the object from the beanbag
	public AgentController(AgentService service) {
		super();
		this.service = service;
	}
	
	// CRUD Functionality

	// CREATE
	@PostMapping("/create")// signifies that this method will handle POST requests to the specified path
	public ResponseEntity<AgentDTO> create(@RequestBody AgentDomain model) {
		return new ResponseEntity<>(this.service.create(model), HttpStatus.CREATED);
	}

	// READ
	@GetMapping("/read/all") // signifies that this method will handle GET requests to the specified path
	public ResponseEntity<List<AgentDTO>> readAll() {
		return ResponseEntity.ok(this.service.readAll());
	}
	
	@GetMapping("/read/{id}") // signifies that this method will handle GET requests to the specified path
	public ResponseEntity<AgentDTO> readOne(@PathVariable Long id) {
		return ResponseEntity.ok(this.service.readOne(id));
	}

	// UPDATE - PUT (REPLACE ALL)
	@PutMapping("/update/{id}") // signifies that this method will handle PUT requests to the specified path
	public ResponseEntity<AgentDTO> update(@PathVariable Long id, @RequestBody AgentDomain model) {
		return new ResponseEntity<>(this.service.update(id, model), HttpStatus.ACCEPTED);
	}

	// DELETE
	@DeleteMapping("/delete/{id}") // signifies that this method will handle DELETE requests to the specified path
	public ResponseEntity<Object> delete(@PathVariable Long id) {
		return new ResponseEntity<>(this.service.delete(id) ? HttpStatus.NO_CONTENT : HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
