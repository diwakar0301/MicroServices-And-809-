package demo;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
public class example2 
//implements i2
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(i2.name);
//		System.out.println(i2.s1);
//		System.out.println(((i1)new example2()).name);

		
		
		Runnable r=()->System.out.println("HI");
		new Thread(r).start();

	}

}

//interface i1{
//	String name="N1";
//	String s1="S1";
//}
//
//interface i2 extends i1{
//	String name="N2";}

//class A{
//	A(){
//		System.out.println("A");
//	}
//	static class B{
//		B(){
//			System.out.println("B");
//		}
//	}
//}
//class C extends A.B{
//	
//}

class Tree 
//implements Comparable<Tree>
{
	public static void main(String[] args) {
		TreeSet<Tree> t=new TreeSet<>();
	
		//t.add(null);
		t.add(new Tree());
	}

	
	
}

