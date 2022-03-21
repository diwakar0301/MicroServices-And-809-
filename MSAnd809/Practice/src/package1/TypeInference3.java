package package1;
import java.util.*;
public class TypeInference3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//ArrayList<Object> l1=new ArrayList<Object>();  
	//	ArrayList<String> l1=new ArrayList<String>();  
	
	      //  l1.add("10");  
	        //l1.add("30");  
	     //   a1(l1);//both Object and String type works for<?>
	      //  a2(l1);// both Object and String type works for <? extends Object>
	      //  a2(l1);//String type works for <? extends String> but Object type won't work for  <? extends String>
	        
	       // a3(l1);//both Object and String type works for <? super String>
	        //a3(l1);//    Object type works for <? super Object> but String type won't work for  <? super Object>
		
		ArrayList<Object> l1=new ArrayList<Object>();
		//ArrayList<Number> l1=new ArrayList<Number>();  
		// ArrayList<Integer> l1=new ArrayList<Integer>();  
	        l1.add(10);  
	        l1.add(20);  
	      
	      //  a1(l1);//All type works for <?>
	       // a4(l1);  //All type works for <? extends Object>
	      // a4(l1);//Object type won't work for <? extends Number> but both Number and Integer type work for <? extends Number>
	         //a4(l1);// both Number and Object type won't work for <? extends Integer> but Integer type work for <? extends Integer>
	      //  a5(l1);//All type works for <? super Integer>
	        //a5(l1);//Both Object and Number works for <? super Number> but Integer won't work for <? super Number>
	        a5(l1);//both Number and Integer won't work for <? super Object> but Object work for <? super Objec>
	}

	public static void a1(List<?> l1) {
//l1.add("ssasa");
		System.out.println(l1);
		
	}
	
	
	public static void a2(List<? extends String> l1) {
//l1.add("ss");
		System.out.println(l1);
		
	}
	
	public static void a3(List<? super Object> l1) {
		l1.add("ss");
				System.out.println(l1);
				
			}
	public static void a4(List<? extends Integer> l1) {
		//l1.add(30);
				System.out.println(l1);
				
			}
	public static void a5(List<? super Object> l1) {
		l1.add(30);
				System.out.println(l1);
				
			}
	
	
	
}


