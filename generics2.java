package generics_assignment1;

import java.util.HashMap;

public class generics2 {
	
		public static void main(String[] args) {
			HashMap<Integer,Double> hm=new HashMap<>();
			hm.put(654, 5.67);
			hm.put(555, 8.28);
			hm.put(456, 7.55);
			hm.put(890, 98.00);
			hm.put(234, 46.0);
			hm.put(778, 90.6);
			hm.put(890, 7.90);
			hm.put(765, 9.88);
			hm.put(455, 8.90);
			hm.put(389, 9.67);

			hm.forEach((K,V) -> System.out.println(K + " "+V));
				
		}

}
