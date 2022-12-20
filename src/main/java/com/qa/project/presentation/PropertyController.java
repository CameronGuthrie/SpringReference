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

import com.qa.project.business.PropertyService;
import com.qa.project.persistence.domain.PropertyDomain;
import com.qa.project.persistence.dto.PropertyDTO;

@RestController
@RequestMapping("/property") // end-point at http://localhost:port/property
public class PropertyController {
	
	// mapping URLs to Methods
	
	// dependencies
	private PropertyService service;
	
	// constructor
	@Autowired // grab the object from the beanbag
	public PropertyController(PropertyService service) {
		super();
		this.service = service;
	}
	
	// CRUD Functionality

	// CREATE
		/* @PostMapping signifies that this method will handle GET requests to the specified path
		 * - http://localhost:port/myroute
		 * - @PostMapping is a specialisation of @RequestMapping
		 * The following @RequestMapping is equivalent to @PostMapping
		 * 		@RequestMapping(method = RequestMethod.CREATE)
		*/
	@PostMapping("/create")
	public ResponseEntity<PropertyDTO> create(@RequestBody PropertyDomain model) {
		return new ResponseEntity<>(this.service.create(model), HttpStatus.CREATED);
	}

	// READ
	@GetMapping("/read/all")
	public ResponseEntity<List<PropertyDTO>> readAll() {
		return ResponseEntity.ok(this.service.readAll());
	}
	
	@GetMapping("/read/{id}")
	public ResponseEntity<PropertyDTO> readOne(@PathVariable Long id) {
		return ResponseEntity.ok(this.service.readOne(id));
	}

	// UPDATE - PUT (REPLACE ALL)
	@PutMapping("/update/{id}")
	public ResponseEntity<PropertyDTO> update(@PathVariable Long id, @RequestBody PropertyDomain model) {
		return new ResponseEntity<>(this.service.update(id, model), HttpStatus.ACCEPTED);
	}

	// DELETE
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> delete(@PathVariable Long id) {
		return new ResponseEntity<>(this.service.delete(id) ? HttpStatus.NO_CONTENT : HttpStatus.INTERNAL_SERVER_ERROR);
		
		/*
		 * return this.service.delete(id) ? new ResponseEntity<>(HttpStatus.NO_CONTENT)
		 *		: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		 */
	}
	
}
