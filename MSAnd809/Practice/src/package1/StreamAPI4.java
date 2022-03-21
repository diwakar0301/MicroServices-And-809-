package package1;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;
public class StreamAPI4 {
	
	public static void main(String[] args) {
		
//		  Stream<Integer>
//          s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//      Map<Boolean, List<Integer> >
//          map = s.collect(
//              Collectors.partitioningBy(num -> num > 3));
//
////		  Map<Boolean, Long>
////          map = s.collect(
////              Collectors.partitioningBy(
////                  num -> num > 3, Collectors.counting()));
//      
//      System.out.println("Elements in stream "
//                         + "partitioned by "
//                         + "less than equal to 3: \n"
//                         + map);
		
		
		
		
//		 Map<Integer, List<Integer>> map = Stream.of(List.of(1, 2, 3, 4, 5, 6), List.of(7, 8, 9, 10))
//                 .collect(Collectors.groupingBy(
//                                 Collection::size,
//                                 Collectors.flatMapping(
//                                        l -> l.stream()
//                                              .filter(i -> i % 1 == 0),
//                                        Collectors.toList())
//                          )
//                  );
//System.out.println(map);	
		
		
		 List<String> g
         = Arrays.asList("geeks", "for", "geeks");
     Map<String, Long> result
         = g.stream().collect(
             Collectors.groupingBy(
                num->num,
                //Function.identity(),
                 Collectors.counting()
                 ));

     // Print the result
     System.out.println(result);
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
