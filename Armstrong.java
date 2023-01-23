
package javaassignment;
import java.util.*;
public class Armstrong {
	public static int arm(int n)
	{
		int k = n, sum=0;
		while(k!=0)
		{
			int rem = k%10;
			sum +=Math.pow(rem, 3);
			k /=10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		//TODO AUTO-GENERATED METHOD STUB
		int num, result;
		Scanner in = new Scanner(System.in);
		System.out.println("Number:");
		num = in.nextInt();
		result = arm(num);
		if (result == num)
			System.out.println(num+" is an armstrong number");
		else
			System.out.println(num+" not an armstrong number");
		
		
	}
	
	
}

