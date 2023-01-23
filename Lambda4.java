package lambdaassignment;

import java.util.ArrayList;

public class Lambda4 {
	public static ArrayList<String> removeOddLength(ArrayList<String> employeeList)
	{
		employeeList.removeIf(n->n.length()%2 !=0);
		return employeeList;
	}
	public static void main(String args[]) {
		ArrayList<String> arr=new ArrayList<>();
		arr.add("abcg");
		arr.add("dkkdnnklc");
		arr.add("lmcknc");
		arr.add("klm");
		arr.add("ahjkg");
		arr.add("abcghhkjk");
		ArrayList<String> arr1=removeOddLength(arr);
		for(String str1:arr1) {
			 System.out.println(str1);
			}
			
		}
	}


