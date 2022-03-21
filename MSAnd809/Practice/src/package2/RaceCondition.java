package package2;

import java.util.concurrent.atomic.*;

class Counter {
	//AtomicReference<String> a;
	// public static long count = 0;
	public static AtomicInteger count=new AtomicInteger(0);
	}
	// This class implements Runnable interface
	// Its run method increments the counter three times
	class UseCounter implements Runnable {
	 public void increment() {
	 // increments the counter and prints the value
	 // of the counter shared between threads
//	 Counter.count++;
//	 System.out.print(Counter.count + " ");
		
		 System.out.println( Counter.count.incrementAndGet());
	 }
	 public  void run() {
		// synchronized(RaceCondition.class) {
	 increment();
	 increment();
	 increment();}
//	 }
	}
	// This class creates three threads
	public class RaceCondition {
	 public static void main(String args[]) throws Exception {
	 UseCounter c = new UseCounter();
	 Thread t1 = new Thread(c);
	 Thread t2 = new Thread(c);
	 Thread t3 = new Thread(c);
	 t1.start();
	// t1.join();
	 t2.start();
	// t2.join();
	 t3.start();
	// t3.join();
//	 t1.run();
//	 t2.run();
//	 t3.run();
	 }
	}
	
//	class A{}