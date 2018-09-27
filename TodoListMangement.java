import java.util.Scanner;
/**
 * Write a description of class TodoListMangement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TodoListMangement
{
    public static void editTasks() {
		java.util.Scanner keybd = new java.util.Scanner(System.in);
	    

	    int choice = 1;
	    while (choice != 4) {
	      
		
		   System.out.println(">> Pick an option:  ");
			System.out.println(">> (1) Update a Task ");
			System.out.println(">> (2) Remove a Task ");
			System.out.println(">> (3) Mark a task   ");
			System.out.println(">> (4) Exit   ");
			
			try {
		        choice = keybd.nextInt();
		        keybd.nextLine();  //clear input stream
		        switch (choice) {
		          case 1:  
		            System.out.print("You choose to update a task\n ");
		            //take input from user on which task to edit
		            
		            //print task
		            
		            //get the task in the list and update it
		            
		            break;

		          case 2:  
		            
		              System.out.println("You choose to remove a task " );
		            
		            break;

		          
		            

		          case 3:
		        	System.out.println(" You choose to mark a task ");
		            
		            break;
		            
		          case 4:
			        	System.out.println(" You choose to exit ");
			            
			            break;
			       

		          default:
		            System.out.println("Sorry, but " + choice + " is not one of " +
		                "the menu choices. Please try again.");
		            break;
		        }
		      }catch (java.util.InputMismatchException ime) {
		        System.out.println("Sorry, but you must enter a number.");
		        keybd.nextLine();  //clear bad input from stream
		      }
		    }
		   
	   
	
}

}



