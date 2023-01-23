package lambdaassignment;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Lambda2 {
	private int totalprice;
	private String status;
	
	public Lambda2(int totalPrice,String status) {
		super();
		this.totalprice = totalPrice;
		this.status = status;
	}
	
		public static ArrayList<Lambda2> listOfOrders(ArrayList<Lambda2> arr, Predicate<Lambda2> pr){
			
			ArrayList<Lambda2> a=new ArrayList<>();
			for(Lambda2 i: arr)
			{
				if(pr.test(i))
				{
					System.out.println("totalPrice:"+i.totalprice+" "+"Status:"+i.status);
				}
			}
			
			
			return a;
		}
		public static void main(String[] args) {
			
			
			ArrayList<Lambda2> a= new ArrayList<>();
			a.add(new Lambda2(1000000, "completed"));
			a.add(new Lambda2(1000000, "accepted"));
			a.add(new Lambda2(1000000, "pending"));
			a.add(new Lambda2(1000000, "pending"));
			a.add(new Lambda2(1000000, "accepted"));
			
			
			Predicate<Lambda2> pr=e->(e.totalprice>10000 && (e.status.contentEquals("accepted")|| e.status.contentEquals("completed")));
			listOfOrders(a, pr);
		}
}
