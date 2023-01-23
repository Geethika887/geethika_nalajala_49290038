package generics_assignment1;
import java.util.HashSet;
public class Employee {
	    int id, salary;
	    String name,department;
	    
	    public Employee(int id,String name,int salary,String department) {
	    	this.id=id;
	    	this.name=name;
	    	this.salary=salary;
	    	this.department=department;
	    }
	    	
	    	
	    	
	    	
	    	
	    	//method to display employee details
	    	public void displayDetails() {
	    		System.out.println("Employee id ="+id);
	    		System.out.println("Employee name ="+name);
	    		System.out.println("Employee salary ="+salary);
	    		System.out.println();
	    		
	    	}
	    	
	    	public static void main(String[] args) {
	    		
	    		//creating objects of class EmployeeUsingGenerics
	    		Employee empobj1 = new Employee(102,"geethika",240000,"software");
	    		Employee empobj2 = new Employee(101,"lally",670000,"analyst");
	    		Employee empobj3 = new Employee(103,"deepika",880000,"testing");
	    		Employee empobj4 = new Employee(104,"anusha",550000,"manager");
	    		
	    		//employee empobj = new Employee();
	    		
	    		//creating hashset to store the objects of class EmployeeUsingGenerics
	    		HashSet<Employee> employeeSet = new HashSet<Employee>();
	    		
	    		employeeSet.add(empobj1);
	    		employeeSet.add(empobj2);
	    		employeeSet.add(empobj3);
	    		employeeSet.add(empobj4);
	    		//employeeSet.add(empobj);
	    		
	    		//To print the data in the hashset employeeSet
	    		employeeSet.forEach(n -> n.displayDetails());
	    	}
	    }
	    
	    
	    
	   
	   