package package1;
import java.util.*;
import java.util.function.*;
public class FunctionalInterface3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 BiConsumer<String, Integer> biCon2 = (name, age)->System.out.println(name+" "+age);  
//	        biCon2.accept("Peter", 28);  
	      //  disp.andThen(equals).accept(lista, listb); //disp and equals are biconsumer which accepts two lists
	
//	Consumer<String> c1=(name)->System.out.println(name+"kar");
//	Consumer<String> c2=(name)->System.out.println(name+"kar");
//	c1.andThen(c2).accept("diwa");
	
//	Function<Integer,Integer> f1=(n)->n;
//	Function<Integer,Integer> f3=(n)->111;
//	System.out.println( f1.andThen(f3).apply(1));
	//System.out.println(f1.apply(11)); 

//		  Function<String, String> half = a -> a+"c";
//		  Function<String, String> half1 = a -> a+"b";
//		  half = half.andThen(half1);
//		  System.out.println(half.apply("a"));
//		 Function<Integer, Integer> i = Function.identity();
//	        System.out.println(i.apply(10));
		
		//Predicate<Integer> p1=(a)->a<=10;
		//Predicate<Integer> p2=(a)->a>=0;
		//System.out.println(p1.and(p2).negate().test(-1));
		//System.out.println(p1.negate().test(-1));
		//System.out.println(p1.or(p2).test(-1));
		
		
//		BinaryOperator<Integer>
//        op = BinaryOperator
//                 .maxBy(
//                     (a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));
//		
//    System.out.println(op.andThen(a->a+100).apply(98, 11));
		
//		  BiPredicate<Integer, String> biPredicate = (n, s) ->
//	        {
//	            if (n == Integer.parseInt(s))
//	                return true;
//	            return false;
//	        };// Bipredicate takes two args
		
		
		
//		 BooleanSupplier sup = () -> true; //supplier won't take any argument but return boolean
//	        System.out.println(sup.getAsBoolean());
		
//		 DoubleBinaryOperator doubleBinaryOperator
//         = (a, b) -> { return a + b; };
//     System.out.println("x + y = "
//                        + doubleBinaryOperator
//                              .applyAsDouble(7, 7.0));
		
		
//		DoubleSupplier sup = () -> 12;
//        System.out.println(sup.getAsDouble());
		
//		IntConsumer ic=(x)->System.out.println(x);
//		ic.accept(1);
		
//		IntToLongFunction itdf=(x)->(long)x;
//	System.out.println( itdf.applyAsLong(10));
		
//		DoubleToLongFunction itdf=(x)->(long)x;
//		System.out.println( itdf.applyAsLong(10.01));
		
//		IntUnaryOperator uo=IntUnaryOperator.identity();
//		System.out.println(uo.applyAsInt(12));
		
		
//		ObjDoubleConsumer<String> i  = (s,d)->System.out.println(s+d);  
//	    i.accept("java2s.com ",0.1234);
//		ObjIntConsumer<Number> i  = (s,d)->System.out.println(((Integer)s)+d);  
//	    i.accept(1,1);
		
		
		
		 List<Product> list=new ArrayList<Product>();  
         
	        //Adding Products  
		 Product p1=new Product(1,"HP Laptop",25000f);
		 Product p2=new Product(1,"HP Laptop",25000f);
	       if(p1.equals(p2))list.add(p2);
//	        list.add(new Product(3,"Keyboard",300f));  
//	        list.add(new Product(2,"Dell Mouse",150f));  
	        
	          
	        System.out.println("Sorting on the basis of name...");  
	  
	        // implementing lambda expression  
	        Collections.sort(list);  
	        for(Product p:list){  
	            System.out.println(p.id+" "+p.name+" "+p.price);  
	        }  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	

}

class Product  implements
Comparable<Product>{
//Comparator<Product>{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
    @Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return id-o.id;
	}
	@Override
	public int hashCode() {
		//return Objects.hash(id, name, price);
		return 0;
	}
	@Override
	public boolean equals(Object obj) {
		
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Product other = (Product) obj;
		System.out.println("welcome");
		return id == other.id && Objects.equals(name, other.name)
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price);
	}
    
    
    
//	@Override
//	public int compare(Product o1, Product o2) {
//		// TODO Auto-generated method stub
//		return o1.id-o2.id;
//	}
    
    
    
    
}  

class HashMapBiFunctionMergeDemo {
	  public static void main(String[] args) {
	    Map<Integer, String> hashMap = new HashMap<Integer, String>();
	    String msg = " King";
	    // put()
	    hashMap.put(7, "Peter");
	    hashMap.put(5, "Philip");
	    hashMap.put(2, "Martin");
	    hashMap.put(4, null);
	    System.out.println("Initial HashMap: " + hashMap);
	    // Using merge(key, value, BiFunction)
	    BiFunction<String, String, String> f = (old, given) -> old+","+given;
	    //given.concat(msg);
	    hashMap.merge(7, "Arthur", f);
	    hashMap.merge(2, "Martin", f);
	    hashMap.merge(4, "Luther", f);
	    hashMap.merge(6, "Robert", f);
	    System.out.println("HashMap using merge() => " + hashMap);
	    System.out.println("After Merge HashMap: " + hashMap);
	    // using replaceAll(key, value, BiFunction)
	      BiFunction<Integer, String, String> f2 = (key, value) -> value.replace(msg, "");
	  //  hashMap.replaceAll(f2); //if bifunction used separately we have to give key,value,return type in bifunction but if we use lambda expression we don't need to give return type 
	    //because the lambda expression will know about return type since it is functional interface
	    hashMap.entrySet().stream().forEach(out->{
		    	//hashMap.replaceAll(f2);
	    	//hashMap.replaceAll((k,v)->"hi");
	    });
	    
	    System.out.println("HashMap using replaceAll() => " + hashMap);
	  }
	}


























