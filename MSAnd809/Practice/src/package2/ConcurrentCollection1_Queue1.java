package package2;

import java.util.*;
import java.util.concurrent.*;

public class ConcurrentCollection1_Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int capacity = 1;

		// create object of ArrayBlockingQueue
		BlockingQueue<String> q1=new ArrayBlockingQueue(2,true,new ArrayList() {{add("a");
		add("b");
	//	add("c");
		}});
		BlockingQueue<String> queue
			= new LinkedBlockingQueue<String>();

		// Add elements to ArrayBlockingQueue using put
		// method
		
		queue.add("StarWars");
		//queue.add("SuperMan");
//		queue.add("Flash");
//		queue.add("BatMan");
//		queue.add("Avengers");

		// print Queue
		System.out.println("queue contains " + queue);

		// remove some elements
	//queue.remove();
		queue.remove();

		// Add elements to ArrayBlockingQueue
		// using put method
//		queue.add("CaptainAmerica");
//		queue.add("Thor");
		

		System.out.println("queue contains " + queue);
	}

}
