package com.qa.project.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.project.persistence.domain.AgentDomain;

/*
 * This interface AgentRepo is used to interact with the database and perform CRUD 
 * operations on the AgentDomain entities. The interface is annotated with @Repository 
 * which is a Spring Data annotation and indicate that this is a Spring Data repository. 
 * The interface extends JpaRepository<AgentDomain, Long> which is a Spring Data 
 * interface that provides several methods for interacting with a JPA-based data 
 * repository. By extending this interface, AgentRepo inherits all of the basic CRUD 
 * methods for working with AgentDomain entities, such as findAll(), findById(), save(), 
 * and delete() and it will be used by the service layer of the application to perform 
 * operations on the database table representing the Agent.
 */

@Repository // indicate that this is a Spring Data repository
public interface AgentRepo extends JpaRepository<AgentDomain, Long>  {
	// This interface extends JpaRepository, which provides CRUD methods for the AgentDomain entities
    // JpaRepository<AgentDomain, Long>  means it is working with AgentDomain entities with Long primary key
}
