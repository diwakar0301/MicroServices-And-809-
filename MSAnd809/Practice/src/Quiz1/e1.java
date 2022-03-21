package Quiz1;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.function.Predicate;
public class e1 extends Thread {
	
	public void run() {
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hiii");
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
//		Thread thread1 = new Thread(new MyThread());
//		Thread thread2 = new Thread(new MyThread());
//		Thread thread3 = new Thread(new MyThread());
//		Thread [] ta = {thread1, thread2, thread3}; for (int x= 0; x 
//		< 3; x++) { ta[x].start(); }
//		try (ImagePrinter iw = new ImagePrinter();ImageScanner ir = new ImageScanner(); ) {
//			
//			iw.printImage();
//			ir.scanImage();
//		}
//		 catch(Exception e) {
//		 System.out.print(e.getMessage());}
		
//		Thread t1=new e1();
//		t1.start();
//		System.out.println("main");
		
		
		
//		Set<Vehicle> vehicles = new HashSet <Vehicle> (); 
//		vehicles.add(new Vehicle (10123, 
//				"Ford")); vehicles.add(new Vehicle (10124, "BMW")); 
//				System.out.println(vehicles);

//		Hashtable<Vehicle,Integer> map=new Hashtable<>();
//		map.put(new Vehicle (10124, "BMW"),1);
//		map.put(new Vehicle (10124, "BMW"),1);
//		System.out.println(map);

		List<Product> products = Arrays.asList(new Product(1, 10), new Product (2, 
				30), new Product (2, 30));
		
				Product p = products.stream().reduce(new Product (4, 0), (p1, p2) -> { 
					//System.out.println(p1.price+" before add p1 and p2 price "+p2.price);
					p1.price+=p2.price; 
			//	System.out.println(p1.price+" after add p1 and p2 price "+p2.price);
				return new Product (p1.id, p1.price);
				
				}); 
//				
				products.add(p); 
				products.stream().parallel()
				 .reduce((p1, p2) -> p1.price > p2.price ? p1 : p2)
				 .ifPresent(System.out::println)
				//.forEach(System.out::println);
				;
		
//		List<Book>books = Arrays.asList ( new Book 
//				("Beginning with Java", 2), new Book ("A Guide to Java Tour", 3) );
//				 Collections.sort(books, new Book());
//				 System.out.print(books);
		
		
		
		
//		 ExecutorService es = Executors.newFixedThreadPool(2);
//		 Future f1 = es.submit (new Caller ("Call"));
//		 Future f2 = es.submit (new Runner ("Run"));
//		 String str1 = (String) f1.get();
//		 String str2 = (String) f2.get(); //line n1
//		 System.out.println(str1+":"+ str2);
//		
//		es.shutdown();
		
//		List<String> str = Arrays.asList ("my", "pen", "is", "your", "pen1"); 
//		Predicate<String> test = s -> { int i = 0;
//		//System.out.println(s);
//		 boolean result = s.contains ("pen");
//		// System.out.print(i++ + ":"); 
//		// System.out.println("end");
//		 return result; }; 
//		 str.stream() .filter(test)
//		 .findFirst()
//		 .ifPresent(System.out ::print)
//		// .forEach(System.out::println)
//		 ;
		
		
		
		
		
		
		
		
		
	}

}


//********************************************end of public class****************************************************************
//class MyThread implements Runnable { 
//	private static AtomicInteger count = new 
//AtomicInteger (0);
//	public void run () { int x = count.incrementAndGet(); 
//	
//System.out.print (x+"");
// } } 

//class ImageScanner implements AutoCloseable { 
//	public void close 
//() throws Exception {
// System.out.print ("Scanner closed.");
// }
// public void scanImage () throws Exception { 
//System.out.print ("Scan."); 
//throw new Exception("Unable to scan.");
// } }
//
//class ImagePrinter implements AutoCloseable { 
//public void close () throws Exception {
// System.out.print ("Printer closed.");
// 
// } public void printImage () {System.out.print("Print."); }
//}



//class Vehicle { 
//	int 
//vno; String name; 
//public Vehicle (int vno, 
//String name) { 
//this.vno = vno; 
//this.name = name; } 
//public String toString () 
//{ return vno + ":" + 
//name;
// }
//}



 class Product { int id; int price;
 public Product (int id, int price) { this.id = id; 
this.price = price;
 } public String toString() { return id + ":" + price; }
}



//class Book implements Comparator<Object> { String 
//name; double price; public Book () {} public Book(String 
//name, double price) { this.name = name; this.price = 
//price; } 
////public int compare(Book b1, Book b2) { return 
////b1.name.compareTo(b2.name);
//// } public String toString() { return 
////name + ":" + price;
//// }
//@Override
//public int compare(Object o1, Object o2) {
//	// TODO Auto-generated method stub
//	return 0;
//} }




//class Caller implements Callable<String> { String str; public Caller (String s) {this.str=s;} 
//public String call()throws Exception { return str.concat("Caller");}
//}
//class Runner implements Runnable { String str; public Runner (String s) {this.str=s;} 
//public void run () { System.out.println (str.concat ("Runner"));}
//}

