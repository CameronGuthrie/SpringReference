package com.qa.project.persistence.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AgentDomainTest {
	
	private AgentDomain agent;
	
	@BeforeEach
	void setUp() {
		// Create a new SellerDomain object before each test
		agent = new AgentDomain(1L, "John", "Doe", "555-555-5555");
	}
	
	 // Test for the default constructor
    @Test
    void testDefaultConstructor() {
        // Create a new AgentDomain object using the default constructor
        AgentDomain defaultAgent = new AgentDomain();
        // Assert that the BuyerDomain exists (is not null)
        assertNotNull(defaultAgent);
    }

    // Test for the all arguments constructor
    @Test
    void testAllArgumentsConstructor() {
        // Create a new AgentDomain object using the all arguments constructor
        AgentDomain allArgsAgent = new AgentDomain(1L, "John", "Doe", "555-555-5555");
        // Assert that the values set in the constructor are correct
        assertEquals(1L, allArgsAgent.getId());
        assertEquals("John", allArgsAgent.getFirstName());
        assertEquals("Doe", allArgsAgent.getSurname());
        assertEquals("555-555-5555", allArgsAgent.getPhone());
    }

    @Test
    void testGetId() {
		// Assert that the id of the agent is correct
        assertEquals(1L, agent.getId());
    }
    
    @Test
    void testGetFirstName() {
		// Assert that the first name of the agent is correct
        assertEquals("John", agent.getFirstName());
    }

    @Test
    void testGetSurname() {
		// Assert that the surname of the agent is correct
        assertEquals("Doe", agent.getSurname());
    }

    @Test
    void testGetPhone() {
		// Assert that the phone number of the agent is correct
        assertEquals("555-555-5555", agent.getPhone());
    }

    @Test
    void testSetId() {
		// Set a new id for the agent and assert that it is set correctly
        agent.setId(2L);
        assertEquals(2L, agent.getId());
    }

    @Test
    void testSetFirstName() {
		// Set a new first name for the agent and assert that it is set correctly
        agent.setFirstName("Hugh");
        assertEquals("Hugh", agent.getFirstName());
    }

    @Test
    void testSetSurname() {
		// Set a new surname for the agent and assert that it is set correctly
        agent.setSurname("Mann");
        assertEquals("Mann", agent.getSurname());
    }

    @Test
    void testSetPhone() {
		// Set a new phone number for the agent and assert that it is set correctly
        agent.setPhone("999-999-9999");
        assertEquals("999-999-9999", agent.getPhone());
    }
    
}