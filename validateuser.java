package javaassignment;
import java.util.*;
public class validateuser {
	public static void main(String args[]) {
		int c=0;
				
	     String user1="geethu";
	     String pass1="Kushi";
	     for(int i=0;i<3;i++) {
	    	 Scanner sc=new Scanner(System.in);
	    	 String user=sc.nextLine();
	    	 Scanner s1=new Scanner(System.in);
	    	 String pass=s1.nextLine();
	    	 
	    	 
	    	 if((user.equals(user1)) && (pass.equals(pass1))) {
	    		 System.out.println("WELCOME"+user);
	    		 System.exit(0);
	    		 
	    	 
	    	 }
	    	 
	    	 else {
	    		 c+=1;
	    	 }
	    	 
	    	 if (c==3){
	    		 System.out.println("contact admin");
	    	 }
	     }
	}

}
