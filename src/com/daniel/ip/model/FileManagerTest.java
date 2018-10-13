package com.daniel.ip.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileManagerTest {

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
		void saveTaskList()
	    {
	        FileManager fileMana1 = new FileManager();
	        java.util.ArrayList<Task> arrayLis1 = (java.util.ArrayList<Task>)fileMana1.readTaskList();
	       
	        assertEquals(true, arrayLis1.isEmpty());
	    }
	
	}


