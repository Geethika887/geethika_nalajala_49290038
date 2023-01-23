package collections;
import java.util.*;
public class CollectionFramework2 {
	public static void main(String args[]) {
		HashSet<String> set=new HashSet<String>();
		set.add("Apple");
		set.add("Mango");
		set.add("Banana");
		set.add("apple");
		set.add("Grapes");
		set.add("Orange");
		set.add("papaya");
		set.add("oranges");
		set.add("Apple");
		set.add("Kiwi");
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
