package package1;
import java.util.*;
public class TypeInference4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	ArrayList<A> l1=new ArrayList<A>();
		ArrayList<A1> l1=new ArrayList<>();
	//	l1.add(new B());
		a1(l1);
		
		

	}
	
	public static void a1(List<? extends A1> l1) {
		//l1.add(0,new A1());
	}

}


class A1{}
class B1 extends A1{}
class C1 extends B1{}