package javaassignment;

public class persistance {
	public static void main(String args[]) {
		
	}
	
}
abstract class persistance1{
	void persist() {
		System.out.println("This is persistance");	
	}
}
class filepersistance{
	void persist( ) {
		System.out.println("this is file persistance");
	}
}
abstract class Databasepersistance{
	void persist() {
	System.out.println("this is databasepe persistance");
	}
}