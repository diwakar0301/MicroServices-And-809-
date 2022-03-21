package package1;
import java.util.*;
import java.util.stream.Collectors;
public class FunctionalInterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<A2> a2=new ArrayList<>();
		a2.add(new A2());
		a2.add(new A2());
		a2.add(new A2());

	//a2.stream().forEach(A2::a1);
//		a2.stream().forEach(out->{
//			new A2().a1();
//		});
		
//		List<Integer> ia =a2.stream()
//				.map(A2::a2)
//				.collect(Collectors.toList());
//		
//		ia.forEach(System.out::println);
		
		
		//a2.stream().forEach(out->out.a3("a"));
		
		
		
		
	}

}



class A2{
	static int a=1;
	public int b=2;
	private int c=3;
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
	public static void a1() {
		System.out.println("A2 method a1");
	}

	public int a2() {
		System.out.println("A2 method a2");
		return 4;
	}
public static void a3(String... sta) {
	System.out.println(sta+ "   A2 method a3");
}


}

















//@FunctionalInterface //also called as SAM ->Single Abstract Method Interfaces
//interface A2{
//
//	  void a();
//	
//}
//
//@FunctionalInterface 
//interface B2 extends A2{
//	//void a();
//}
//
//@FunctionalInterface  //can contain any number of object class method as abstract
//interface sayable{  
//    void say(String msg);   // abstract method  
//    // It can contain any number of Object class methods.  
//    int hashCode();  
//    String toString();  
//    boolean equals(Object obj);  
//}  