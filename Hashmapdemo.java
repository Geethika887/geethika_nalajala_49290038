package javaassignment;
import java.util.HashMap;

public class Hashmapdemo {

	public static void main(String[] args) {
		    HashMap<String, Integer> people = new HashMap<String, Integer>();


		    // Add keys and values (Name, Age)
		    people.put("John", 32);
		    people.put("Steve", 30);
		    people.put("Angie", 33);
		  
		    
		    //get value
		    System.out.println(people.get("John"));
		    
		   
		    
		   

		      for (String i : people.keySet()) {
		      System.out.println("key: " + i + " value: " + people.get(i));
		    }
		  }
		}


