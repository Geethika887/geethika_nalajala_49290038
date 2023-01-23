package lambdaassignment;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Lambda3 {
	
	static void modifyValue(Consumer<Product> c, Product p) {
		c.accept(p);
		System.out.println("updated value:"+p.getId());
	}
	
	
	static class Product{
		private String name;
		private int id;
		public Product(String name, int id) {
			super();
			this.name=name;
			this.id=id;
		}
		
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name=name;
		}
		
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id=id;
		}
	}
    static <E> void display(Supplier<E> s) {
    	System.out.println(s.get());
    }
    
    
    static int returnIdByTen(int n,Function<Integer, Integer> fun) {
    	int res=fun.apply(n);
    	return res;
    	}
    public static void main(String[] args) {
    	Product p1 = new Product("abc", 342);
    	display(()->p1.getId());
    	display(()->p1.getName());
    	
    	Consumer<Product> updateId=per->per.setId(160);
    			updateId.accept(p1);
    	        modifyValue(updateId,p1);
    	        
    	        int n=p1.getId();
    	        System.out.println(returnIdByTen(n, f->f+10));
    	
    	
    }
    

}
