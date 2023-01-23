package javaassignment;

import java.util.Scanner;

public class Grades {
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		int g,e,t,tot;
		g = ip.nextInt();
		e = ip.nextInt();
		t = ip.nextInt();
		tot = g+e+t;
		
		if(g>60 && e>60 && t>60)
		{
			System.out.println("passed");
		}
		else if(((g>60 && e>60) || (g>60 && t>60) || (e>60 && t>60)))
		{
			System.out.println("promoted");
	    }
		else
		{
			System.out.println("failed");
		}
	
		
	}

}
