package Quiz1;

import java.io.IOException;
import java.nio.file.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.*;
public class e3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//List<String> cs=Arrays.asList("Java","Java EE","Java ME");
//System.out.println(cs.stream().anyMatch(w->w.equals("Java")));
//		final StringBuffer s1=new StringBuffer("Java");
//		UnaryOperator<StringBuffer> u=st1->st1.append(s1);
//		UnaryOperator<StringBuffer> c=st1->st1;
//		System.out.println(u.apply(c.apply(new StringBuffer("Course"))));
		
//		List <String> v=Arrays.asList("","George","","John","Jim");
//		Long val=v.stream().filter(x->!x.isEmpty()).count();
//		System.out.println(v.stream()
//				.filter(x->!x.isEmpty())
//				//.filter(x->!x.equals(""))
//				.count());
		
//		List <String> v=Arrays.asList("win","try","best","luck","do");
//	Predicate<String> test1 =w->{
//		System.out.println("Checking");
//		return w.equals("do");
//	};
//	Predicate<String> test2 =w->{
//	return w.length()>3;
//	};
//		long c=v.stream().filter(test2).filter(test1).count();
//		System.out.println(c);
		
//		Stream<String> stream = Files.lines(Paths.get ("C:\\Users\\Mohanraj Palanisamy\\eclipse-workspace\\Practice\\src\\Quiz1\\data.txt"));
//		 stream.forEach( c-> 
//		 System.out.println(c));
		
//		Foo<String, Integer> mark = new Foo<String, Integer> ("Steve", 100);
//	//	Foo<String, Integer> percentage = new Foo<String, Integer>("Steve", 100);
//	// Foo<Object, Object> percentage = new Foo<String, Integer>("Steve", 100); //compilation fails
//		Foo<String, String> pair = Foo.<String>twice ("Hello World!");
//		Foo<String, String> grade = new Foo <> ("John", "A");
		
		//ProductCode<Number,Integer> c1=new ProductCode<>();
		//ProductCode<Number,String> c2=new ProductCode<>();
		
//		Map<Integer,Integer> m=new HashMap<>();
//		m.put(1,10);
//		m.put(2,20);
//		BiConsumer<Integer,Integer> c = (i, j) -> {System.out.print (i + "," + j+ ";");};
//		//BiFunction<Integer,Integer,String> c1 = (i, j) -> {return i + "," + j+ ";";};
//		c.accept(1,2);
//		m.forEach(c);
		
//		List<String> nums=Arrays.asList("EE","SE");
//		String ans=nums.stream().reduce("Java",(a,b)->a.concat(b));
//		System.out.println(ans);
//		List<Products> li=Arrays.asList(new Products("TV",1000),new Products("Fridge",2000));
//		Consumer<Products> raise=e->e.setPrice(e.getPrice()+100);
//		li.forEach(raise);
//		li.stream().forEach(Products::printVal);
		
		
		
		
		
		
		
		
		
	}

}
//class Products{
//	String name;
//	Integer price;
//	public Integer getPrice() {
//		return price;
//	}
//	public void setPrice(Integer price) {
//		this.price = price;
//	}
//	public Products(String name, Integer price) {
//		this.name = name;
//		this.price = price;
//	}
//	
//	public void printVal() {
//		System.out.print(name+" Price:"+price+" ");
//	}
//}



//class ProductCode<T,S extends T>{
//	T c1;
//	S c2;
//
//}

//class Foo<K,V>
//{
//	private K key;
//	private V value;
//	
//	
//	
//	public Foo(K key, V value) {
//		this.key = key;
//		this.value = value;
//	}
//	public K getKey() {
//		return key;
//	}
//	public V getValue() {
//		return value;
//	}
//	
//	public static <T> Foo<T,T> twice(T value) {
//		return new Foo<T,T>(value,value);
//	}
//	
//}






