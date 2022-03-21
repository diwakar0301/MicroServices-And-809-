package Quiz1;
import java.io.IOException;
import java.nio.file.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.*;
public class e4 {

	public  static void main(String[] args) throws Exception, ExecutionException {
		// TODO Auto-generated method stub
//		ResourceBundle r=ResourceBundle.getBundle("Quiz1.Greetings",Locale.getDefault());
//		System.out.println(r.getObject("HELLO_MSG"));
		
//		List<String> li=Arrays.asList("Dog","Cat","Mouse");
//		Test t=new Test();
//		t.setList(li.stream().collect(Collectors.toList()));
//		t.getList().forEach(s->{
//			
//			t.printValues();
//			
//		});;
		
//		IntConsumer c=e->System.out.println(e);
//		Integer value=90;
//		ToIntFunction<Integer> funRef = e->e + 10; 
//		int result = funRef.applyAsInt (value);
//		c.accept(result);
		
//		List<Double> doubles = Arrays.asList (100.12, 200.32);
//		Function<Double,Double> funD = d->d+100.0d; 
//		DoubleStream don=doubles.stream().mapToDouble(so->so);
//		don.forEach(funD); // line n1 
//		funD.apply(12d);
//		doubles.stream(). 
//				forEach(e->System.out.println(e));
		
//		MyClass mc=new MyClass();
//		Thread a=new Thread(mc);
//		a.start();
//		Thread b=new Thread(mc);
//		b.start();
		
//		MyThread mc=new MyThread();
//		Thread a=new Thread(mc);
//		Thread b=new Thread(mc);
//		a.start();
//		b.start();
		
//		Path path1 = Paths.get("/app/./sys/");
//		Path res1 = path1.resolve("log");
//		Path path2 = Paths.get("/server/exe/");
//		Path res2 = path2.resolve("readme/");
////		System.out.println(res1);
//		System.out.println(res2);
		
//		List<String> colors = Arrays.asList("red", "greeden", "yellow0000");
//		Predicate<String> test = n -> { 
//			System.out.println(n);
//		System.out.println("Searching…"); return 
//		n.contains("reds");
//		};
//		boolean b=
//				colors.stream()
//		 .filter(c -> c.length() >= 3)
//		// .forEach(System.out::println);
//		// .noneMatch(test)
//		 .noneMatch(out->out.contains("redss"))
//		  ;
//		
//		System.out.println(b);
		
//		colors.stream().filter(c->c.length()>=100)
//		.findAny()
//		.ifPresentOrElse(out->{System.out.println(out);}
//		,()->System.out.println("novalues")
//				);
//	;
		
//		List<Emp>li = Arrays.asList(new Emp("Sam", 20), new Emp("JHohn", 60), new Emp("Jim", 51)); 
//		Predicate<Emp> agVal = s 
//				-> s.getEAge() <= 60; //line n1 
//				li = li.stream().filter(agVal).collect(Collectors.toList());
//				Stream<String> names = li.stream().map(Emp::getEName); //line n2 
//				names.forEach(n -> System.out.print(n 
//				+ " "));
		
//	Stream.of("hello")
//	.peek(System.out::println)
//	.peek(System.out::println)
//	.map(s->s)
//	.peek(System.out::println)
//	.forEach(System.out::println)
//	;
//		BookList list = new BookList(); 
//		list.add(new Book()); 
//		list.add(new TextBook()); 
//	//	list.add("hello"); 
//		System.out.println(list.count);
		
//		Optional o=Optional.ofNullable(null);
//		System.out.println(o.get());
		
	//	new e4().new Inner().doA();
		
//		try{       
//			TestClass.m2();     
//			}catch(Throwable e){    
//				System.out.println(e);
//				Throwable[] ta = e.getSuppressed();     
//				for(Throwable t : ta) {               
//					System.out.println(t.getMessage());   
//	         }    
//				}
		
		
//		TreeSet<Bookss> b=new TreeSet<>();
//		b.add(new Bookss());
//		List<Books1> books = Arrays.asList( 
//				new Books1("There is a hippy on the highway", "Thriller", "James Hadley Chase"), 
//				new Books1("Coffin from Hongkong", "Thriller", "James Hadley Chase"), 
//				new Books1("The Client", "Thriller", "John Grisham"), 
//				new Books1("Gone with the wind", "Fiction", "Margaret Mitchell") );
//		
//		Map<String, Map<String, List<Books1>>> classified = null; 
//		classified = books.stream().collect(Collectors.groupingBy(  
//				Books1::getGenre,
//				//Collectors.mapping(Books1::getAuthor, Collectors.toList())
//				Collectors.groupingBy(Books1::getAuthor,Collectors.toList())
//				
//				)); System.out.println(classified);
		
		
//		Map<String, List<Books1>> classified = null; 
//		classified = books.stream().collect(Collectors.groupingBy(  
//				Books1::getGenre
//				//,
//				//Collectors.mapping(Books1::getAuthor, Collectors.toList())
//			//	Collectors.groupingBy(Books1::getAuthor,Collectors.toList())
//				
//				)); System.out.println(classified);
		
		//e4 w=new e4();
		
		
		
	}
	
//	public void openSocket(int port)  { 
//		assert port>1000;
//		}
//	
//	void a() {}
	
	
	
	
	
	
	
//	   public Inner inner1 = new Inner()    {  
//	    	 public void doA(){  System.out.println("doing A"); }     };   
//	    	
//	    	 public void doA() { inner1.doA(); } 
//class Inner {    int value;
//void doA() {}
	
	
	

}


 class Books1 {
private int id;
private String title;
private String genre;
private String author;
private double price;

public Books1( String title, String genre, String author) {
//	super();
	//this.id = id;
	this.title = title;
	this.genre = genre;
	this.author = author;
	//this.price = price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

//constructors and accessors not shown
}




class Bookss implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class TestClass {     
	public static void m1() throws Throwable{        
		throw new Exception("Exception from m1");     }   
	
	public static void m2() throws Throwable{       
		try{             m1();   
		}catch(Exception e){         
			//Can't do much about this exception so rethrow it       
			throw e;         }finally{     
				throw new Throwable("Exception from finally");       

			}}}


















//class Book{ }
//class TextBook extends Book{ } 
//class BookList extends ArrayList<Book> {   
//	public int count = 0;     
//	public boolean add(Book o)     {      
//		if(o instanceof Book ) return super.add((Book) o);      
//		else return count++ == -1;     }
//}
// class Emp {private String 
//eName; private Integer eAge;
// 
// Emp(String eN, Integer eA) { 
//this.eName = eN; this.eAge = eA;
// } public Integer getEAge () {return eAge;} public String 
//getEName () {return eName;}
//}


//class MyClass implements Runnable{
//public int value;
//	@Override
//	public synchronized void run() {
//		// TODO Auto-generated method stub
//		while(value<100) {
//			value++;
//			System.out.println(Thread.currentThread().getName()+":"+value);
//		}
//	}
//	
//}

//class MyThread implements Runnable{
//	private String src[]= {"A","B","C"};
//	private  int count=0;
//	@Override
//	public  void run() {
//		// TODO Auto-generated method stub
//		while(count<src.length) {System.out.println(src[count]);
//		count++;
//		}
//	}
//	
//}



//class Test{
//	List<String> list=null;
//
//	public List<String> getList() {
//		return list;
//	}
//
//	public void printValues() {System.out.println(getList());}
//	public void setList(List<String> list) {
//		this.list = list;
//	}
//}