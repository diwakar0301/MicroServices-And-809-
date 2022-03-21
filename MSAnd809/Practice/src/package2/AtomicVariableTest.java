package package2;

import java.util.concurrent.atomic.*;

//public class AtomicVariableTest {
//	//public AtomicInteger ai=new AtomicInteger();
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	//	AtomicVariableTest avt=new AtomicVariableTest();
////		 avt.ai.set(1);
////		System.out.println(avt.ai.getAndSet(2));
////		System.out.println(avt.ai.get());
//		//System.out.println(avt.ai.doubleValue());
//
//	}
//
//}

class Counters{
	 public static Integer integer = new Integer(0);
	 public static AtomicInteger atomicInteger = new AtomicInteger(0);
	}
	class AtomicVariableTest {
	 static class Incrementer extends Thread {
	 public void run() {
	 Counters.integer++;
	 Counters.atomicInteger.incrementAndGet();
	 }
	 }
	 static class Decrementer extends Thread {
	 public void run() {
	 Counters.integer--;
	 Counters.atomicInteger.decrementAndGet();
	 }
	 }
	 public static void main(String []args) throws InterruptedException {
	 Thread incremeterThread[] = new Incrementer[1000];
	 Thread decrementerThread[] = new Decrementer[1000];

	 for(int i = 0; i < 1000; i++) {
	 incremeterThread[i] = new Incrementer();
	 decrementerThread[i] = new Decrementer();
	 incremeterThread[i].start();
	 decrementerThread[i].start();
	 }
	 for(int i = 0; i < 1000; i++) {
	 incremeterThread[i].join();
	 decrementerThread[i].join();
	 }
	 System.out.printf("Integer value = %d AtomicInteger value = %d ",
	 Counters.integer, Counters.atomicInteger.get());
	 }
	}