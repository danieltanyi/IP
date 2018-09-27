import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
/**
 * Write a description of class Task here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Task
{
    public static List<Task> Tasks = new ArrayList<>();

	  private String title;
	  private String status;
	  private String dateTask;
	  private String project;
	  private String[] todo;
	  private int count;     //how many tasks have been added to todo
      private int edit;

	   // This is the constructor of the class Task
	    public Task(String title,String status , String project ) {
			this.title=title;
			this.status=status;
			SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
			this.dateTask=sdf.format(new Date()); 
			this.project=project;
			this.todo = new String[5];
			this.count=count;
			this.edit=edit;
			
		}
	   public String getTitleTask() {
	       return title;
	   }
	   public String getStatusTask() {
	       return status;
	   }
	   public String getProjectTask() {
	       return project;
	   }
	   public String getDateTask() {
		   return this.dateTask;
	   }
	   public int getSize() {
		    return count;
		  }
	   public String toString() {
			  
			
		    String output = ">> Welcome to ToDoly:\n";
		    
		    
		    for (int i = 0; i < this.count; i++) {
		      output += (i + 1) + ". " + this.todo[i] + "\n";
		    }
		    return output;
		    
		  }
	   

	   // Assign the status of the task  to the variable status.
	   public void taskStatus(String taskStatus) {
	      status = taskStatus;
	   }

	   /* Assign the date to the variable dateTask.*/
	   public void TaskDate() {
		   SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
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
				
			       Tasks.add(new Task(title,status,project));
				
				
				
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
	   
	 /**  public static void Removal() {

		    
	       Scanner in = new Scanner(System.in);
	       System.out.println("Enter Element to be deleted : ");
	       
	      
	       int elem = in.nextInt();
	       
	       
	       for(int i1 = 0; i1 < Tasks.size(); i1++){
	           
				if(Tasks.indexOf(i1) == elem){
	               // shifting elements
	               for(int j = i1; j < Tasks.size() - 1; j++){
	                   Tasks.indexOf(i1) = Tasks.
	               }
	               break;
	           }
	       }
	     
	       System.out.println("Elements -- " );
	       for(int i = 0; i < Tasks.size() ;i++){
	           System.out.print(" " + Tasks[i1]);
	       }                
	   }
	   **/
	   
	   public String remove(int index) {
		    if (index < 1 || index > this.count) {
		      return null;  //no such element
		    }else {
		      index--;  //convert to 0-based indexing used by array
		      String deleted = this.todo[index];
		      //delete by shifting everything down into removed item's space
		      for (int i = index; i < this.count - 1; i++) {
		        this.todo[i] = this.todo[i + 1];
		      }
		      this.count--;  //removed an element
		      return deleted;
		    }
		  }

	   
	}



