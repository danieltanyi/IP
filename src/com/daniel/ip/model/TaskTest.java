package com.daniel.ip.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaskTest {

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
	void gettitle() {

        Task task1 = new Task("Shopping", "2017-12-12", "Done", "New");
        assertEquals("Shopping", task1.gettitle());
			}
	@Test
     void getProject()
    {
        Task task1 = new Task("Playing", "2018-12-12", "Finished", "KTHIP");
        assertEquals("KTHIP", task1.getproject());
    }

    @Test
     void getStatuse()
    {
        Task task1 = new Task("Sleeping", "2019-09-19", "to do", "development");
        assertEquals("to do", task1.getstatuse());
    }
    @Test
     void getDate()
    {
        Task task1 = new Task("development", "2019-09-19", "to do", "home activity");
        assertEquals("2019-09-19", task1.getdate());
    }
    @Test
     void printAllTask()
    {
        Task task1 = new Task("home activity", "2019-09-19", "to do", "development");
        assertEquals("\n Title: home activity\n Status: to do \nDate: 2019-09-19 \nProject: development\n", task1.toString());
    }


}
