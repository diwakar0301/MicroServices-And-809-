package package1;

//What will be the output when the following code is run?
import java.util.*;
import java.util.stream.*;

class MyRunnable extends Thread
{
   MyRunnable(String name)
   {
      new Thread(this, name).start();
   }
   public void run()
   {
      System.out.println(Thread.currentThread().getName());
   }
}


public class TestClass
{
   public static void main(String[] args)
   {
//     Thread.currentThread().setName("MainThread");
//      MyRunnable mr = new MyRunnable("MyRunnable");
//     System.out.println(Thread.currentThread().getName());
//      mr.start();
	   
//	   List<Course> cList = Arrays.asList(        
//				new Course("803", "OCAJP 7"),       
//				new Course("808", "OCAJP 8"),         
//				new Course("809", "OCPJP 8") );             
//	String s=	cList.stream().filter(c->c.getName().indexOf("8")>-1)        
//		.map(c->c.getId())       
//		.collect(Collectors.joining(" , ")); 
//	System.out.println(s);
//		cList.stream().forEach(c->System.out.println(c.getId()));
	   
	   
//	   Stream<Integer> stream = Stream.of(11, 11, 22, 33).parallel();
//	   stream.sequential().forEach(System.out::println);
   }
}

class Course{     
	 String id;    
	 String name;      
	public Course(String id, String name){         
		this.id = id; this.name = name;     }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}    
	
	
	
	
	
	
	
}