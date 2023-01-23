package javaassignment;

public class Shape {
	public static void main(String args[]) {
		shapes ob1=new shapes();
		shapes ob2=new line();
		shapes ob3=new rectangle();
		shapes ob4=new cube();
		ob1.draw();
		ob2.draw();
		ob3.draw();
		ob4.draw();
	}
	
}
class shapes{
	public void draw() {
		System.out.println("This is shapes");
	}
}
class line extends shapes{
	public void draw() {
		System.out.println("this is line  class");
	}
}
class rectangle extends shapes{
	public void draw() {
		System.out.println("this is rectangle  class");
	}}
class cube extends shapes{
	public void draw() {
		System.out.println("this is line  cube");
	}}

