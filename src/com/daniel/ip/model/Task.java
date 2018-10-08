package com.daniel.ip.model;

import java.util.Date;

/**
 *
 * This class is part of the "To do list" application. 
 * "To do list" which accept a text-based user interface, 
 *
 * This class create a task name title, date,status and project. 
 * 
 * 
 * @author  Daniel T
 */
 public class Task  {
	    private String title;
	    private String date;
	    private String status;
	    private String project;
	    
	    /**
	     * Creates a task with title, date, status and a project
	     * @param title 
	     * @param date
	     * @param status
	     * @param project
	     */ 
	    
	    public Task(String title, String date, String status, String project) {
	        this.title = title;
	        this.date = date;
	        this.status = status;
	        this.project = project;
	    }
	    
	    /**
	     * Getter for the title of the Task 
	     * @return the title 
	     */ 
	    
		public String gettitle() {
	        return title;
	    }
		
		/**
	     * Getter for the project of the Task 
	     * @return the project 
	     */ 
		
	    public String getproject() {
	        return project;
	    }
	    
	    /**
	     * Getter for the status of the Task 
	     * @return the status 
	     */ 
	    
	    public String getstatuse() {
	        return status;
	    }
	    
	    /**
	     * Getter for the date of the Task 
	     * @return the date 
	     */ 
	    
	    public String getdate() {
	        return date;
	    }
	    
	    /**
	     * sets all the count of new local tasks 
	     */ 
	    
		public void setStatusTask(String string) {
			status = string;
			
		}
		public void setTitleTask(String titlenew) {
			title = titlenew;
			
		}
		public void setDateTask(String date2) {
			date = date2;
			
		}
		public void setProjectTask(String projectnew) {
			project = projectnew;
			
		}
		public void setDateTask(Date date2) {
			
			
		}
		
		/**
	     * To string that returns "s", where s is equal to title, status,date,project
	     * @return A string with "s" of the task 
	     * This method returns the string representation of this Scanner.
	     */ 
	    @Override 
		
		public String toString() {
	        String s = "\n Title: " + title + "\n Status: " + status + " \nDate: " + date + " \nProject: " + project + "\n";
	        return s;
	    }
		
  
	}
 
 
 
 
 
 
	    

