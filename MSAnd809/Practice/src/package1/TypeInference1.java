package package1;
import java.util.*;


//you can always get Object from a list regardless of the wildcard.(super and extends)
//you can always add null to a mutable list regardless of the wildcard.

public class TypeInference1 {
	Booby b=new Booby();

	Dooby d1=new Dooby();
	Booby d2=new Dooby();
	
	Tooby t1=new Tooby();
	Dooby t2=new Tooby();
	Booby t3=new Tooby();
	//Tooby t4=(Tooby)new Booby(); //if any method called in main (or) referred in anywhere in instances causes classcast exception
	//Tooby[] bob=new Tooby[] {b,d1,d2,t1,t2,t3};
	//Booby[] bob=new Booby[] {b,d1,d2,t1,t2,t3};
	List<Booby> bob=new ArrayList<Booby>() {{add(b);
	add(d1);
	add(d2);
	add(t1);
	add(t2);
	add(t3);
	
	}};
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tooby t4=(Tooby)new Booby();// ClassCastException
//	Foo foo=new Bar();
//	foo.print();
		//Outer_Demo outer=new Outer_Demo();
		//Outer_Demo.Inner_Demo inner=outer.newInner_Demo();
//		Integer a[]=new Integer[]{1,2,3,4,5,6,7,8};
//		List<Integer> li= Arrays.asList(a);
//		li.parallelStream()
//		//.peek(System.out::println)
//		.forEachOrdered(System.out::println);
		TypeInference1 ti=new TypeInference1();
		ti.add1(new ArrayList<>());
		
		
		 
	}
	
	public void add1(List<? super Booby> dl) {
		dl.add(d1);
		dl.add(d2);
		dl.add(t1);
		dl.add(t2);
		dl.add(t3);
		dl.add(b);
		dl.add(null);
		//dl.add(t4);
		dl.get(0);
		//System.out.println(dl);
	}
	public void add2(List<?  extends Booby> dl) {
	dl.get(0);
	bob.get(3);
	}
	
	public void add3(List<? super Dooby> dl) {
		dl.add(d1);
		dl.add(t1);
		dl.add(t2);
		dl.add(null);
	//	d1.add("w");
		//dl.add(d2); 
		//dl.add(t3);
		//dl.add(b);
		dl.get(0);
	}
	
	public void add4(List<? super Tooby> dl) {
		
		dl.add(t1);
//		dl.add(t2);
//		dl.add(t3);
//		dl.add(b);
//		dl.add(d1);
//		dl.add(d2);
		dl.add(null);
		dl.get(0);
	}
	
	public void add5(List<?  extends Booby> dl) {
		
		dl.get(0);
//		bob.add(b);
//		bob.get(3);
		}
	
	
	
	
	
}

class Booby{
	int a=0;
}
class Dooby extends Booby{}
class Tooby extends Dooby{}

interface Foo{
	String name="Foo";
	void print();
}
class Bar implements Foo{
	
	String name="Bar";
	public void print() {
		System.out.println(name);
	}
}



class Outer_Demo{
	private int num =175;
	public class Inner_Demo{
		public int getNum(){
			return num;
		}
	}
}
//dl.add(b);
//t=dl.get(0);
//dl.add(t);
//b=dl.get(0);