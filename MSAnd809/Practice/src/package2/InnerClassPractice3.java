package package2;

import java.util.TreeSet;
import static package2.TestOuter.TestInner;
public class InnerClassPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new TestClass().m1();
//		TreeSet<SIZE> hs=new TreeSet<SIZE>();
//		hs.add(SIZE.TALL);
//		hs.add(SIZE.JUMBO);
//		hs.add(SIZE.GRANDE);
//		hs.add(SIZE.TALL);
//		hs.add(SIZE.TALL);
//		hs.add(SIZE.JUMBO);
//		//for(SIZE s:hs)System.out.println(s);
//		hs.stream().sorted((a,b)->a.compareTo(b)).forEach(System.out::println);
		
//		 Office off = new HomeOffice();  //1   
//		 System.out.println(off.getAddress1()); //2
		TestOuter.TestInner ti= new TestOuter.TestInner();
		// TestInner ti2=new TestOuter.TestInner();
		TestInner ti2=new TestInner();
		
	}

}

//enum Title {     MR("Mr. "), MRS("Mrs. "), MS("Ms. ");   
//	private String title;    
//	private Title(String s){    
//		title = s;     }     
//	public String format(String first, String last){  
//	return title+" "+first+" "+last;     } }
//
//class TestClass{ 
//	void someMethod() { 
//		System.out.println(Title.MR.format("Rob", "Miller")); } }

//class Outer {   
//	Outer(int a){}
//	private void Outer() { }   
//protected class Inner    {    } }

//class TestClass implements T1, T2{
//	   public void m1(){}
//	}
//	interface T1{
//	   int VALUE = 1;
//	   void m1();
//	}
//	interface T2{
//	   int VALUE = 2;
//	   void m1();
//	}



//interface Account{  
//	public default String getId(){  
//		return "0000";   } }  
//interface PremiumAccount extends Account{   
//	public String getId(); }
//public class BankAccount implements PremiumAccount{ 
//	public static void main(String[] args) {      
//		Account acct = new BankAccount();     
// System.out.println(acct.getId());   }  }



//enum SIZE{JUMBO,GRANDE,TALL}



//interface House{  
//	public default String getAddress(){     
//return "101 Main Str";   } }  
//abstract class Office { 
// public static String getAddress1(){    
//	 return "101 Smart Str";   } } 
////interface WFH extends House, Office{ }  
//class HomeOffice extends Office implements House{  
//	public String getAddress(){     
//return "R No 1, Home";   }
//	} 
class TestOuter {    public static class TestInner    {    } }
interface A{default void a() {}}
class B implements A{
	//public static void a() {}
}

















