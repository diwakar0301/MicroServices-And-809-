package package1;

import java.util.*;
import java.util.stream.Stream;
public class Set1 {
	public static void main(String[] args) {
		
//		Set s=new HashSet<>();
//		s.add(1);
//		s.add(null);
//		s.add(2);
//		System.out.println(s);
		
//		ArrayList<String> list=new ArrayList<String>();  
//        list.add("Ravi");  
//        list.add("Vijay");  
//        list.add("Ajay");  
//            HashSet<String> set=new HashSet(list);  
//        set.add("Gaurav");  
//        Iterator<String> i=set.iterator();  
//        while(i.hasNext())  
//        {  
//        System.out.println(i.next());  
//        }  
//         System.out.println(set);
//        list.addAll(set);
//        System.out.println(list);
		
		
//		 LinkedHashSet<String> al=new LinkedHashSet<String>();  
//		  al.add("Ravi");  
//		  al.add("Vijay");  
//		  al.add("Ravi");  
//		  al.add("Ajay");  
//		  Iterator<String> itr=al.iterator();  
//		  while(itr.hasNext()){  
//		   System.out.println(itr.next());  
//		  }  
		
		
//		ArrayList<String> list=new ArrayList<String>();  
//        list.add("Ravi");  
//        list.add("Vijay");  
//        list.add("Ajay");  
//            HashSet<String> set=new LinkedHashSet(list);  
//        set.add("Gaurav");  
//        Iterator<String> i=set.iterator();  
//        while(i.hasNext())  
//        {  
//        System.out.println(i.next());  
//        }  
//         System.out.println(set);
//        list.addAll(set);
//        System.out.println(list);
		
		
	NavigableSet<String> s=new TreeSet<String>((a,b)->b.compareTo(a));
		s.add("11");
		s.add("a");
		//s.add("11");
		s.add("-11");
		//s.add(null);
		System.out.println(s);
//		System.out.println(s.tailSet("11"));
//		System.out.println(s.tailSet("1", false));
//		System.out.println(s.subSet("1", "a"));
//		System.out.println(s.subSet("1",false, "a",true));
//		System.out.println(s.lower("-12"));
//		System.out.println(s.higher("a"));
//		System.out.println(s.headSet("1"));
	//	System.out.println(s.headSet("q",true));
		//System.out.println(s.descendingSet());
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Set<String> s1=new TreeSet<String>();
//		s1.add("1");
//		s1.add("a");
//		s1.add("11");
//		s1.add("-11");
//		System.out.println(((NavigableSet)s1).headSet("1",true));
		
		
		
		
		
		
//		SortedSet<String> s1=new TreeSet<String>();
//		s1.add("1");
//		s1.add("a");
//		s1.add("11");
//		s1.add("-11");
//		System.out.println(((NavigableSet)s1).headSet("1",true));
		
	}
}
