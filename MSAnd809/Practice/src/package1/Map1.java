package package1;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.*;
public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,Integer> map=new HashMap<Integer,Integer>();

		map.put(1, 111);
		map.put(2,22);
	//	map.putIfAbsent(1, 3);
	//	map.remove(2);
		
		//System.out.println(map.replace(1, 1, 11)); 
		
		//map.replaceAll((k,v)->v+5);
		
		System.out.println(map);
		
//		Set set1=map.keySet();
//		System.out.println(set1);
		
//		Set<Map.Entry<Integer,Integer>> set2=map.entrySet();
//		System.out.println(set2);
		//BiFunction<Integer,Integer,Integer> bi=(a1,b1)->a1+a1;
		//map.compute(1,(key,val)->val+1);
		//map.compute(1,bi);
		//System.out.println(map);
//		map.computeIfPresent(3,(key,val)->val+1);
//		System.out.println(map);
//		Function<Integer,Integer> bi=(a1)->1111;
//		map.computeIfAbsent(3,bi);
//		System.out.println(map);
		
	
		//set2.stream().map(out->"ddd")
		//.forEach(out->{
//			System.out.println(out.getKey());
//			System.out.println(out.getValue());
		//	System.out.println(out);
	//	});
		
//		set2.stream()
//				.forEach(out->{
//					System.out.println(out.getKey());
//					System.out.println(out.getValue());
//					System.out.println(out);
//				});
		
		
		//map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		//	map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		
	//	map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	//	map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
	
//		map.entrySet().stream().sorted((a,b)->a.getValue().compareTo(b.getValue()))
//		//.forEach(System.out::println);
//		.forEach(out->System.out.println(out.getKey()));
		
//		map
//		.entrySet()
//		.stream().map(out->out.getValue()).sorted(Collections.reverseOrder())
//		//.forEach(System.out::println);
//		.forEach(out->System.out.println(out));
		
		
		
//		Map<Integer,String> map1=new HashMap<Integer,String>();
//
//		map1.put(1, "a");
//		map1.put(2,"b");
//		
//		Map<Integer,String> map2=new HashMap<Integer,String>();
//
//		map2.put(1, "c");
//		map2.put(2,"b");
//		
//		map1.forEach(
//				(Key,value)->map2.merge(Key, value, (v1,v2)->v1.equalsIgnoreCase(v2)?v1:v1+","+v2)
//				);
//		
//		
//		
//		System.out.println(map1);
//		System.out.println(map2);
		
	}

}


