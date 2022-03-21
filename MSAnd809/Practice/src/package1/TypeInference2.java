package package1;
import java.util.*;
/*
 * 
 * Upper Bounded Wildcards
The purpose of upper bounded wildcards is to decrease the restrictions on a variable.
 It restricts the unknown type to be a specific type or a subtype of that type.
  It is used by declaring wildcard character ("?") followed by the extends (in case of, class) or implements (in case of, interface) keyword, followed by its upper bound.
? extends Number

 * 
 * Unbounded Wildcards
The unbounded wildcard type represents the list of an unknown type such as List<?>. This approach can be useful in the following scenarios: -
When the given method is implemented by using the functionality provided in the Object class.
When the generic class contains the methods that don't depend on the type parameter.
 * ?
 * 
 * 
 * Lower Bounded Wildcards
The purpose of lower bounded wildcards is to restrict the unknown type to be a specific type or a supertype of that type.
 It is used by declaring wildcard character ("?") followed by the super keyword, followed by its lower bound.
 * ? super Integer
 * 
 * 
 * class A {} // super class
class B extends A {} //sub class
Any member (fields, methods) declared in super class is to be called supertype.
 * 
 * 
 * 
 */
public class TypeInference2
//<T,E> 
{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TypeInference2 t2=new TypeInference2();
//		System.out.println(t2.generic("string"));
//		System.out.println(t2.generic(123));
//		System.out.println(t2.generic(new int[] {1,2,3}));
		
		
		
		 LowerBoundWildcard1 unb1=new  LowerBoundWildcard1();
		 List<Integer> l1=Arrays.asList(1,2,3);  
		    System.out.println("displaying the Integer values");  
		   System.out.println(unb1.addNumbers(l1));  
		
	}
	
	public<E> E generic(E value) {
		return value;
	}

}

class MyGen<T>{  
T obj;  
void add(T obj){this.obj=obj;}  
T get(){return obj;}  
}

/*
T - Type
E - Element
K - Key
N - Number
V - Value
*/

class TestGenerics4{  
	  
	   public static < E > void printArray(E[] elements) {  
	        for ( E element : elements){          
	            System.out.println(element );  
	         }  
	         System.out.println();  
	    }  
	    public static void main( String args[] ) {  
	        Integer[] intArray = { 10, 20, 30, 40, 50 };  
	        Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };  
	  
	        System.out.println( "Printing Integer Array" );  
	        printArray( intArray  );   
	  
	       System.out.println( "Printing Character Array" );  
	        printArray( charArray );   
	    }   
	}  


class UpperBoundWildcard {  

  //  ArrayList<Number> al=new ArrayList<Integer>();//Type mismatch: cannot convert from ArrayList<Integer> to ArrayList<Number>
    private static Double add(ArrayList<? extends Number> num) {  
      
        double sum=0.0;  
          
        for(Number n:num)  
        {  
            sum = sum+n.doubleValue();  
        }  
          
        return sum;  
    }  
  
    public static void main(String[] args) {  
          
        ArrayList<Integer> l1=new ArrayList<Integer>();  
        l1.add(10);  
        l1.add(20);  
        System.out.println("displaying the sum= "+add(l1));  
          
        ArrayList<Double> l2=new ArrayList<Double>();  
        l2.add(30.0);  
        l2.add(40.0);  
        System.out.println("displaying the sum= "+add(l2));  
          
          
    }  
      
}  

class UnboundedWildcard {  
	  
    public static void display(List<?> list)  
    {  
          
        for(Object o:list)  
        {  
            System.out.println(o);  
        }  
          
    }  
      
      
    public static void main(String[] args) {  
          
    List<Integer> l1=Arrays.asList(1,2,3);  
    System.out.println("displaying the Integer values");  
    display(l1);  
    List<String> l2=Arrays.asList("One","Two","Three");  
      System.out.println("displaying the String values");  
        display(l2);  
    }  
  
}  



class UnboundedWildcard1 {  
	  
    public static double display(List<?> list)  
    {  
    	 double sum=0.0;  
        for(Object o:list)  
        {  
            System.out.println(o); 
            sum = sum+(Integer)o; 
        }  
        
       
        
         
          
        return sum;  
          
    }  
      
      
    public static void main(String[] args) {  
          
    List<Integer> l1=Arrays.asList(1,2,3);  
    System.out.println("displaying the Integer values");  
    display(l1);  
    List<String> l2=Arrays.asList("One","Two","Three");  
      System.out.println("displaying the String values");  
        display(l2);  
    }  
  
}  

class LowerBoundWildcard {  
	  
    public static void addNumbers(List<? super Integer> list) {  
  
        for(Object n:list)  
        {  
              System.out.println(n);  
        }  
          
      
          
    }  
public static void main(String[] args) {  
      
    List<Integer> l1=Arrays.asList(1,2,3);  
      System.out.println("displaying the Integer values");  
    addNumbers(l1);  
      
    List<Number> l2=Arrays.asList(1.0,2.0,3.0);  
      System.out.println("displaying the Number values");  
    addNumbers(l2);  
}  
  
}  

class LowerBoundWildcard1 {  
	  
    public static double addNumbers(List<? super Integer> list) {  
  
    	double sum=0.0;  
        for(Object o:list)  
        {  
            System.out.println(o); 
            //sum = sum+(Integer)o; 
        }  
       
        return sum;  
          
      
          
    }  
public static void main(String[] args) {  
//      
//    List<Integer> l1=Arrays.asList(1,2,3);  
//      System.out.println("displaying the Integer values");  
//    addNumbers(l1);  
//      
//    List<Number> l2=Arrays.asList(1.0,2.0,3.0);  
//      System.out.println("displaying the Number values");  
//    addNumbers(l2);  
}  
  
}  


class A{
	public Number a() {
		//Number n=new Integer(1);
		//Number n=new Number(1); //cannot instantiate Number
		return 1;
	}
}

class B extends A{
	public Integer a() {
	//	new Object();
		return 1;
	}
}




