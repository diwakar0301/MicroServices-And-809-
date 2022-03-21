package package1;

import java.util.*;
import java.util.stream.Stream;

public class Collections1 {

	public static void main(String[] args) {
ArrayList<String> li=new ArrayList<>();
		
		li.add("a");
		li.add("b");
		li.add("a");
	//	ArrayList<Integer> b=new ArrayList<>();
	
	//b.addAll(a);
//	b.retainAll(List.of("a","d","c"));
	//System.out.println(a.containsAll(java.util.List.of("a","b","c")));
	//System.out.println(a);
	//b.removeAll(List.of("a","d","c"));
	//b.removeIf((aa)->{return aa.contains("a");});
//	Iterator<String> i=b.iterator();
//	while(i.hasNext()) {
//		System.out.println(i.next());
//	}
	
	//Object[] b1=b.toArray();
	
	//System.out.println(b1[1]);
	
//	String[] b2=new String[0];
//	b2=b.toArray(b2);
//	
//	for(int i=0;i<b2.length;++i)System.out.println(b2[i]);
	
	//b.parallelStream().forEach(System.out::println);
//	Spliterator<String> c=b.spliterator();
//	System.out.println(c.characteristics());
//	System.out.println(c.SORTED);
//	System.out.println(c.DISTINCT);
	
	
//boolean b=li.stream().anyMatch(a->a.contains("s"));
//	boolean b=li.stream().anyMatch(a->a=="a");
	
	//System.out.println(b);
		//long c=li.stream().count();
		
//	System.out.println(li.stream().count()); 
	
//		Stream<String> str=li.stream().distinct();
//		System.out.println(str.count());
	//System.out.println(li.stream().distinct().count()); 
	
//		 Stream.iterate(2, element->{
//			 System.out.println(element+" in iterate");
//			 return element+3;})  
//	        .filter( element->{
//	        	System.out.println(element+" in filter");
//	        	return element%7==0;})  
//	        .limit(1)  
//	        .forEach(System.out::println);  
	}
	

}
