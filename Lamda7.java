package lambdaassignment;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Lamda7 {
	
	public static String convertKeyValueToString(HashMap<String, Integer> map) {
		
		String str="";
		Set<Entry<String, Integer>> s=map.entrySet();
		
		for(Entry<String, Integer> e : s) {
			str += e.getKey()+" ";
			str +=e.getValue().toString()+" ";
		}
		return str;
	}
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("abc", 4);
		map.put("lwr", 2);
		map.put("fgh", 6);
		System.out.println(convertKeyValueToString(map));


	}
	

}
