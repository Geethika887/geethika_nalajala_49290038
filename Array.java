package javaassignment;
import java.util.*;
public class Array {
	public static void main(String args[]) {
	    int arr[]= {6,8,16,15,16,22,11,33,88,90,66,55,63,67};
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();

	    for(int i =0;i<arr.length;i++) 
	    {
	    	if(arr[i] == n) {
	    		
	    		System.out.println("element is present");
	    		
	    	}
	    	else
	    	{
	    		System.out.println("not present");
	    	
	    	}
	    	break;
	    }
	    

}
}
