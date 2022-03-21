package package2;

public class InnerClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A1 a1=new A1();
		//A1.B1 b1=a1.new B1();
		//a1.new B1().a();
		//A1.B1 b1=new A1().new B1();
	//A1.B1.a();
//		A1 a1=new A1();
//		a1.a();

	}

}


//class A1{
//	int a;
//	void a() {
//		class A2{
//			static int a=1;
//			void a() {
//				a=1;
//				System.out.println("hello inner a");
//			}
//		}
//		A2 a2=new A2();
//		System.out.println("hello outer a");
//	}
//}
	
//	class A2{
//		void a() {
//			a=1;
//			System.out.println("hello inner a");
//		}
//	}
//}

















//class A1{
//	private int a=1;
//	class B1 extends A1{
//		 private int a=2;
//		 static void a() {
//				System.out.println("hi inner method a");
//			}
//	} //non static non local inner class
//	
//	//{this.new B1().a();}
//	
//	static void a() {
//		System.out.println("hi outer method a");
//	}
//}


//@FunctionalInterface
//interface A1{
//	//private int a=1;
//	void abs();
//	class B1 implements A1 {
//		 private int a=2;
//		 static void a() {
//				System.out.println("hi inner method a");
//			}
//		@Override
//		public void abs() {
//			// TODO Auto-generated method stub
//			
//		}
//	} //non static non local inner class
//	
//	//{this.new B1().a();}
//	
//	static void a() {
//		System.out.println("hi outer method a");
//	}
//}


//abstract class A1{
//	//private int a=1;
//	abstract void abs();
//	class B1 extends A1 {
//		 private int a=2;
//		 static void a() {
//				System.out.println("hi inner method a");
//			}
//		@Override
//		public void abs() {
//			// TODO Auto-generated method stub
//			
//		}
//	} //non static non local inner class
//	
//	//{this.new B1().a();}
//	
//	static void a() {
//		System.out.println("hi outer method a");
//	}
//}



//interface A1{
//	interface A2{
//		class A3{
//			interface A4{}
//		}
//	}
//}











//class A1{
////	void a() {
////		class B1{}  //non static local inner class
////	}
//	
////	A1(){
////		class B1{}
////	}
//	
////	{
////		class B1{}
////	}
//	
//	static void a() {
//		class B1{}
//	}
//
//}