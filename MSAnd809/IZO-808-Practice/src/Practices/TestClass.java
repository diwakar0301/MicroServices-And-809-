package Practices;


import p1.Movable;
import p2.Donkey;
public class TestClass {
    public static void main(String[] args) {
    	
    	  int i = 0 ;
    	    boolean bool1 = true;
    	    boolean bool2 = false;
    	    boolean bool  = false;
    	    bool = (bool2 &  method1("1"));  //1
    	    System.out.println(bool);
    	    bool = (bool2 && method1("2"));  //2
    	    System.out.println(bool);
    	    bool = (bool1 |  method1("3"));  //3
    	    System.out.println(bool);
    	    bool = (bool1 || method1("4"));  //4
    	    System.out.println(bool);

     	
    	
    }


static float parseFloat(String s){
	   float f = 0.0f;
	   try{
	      f = Float.valueOf(s).floatValue();
	      return f ;
	   }
	   catch(NumberFormatException nfe){
	      System.out.println("Invalid input " + s);
	      f = Float.NaN ;
	      return 1;
	   }
	   
	   finally { System.out.println("finally");  }
	 //  return f ;
	}

 public static boolean method1(String str){
    System.out.println(str);
    return true;
 }
	
}

