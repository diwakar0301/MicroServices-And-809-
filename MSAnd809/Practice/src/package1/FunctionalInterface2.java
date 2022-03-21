
package package1;
import java.util.*;
import java.util.function.*;
public class FunctionalInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<B3> a2=new ArrayList<>();
		a2.add(new B3());
		a2.add(new B3());
		a2.add(new B3());
		BiConsumer<String,String > bi=B3::a1;
		bi.accept("a", "b");
	
		a2.stream().forEach(B3::a);
	}

}

interface A3{
	void a(String... arg);
}

class B3 implements A3{

	//@Override
	static void a1(String... arg) {
		// TODO Auto-generated method stub
		System.out.println(arg[0]+" "+arg[1]);
	}
	void a2() {
		// TODO Auto-generated method stub
		System.out.println("hii non satatic");
	}

	@Override
	public void a(String... arg) {
		// TODO Auto-generated method stub
		System.out.println("hi abstract");
		
	}
	
}