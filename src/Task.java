import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
/**
 * Write a description of class Task here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Task implements Serializable {
	 private String title;
	 private String status;
	 private Date dateTask = new Date();
	 private String project;

	  
	   /**
	     * Creates a task with title, status, dateTask and a project
	     * @param title
	     * @param status
	     * @param dateTask
	     * @param project 
	     */
	   public Task(String title,String status, Date dateTask , String project)
	   {
	        this.title=title;
	        this.status=status;
	        this.dateTask=dateTask;
	        this.project=project;
	        
	        
	    }
	  
	  private void writeObject(ObjectOutputStream oos) throws IOException
	  {
		  oos.defaultWriteObject();
		  //oos.writeObject(obj);
	  }
	  
	  private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException 
	  {
		  ois.defaultReadObject();
	  }
	    /**
	     * Getter for the title,status,project,dateTask of the Task 
	     * @return the title ,status,project, dataTask
	     */ 
	  
	  public String getTitleTask()
	       {
	           return title;
	       }
	  public String getStatusTask()
	       {
	           return status;
	       }
	  public String getProjectTask()
	       {
	           return project;
	       }
	  public Date getDateTask()
	       {
	           return dateTask;
	       }
	  
	  public void setStatusTask(String statusupdate)
	      {
	           status = statusupdate;
	       }
	  public void setTitleTask(String titleupdate)
	      {
	           title = titleupdate;
	       }
	  public void setProjectTask(String projectupdate)
	      {
	           project = projectupdate;
	       }
	  public void setDateTask(Date datenew)
	      {
	           dateTask = datenew;
	       }


	    /**
	     * To string that returns and print the Task details  
	     */ 



	  public String toString() {
	       String s = "\n Title: "+ title + " Status: " +status + " Date: " + dateTask + " Project: " + project + "\n";
	     return s;
	  }

	}


