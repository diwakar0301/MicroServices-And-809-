package Quiz1;
//import package3.e6;
import java.io.*;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
public class e5 
//extends e6
{
//	 public void process(e6 a)    {    
//			// a.i = a.i*2;   
////		 this.i=this.i*2;
////		 this.getI();
//			 }
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		 e6 a = new e5(); 
////		 e5 b = new e5();  
////		 b.process(a);      
////		 System.out.println( a.getI() );
//		}
	
	
public static void main(String[] args) throws InterruptedException, ExecutionException  {        
//	copy("c:\\temp\\test1.txt", "c:\\temp\\test2.txt");  
//	Map<String, Integer> map1 = new HashMap<>(); 
//	map1.put("a", 1); map1.put("b", 1);
//	map1.merge("b", 1, (i1, i2)->i1+i2+100);
//	map1.merge("c", 3, (i1, i2)->{System.out.println(i2); return i1+i2+100;}); 
//	System.out.println(map1);
//	ExecutorService es =  Executors.newSingleThreadExecutor();        
//	Future<String> future = es.submit(new MyCallable());    
//	System.out.println(future.get()); //1    
//	es.shutdownNow(); //2
	
	List<Course11> cList = Arrays.asList(
	        new Course11("803", "OCAJP 7"),
	        new Course11("808", "OCAJP 8"),
	        new Course11("809", "OCPJP 8")
	);
	            
String s=	cList.stream().filter(c->c.getName().indexOf("8")>-1)
	        .map(c->c.getId())
	        .collect(Collectors.joining("1Z0-"));
System.out.println(s);
	cList.stream().forEach(c->System.out.println(c.getId()));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
}

//class MyCallable implements Callable<String>{    
//	public String call() throws Exception {   
//		Thread.sleep(5000);   
//		//System.out.println("hello call");
//		return "DONE";     } }
//
//
//class TestCla {
//
//    public static void main(String[] args) {
//
//        TreeSet<Integer> s = new TreeSet<Integer>();
//        TreeSet<Integer> subs = new TreeSet<Integer>();
//
//        for(int i = 324; i<=328; i++)
//        {
//            s.add(i);
//        }
//        s.add(329);
//        System.out.println(s);
//        subs = (TreeSet) s.subSet(326, true, 328, true );
//        subs.add(328);
//        System.out.println(s+" "+subs);
//        
//    }
//
//}

//in file Pets.java
 enum
// class
 Pets { 
	 DOG("D"), CAT("C"), FISH("F"); 
	 String prefix = "I am "; 
	String name;
	 Pets(String s) { name = prefix + s;} 
public String getData(){ return name; } }


 


class Course11{
    private String id;
    private String name;

    public Course11(String id, String name){
        this.id = id; this.name = name;
    }
    //accessors not shows

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











