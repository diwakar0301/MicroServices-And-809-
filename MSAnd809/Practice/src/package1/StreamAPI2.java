package package1;
import java.util.*;
import java.util.stream.*;

public class StreamAPI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> li1=new ArrayList<>();
		
		li1.add(1);
		li1.add(111);
		li1.add(11);
	
		//Stream.of("AAA","BBB","CCC").parallel().forEach(s->System.out.println("Output:"+s));
		//Stream.of("AAA","BBB","CCC").parallel().forEachOrdered(s->System.out.println("Output:"+s));
	
//	li1.stream()
//	.skip(1)
//	.limit(2)
//	.forEach(System.out::println);
	
//	Optional<Integer> x=li1.stream()
//	.min((b,a)->b.compareTo(a));
//	
//	System.out.println(x.get());
//		boolean b=li1.stream().noneMatch(s->s>11);
//	System.out.println(b);
	
//		Stream<Long> stream = Stream.of(4L, 8L, 12L, 16L, 20L);
//		  
//        stream.parallel().forEachOrdered(System.out::println);
		
//		long s=li1.stream().peek(System.out::println).count();
//		System.out.println(s);
		//li1.stream().peek(System.out::println).count();
		List a=Stream.of("one", "two", "three", "four")
		  .filter(e -> e.length() > 3)
		  .peek(e -> System.out.println("Filtered value: " + e))
		  .map(String::toUpperCase)
		  .peek(e -> System.out.println("Mapped value: " + e))
		  .collect(Collectors.toList());
	System.out.println("------------------------------------------------------");	
	Stream pe=	Stream.of("one", "two", "three", "four")
		  .filter(e -> e.length() > 3)
		  .peek(e -> System.out.println("Filtered value: " + e))
		  .map(String::toUpperCase)
		  .peek(e -> System.out.println("Mapped value: " + e))
		  //.collect(Collectors.toList())
		  ;
		
		pe.forEachOrdered(System.out::println);
		
	System.out.println("------------------------------------------------------");	
	Stream pe1=	Stream.of("one", "two", "three", "four")
			  .filter(e -> e.length() > 3)
			  .peek(e -> {System.out.println("Mapped value1: "+e);})
			  .map(String::toUpperCase)
			  .peek(e -> {System.out.println("Mapped value2: "+e);})
			  .peek(e -> {System.out.println("Mapped value3: "+e);})
			  //.collect(Collectors.toList())
			  ;
		
		pe1.forEachOrdered(System.out::println);
		
		System.out.println("------------------------------------------------------");	
			Stream.of("one", "two", "three", "four")
				  .filter(e -> e.length() > 3)
				  .peek(e -> {System.out.println("Mapped value1: "+e);})
				  .map(String::toUpperCase)
				  .peek(e -> {System.out.println("Mapped value2: "+e);})
				  .peek(e -> {System.out.println("Mapped value3: "+e);})
				  //.collect(Collectors.toList())
				  .count()
				  ;
			
			//pe2.forEachOrdered(System.out::println);
		
	}

}
