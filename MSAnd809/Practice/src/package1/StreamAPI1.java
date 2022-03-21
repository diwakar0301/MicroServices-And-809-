package package1;

import java.util.*;
import java.util.stream.*;

public class StreamAPI1 {
	public static void main(String[] args) {
		ArrayList<String> li1=new ArrayList<>();
				
				li1.add("abcede");
				li1.add("bx");
				li1.add("acds");
			//	List<Integer> li2=new ArrayList<>();
			//	
//				li2=li1.stream()
//						//.skip(1)
//						.filter(s->s.length()>=2)
//						//.skip(1)
//						.map(s->s.length())
//						//.skip(1)
//						.sorted()
//					//	.skip(1)
//					//	.sorted(Collections.reverseOrder())
//						//.sorted((a,b)->b.compareTo(a))
//						//.sorted((a,b)->a.compareTo(b))
//						.collect(Collectors.toList());
//						
//				System.out.println(li2);
				
//				 Stream.iterate(0,element->{
//					 System.out.println(element+" in iterate");
//					 return element+3;})  
//			        .filter( element->{
//			        	System.out.println(element+" in filter");
//			        	return element%7==0;})  
//			        .limit(2)  
//			        .forEach(System.out::println);  
				
			
					
//				IntStream	li2=li1.stream()
//							.filter(s->s.length()>=2)
//							.mapToInt(s->s.length());
							
			
				
//				List evens = Arrays.asList(2, 4, 6);
//				List odds = Arrays.asList(3, 5, 7);
//				List primes = Arrays.asList(2, 3, 5, 7, 11);
//				List numbers = (List) Stream.of(evens, odds, primes,li1) 
//				//.flatMap(list -> list.stream()) 
//						.map(list -> list.stream()) 
//						.collect(Collectors.toList());
//
//				numbers.stream().forEach(sss->{
//					System.out.println(sss.getClass());
//				});
				
				
				
				String[] input = { "A,a,ab,abc,a4", "B,b,bc,bdc","A,c,c,c" };

//				Map<String, List<String>> result = Stream.of(input)
//						//Arrays.stream(input)
//				            .map(
//				            		e ->
//				            		{System.out.println(e);
//				            			return e.split(",");}
//				            		)
//				            .filter(a -> 
//				            {
//				            	System.out.println(a[0]);
//				            return a.length >= 2;
//				            }
//				            )
//				            .collect(Collectors.toMap(
//				                    a -> a[0],
//				                    a -> { 
//				                    	List<String> pika=Arrays.asList(a).subList(1, a.length);
//				                    	System.out.println("HII");
//				                    	System.out.println(pika);
//				                    	return pika;}
//				                    ,
//				                    (a, b) -> 
//				                    	{
//				                    		System.out.println(a);
//				                    		System.out.println(b);
//				                    		List<String> pika1=  Stream.concat(a.stream(), b.stream()).collect(Collectors.toList());
//				                    		System.out.println(pika1+ " pika");
//				                    		System.out.println("HELLO");
//				                    		return pika1;}
//				                    ));
//
//				System.out.println(result);
				
				Map<Object, List<Object>> result = Stream.of(input)
						//Arrays.stream(input)
				            .map(
				            		e ->
				            		{System.out.println(e);
				            			return e.split(",");}
				            		)
				            .filter(a -> 
				            {
				            	System.out.println(a[0]);
				            return a.length >= 2;
				            }
				            )
				            .collect(
				            		
				            		Collectors.groupingBy(
				            		
				            		a->a[0],
				            		Collectors.flatMapping(
				            			
				            				l->{
				            					List<String> pika=Arrays.asList(l).subList(1, l.length);
				            					
				            					Stream<String> aa=pika.stream();
				            					
				            					return aa;},
				            			
				            				Collectors.toList())
				            		
				            		)
				            		)
				            ;

				System.out.println(result);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
