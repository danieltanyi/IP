
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.io.FileWriter;

/**
 * Write a description of class Task here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class Task  {
	public static List<Task> Tasks = new ArrayList<>();
	

	  private String title;
	  private String status;
	  private String dateTask;
	  private String project;
	  private static FileWriter myFileWriter;
	  
	   
	  /**
	     * Creates a task with a title, status and a dateTask which can be assigned to the user project. 
	     * @param title 
	     * @param status 
	     * @param dateTask
	     * @param project
	     */ 
	    public Task(String title,String status , String project, FileWriter myFileWriter) {
			//new FileWriter("src/tasks", true)
	    	
	    	this.title=title;
			this.status=status;
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			this.dateTask=sdf.format(new Date()); 
			this.project=project;
			Task.setMyFileWriter(myFileWriter);
			
		}
	    /**
	     * Getter for the title of the Task 
	     * @return the title 
	     */
	   public String getTitleTask() {
	       return title;
	   }
	   /**
	     * Getter for the status of the Task 
	     * @return the status 
	     */ 
	   public String getStatusTask() {
	       return status;
	   }
	   /**
	     * Getter for the project of the Task 
	     * @return the project 
	     */ 
	   public String getProjectTask() {
	       return project;
	   }
	   public String getDateTask() {
		   return this.dateTask;
	   }
	   public FileWriter getFileWriterTask() {
		   return Task.getMyFileWriter();
	   }
	   /**
	     * sets the count of new local tasks 
	     */ 
	   
	   
	   public void setStatusTask(String statusupdate) { 
		   status = statusupdate; 
		}
	   public void setTitleTask(String titleupdate) { 
		   title = titleupdate; 
		}
	   public void setProjectTask(String projectupdate) { 
		   project = projectupdate; 
		}
	   public void setDateTask(String dateupdate) { 
		   dateTask = dateupdate; 
		}
	   public void setFileWriterTask(FileWriter myFileWriter) {
	   }
	   
	   

	   // Assign the status of the task  to the variable status.
	   public void taskStatus(String taskStatus) {
	      status = taskStatus;
	   }

	   /* Assign the date to the variable dateTask.*/
	   public void TaskDate() {
		   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		    dateTask = sdf.format(new Date()); 
	      
	   }

	   /* Assign the name of the project which the task belongs to it to the variable project.*/
	   public void taskProject(String taskProject) {
	      project = taskProject;
	   }

	   /* Print the Task details */
	   public void printTasks() {
	      System.out.println("Title of the task: "+ title );
	      System.out.println("Status of the task: " +status );
	      System.out.println("Date of the Task: " + dateTask );
	      System.out.println("This task belong to this Project: " + project);
	      System.out.println("");
	   }
	   
	   public static void addTask(Scanner scanner) 
		{
				
				System.out.println("adding a new task");
				System.out.println("Please Enter the Title of the Task:");
				
				String title = scanner.nextLine();
				System.out.println("Please Enter the Status of the Task:");
				
				String status = scanner.nextLine();
				System.out.println("Please Enter the Project of the Task:");
				
				
				String project = scanner.nextLine();
				
			       Tasks.add(new Task(title,status,project,getMyFileWriter()));
				
				
				
				System.out.println("Task Created");
		}
	   
	   public static void printAllTasks() {
		   
	       
	      
		   System.out.println("------------------------------------------------------------------");
	       Tasks.forEach(task -> {
	    	   System.out.println("Title of the task: "+task.getTitleTask() );
	    	      System.out.println("Status of the task: " +task.getStatusTask() );
	    	      System.out.println("Date of the Task: " +task.getDateTask() );
	    	      System.out.println("This task belong to this Project: " + task.getProjectTask());
	    	      System.out.println("Index of the task :" +Tasks.indexOf(task) );
	    	      System.out.println("");
	    	   
	       });
	       System.out.println("------------------------------------------------------------------");
	   }
	   
	   public static void editTasks() {
		   System.out.println(">> Pick an option:  ");
			System.out.println(">> (1) Update Task ");
			System.out.println(">> (2) Remove Task ");
			System.out.println(">> (3) mark task   ");
			
		   
	   }
	   
	  
	   public static  void Removal() {

		    
	       Scanner in = new Scanner(System.in);
	       System.out.println("Enter the index Element to be deleted : ");
	       
	      
	       int elem = in.nextInt();
	       
	       
	       
	                   Tasks.remove(elem);
	               
	           }
	  public static  void MarkAsDone() {

		    
	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter the index Element to be Masked as done : ");
	      
	     
	      int elem = in.nextInt();
	      
	      
	      
	                  Tasks.get(elem).setStatusTask("done");
	              
	          }
	  public static void testprinting() {
			Collections.sort(Tasks, Comparator.comparing(Task ::getProjectTask));
	      System.out.println("Sorted tasks List by project : " +Tasks);
		}
	public static FileWriter getMyFileWriter() {
		return myFileWriter;
	}
	public static void setMyFileWriter(FileWriter myFileWriter) {
		Task.myFileWriter = myFileWriter;
	}
	       
	     
	                    
	   }
	   
	   
	   
	
	   
	   