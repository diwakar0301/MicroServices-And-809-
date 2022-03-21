package package1;
import java.util.*;
import java.util.stream.*;
public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q1=new PriorityQueue();
	
		//AbstractQueue q1=new PriorityQueue();
//		PriorityQueue<Integer> q1=new PriorityQueue<Integer>();
//		q1.add(1);
//		q1.add(3);
//		q1.add(2);
//		//System.out.println(q1.remove());
//		System.out.println(q1);
//		System.out.println(q1.peek());
//		System.out.println(q1.poll());
//
//		System.out.println(q1.peek());

		  AbstractQueue<String> pq = new PriorityQueue<>();
		  
	        pq.add("Geeks");
	        pq.add("For");
	        pq.add("Geeks");
	        //pq.add("AAAGeeks");
	  
	        System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.peek());
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
