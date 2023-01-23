package collections;

public class Contact {
	public static Object gender;
	long PhNumber;
	String Name;
	String Email;
	
	public Contact(long i, String string, String string2 ) {
		this.PhNumber=i;
		this.Name=string;
		this.Email=string2;
	}
	public Long getPhNumber() {
		return PhNumber;
		
	}
	public String getName() {
		return Name;
	}
	public String getEmail() {
		return Email;
	}
	public char[] getG() {
		return null;
	}

}
