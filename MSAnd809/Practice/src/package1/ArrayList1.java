package package1;

import java.util.*;
import java.util.stream.*;
public class ArrayList1 {
	public static void main(String[] args) {
		
//		ArrayList l=new ArrayList<>();
//		l.add("b");
//		l.add(1);
//		l.stream().filter(s->(int)s>1).forEach(System.out::println);
		
//		List<String> l=new ArrayList<>();
//		l.add("b");
//		l.stream().forEach(System.out::println);
		
//		AbstractList l=new ArrayList<>();
//		l.add("b");
//		l.stream().forEach(System.out::println);
		
		//AbstractList<String> l=new AbstractList<>(); //--->cannot instantiate compilation error
	//	List<String> l=new List<>(); //--->cannot instantiate compilation error
		
	//	AbstractList<String> l=java.util.List.of("");  //compilation error --> Type mismatch: cannot convert from List<String> to AbstractList<String>
		
		
//		ArrayList li1=new ArrayList();
//		System.out.println(li1.size());
//		
//		ArrayList<String> li2=new ArrayList(3);
//		System.out.println(li2.size());
//		li2.add("1");
//		System.out.println(li2.size());
		
		
//		ArrayList<String> li3=new ArrayList(java.util.List.of("1",1));
//		System.out.println(li3.size());
//		li3.add("1");
		
//		System.out.println(li3.size());
		
//		ArrayList<String> a=new ArrayList<String>();
//		a.add("1");
//		ArrayList<String> li3=new ArrayList(a);
//		System.out.println(li3.size());
//		li3.add("1");
//		System.out.println(li3.size());
		
//		ArrayList<String> li3=new ArrayList(java.util.List.of("1",1,1,"1"));
//		//System.out.println(li3.lastIndexOf("1"));
//		System.out.println(li3.removeAll(java.util.List.of("2","1")));
//		System.out.println(li3);
		
		
		
		
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		  list.add("Mango");//Adding object in arraylist    
		  list.add("Apple");    
		  list.add("Banana");    
		  list.add("Grapes");    
		  //Traversing list through for-each loop  
//		  for(String fruit:list)     //----------->java.util.ConcurrentModificationException
//		    {
//			  list.remove(fruit);
//			 // System.out.println(fruit);  
//			  }
		
//		  Iterator itr=list.iterator();//getting the Iterator  
//		  while(itr.hasNext()){//check if iterator has the elements  
//		   System.out.println(itr.next());//printing the element and move to next  
//		   itr.remove();
//		  }  
//		System.out.println(list);
		
		
		
//		  System.out.println("Traversing list through List Iterator:");  
//          //Here, element iterates in reverse order  
//             ListIterator<String> list1=list.listIterator(list.size());  
//             while(list1.hasPrevious())  
//             {  
//                 String str=list1.previous();  
//                 System.out.println(str);  
//             }  
//             System.out.println(list);
//             while(list1.hasNext()){//check if iterator has the elements  
//      		   System.out.println(list1.next());//printing the element and move to next  
//      		 
//      		  } 
//		System.out.println(list);
		
		
//		Iterator itr=list.iterator();
//		itr.forEachRemaining(ss->System.out.println(ss));
		  
//		  Iterator itr=list.listIterator();
//			itr.forEachRemaining(ss->System.out.println(ss));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
