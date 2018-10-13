package com.daniel.ip.model;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.ArrayList;



public class FileManager 
{
	public void saveTaskList(List<Task> taskList) 
	{
    	try{
    		

            FileOutputStream fos= new FileOutputStream("/Users/tmp-sda-1160/eclipse-workspace/IP/src/test.txt");
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            for(Task task: taskList) 
            {
           	 oos.writeObject(task.toString());
            }
            
            oos.close();
            fos.close();
            
            
          }catch(IOException ioe){
               ioe.printStackTrace();
           }
       
		
	}
	
	public List<Task> readTaskList() 
	{
		List<Task> list = new ArrayList<>();
		
		try {
			FileInputStream fis = new FileInputStream("/Users/tmp-sda-1160/eclipse-workspace/IP/src/test.txt");
			ObjectInputStream ios = new ObjectInputStream(fis);
			
			// do the reading thing
			
			
            fis.close();
            ios.close();
            
		}catch(IOException ioe){
            ioe.printStackTrace();
        }
		return list;
        
        
	}
	

}
