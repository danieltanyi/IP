package com.daniel.ip.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaskManagementTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void addTask() {
		TaskManagement taskMana1 = new TaskManagement();
        assertEquals(false, taskMana1.equals("Scanner"));
	}
	@Test
    public void markAsDone()
    {
        TaskManagement taskMana1 = new TaskManagement();
        //TaskManagement taskMana2 = new TaskManagement();
        TaskManagement.MarkAsDone();
        

}
}
