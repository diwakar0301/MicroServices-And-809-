package package2;
import java.util.*;
import java.util.concurrent.*;
import java.util.*;

public class ConcurrenTCollection2_DelayQueue1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Vector s=new Stack();
		
		BlockingQueue<DelayObject> DQ
		= new DelayQueue<DelayObject>();

	// Add numbers to end of DelayQueue
	// using add() method
	DQ.add(new DelayObject("A", 100000));
	DQ.add(new DelayObject("B", 1));
	DQ.add(new DelayObject("C", 3));
	DQ.add(new DelayObject("D", 4));

	// print queue
	System.out.println("DelayQueue: "
					+ DQ);

	// print the head using peek() method
	System.out.println("Head of DelayQueue: "
					+ DQ.peek());

	// print the size using size() method
	System.out.println("Size of DelayQueue: "
					+ DQ.size());

	// remove the head using poll() method
	System.out.println("Head of DelayQueue: "
					+ DQ.poll());

	// print the size using size() method
	System.out.println("Size of DelayQueue: "
					+ DQ.size());

	// clear the DelayQueue using clear() method
	DQ.clear();
	System.out.println("Size of DelayQueue"
					+ " after clear: "
					+ DQ.size());

	}

	
}
//Java Program Demonstrate DelayQueue methods

class DelayObject implements Delayed {

	private String name;
	private long time;

	// Constructor of DelayObject
	public DelayObject(String name, long delayTime)
	{
		this.name = name;
		this.time = System.currentTimeMillis()
					+ delayTime;
	}

	// Implementing getDelay() method of Delayed
	@Override
	public long getDelay(TimeUnit unit)
	{
		long diff = time - System.currentTimeMillis();
		return unit.convert(diff, TimeUnit.MILLISECONDS);
	}

	// Implementing compareTo() method of Delayed
	@Override
	public int compareTo(Delayed obj)
	{
		if (this.time < ((DelayObject)obj).time) {
			return -1;
		}
		if (this.time > ((DelayObject)obj).time) {
			return 1;
		}
		return 0;
	}

	// Implementing toString()
	// method of Delayed
	@Override
	public String toString()
	{
		return "\n{"
			+ "name=" + name
			+ ", time=" + time
			+ "}";
	}
}

