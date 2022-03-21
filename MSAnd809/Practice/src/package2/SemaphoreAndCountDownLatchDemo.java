package package2;

//java program to demonstrate
//use of semaphores Locks
import java.util.concurrent.*;

//A shared resource/class.
class Shared
{
	static int count = 0;
}

class MyThread extends Thread
{
	Semaphore sem;
	String threadName;
	public MyThread(Semaphore sem, String threadName)
	{
		super(threadName);
		this.sem = sem;
		this.threadName = threadName;
	}

	@Override
	public void run() {
		
		// run by thread A
//		if(this.getName().equals("A"))
//		{
			System.out.println("Starting " + threadName);
			try
			{
				// First, get a permit.
				System.out.println(threadName + " is waiting for a permit.");
			
				// acquiring the lock
			//	sem.acquire();
			
				System.out.println(threadName + " gets a permit.");
		
				// Now, accessing the shared resource.
				// other waiting threads will wait, until this
				// thread release the lock
				for(int i=0; i < 5; i++)
				{
					Shared.count++;
					System.out.println(threadName + ": " + Shared.count);
		
					// Now, allowing a context switch -- if possible.
					// for thread B to execute
					Thread.sleep(10);
				}
			} catch (InterruptedException exc) {
					System.out.println(exc);
				}
		
				// Release the permit.
				System.out.println(threadName + " releases the permit.");
			//	sem.release();
		}
		
		// run by thread B
//		else
//		{
//			System.out.println("Starting " + threadName);
//			try
//			{
//				// First, get a permit.
//				System.out.println(threadName + " is waiting for a permit.");
//			
//				// acquiring the lock
//				sem.acquire();
//			
//				System.out.println(threadName + " gets a permit.");
//		
//				// Now, accessing the shared resource.
//				// other waiting threads will wait, until this
//				// thread release the lock
//				for(int i=0; i < 5; i++)
//				{
//					Shared.count--;
//					System.out.println(threadName + ": " + Shared.count);
//		
//					// Now, allowing a context switch -- if possible.
//					// for thread A to execute
//					Thread.sleep(10);
//				}
//			} catch (InterruptedException exc) {
//					System.out.println(exc);
//				}
//				// Release the permit.
//				System.out.println(threadName + " releases the permit.");
//				sem.release();
//		//}
//	}
}

//Driver class
public class SemaphoreAndCountDownLatchDemo
{
	public static void main(String args[]) throws InterruptedException
	{
		// creating a Semaphore object
		// with number of permits 1
		Semaphore sem = new Semaphore(2);
		
		// creating two threads with name A and B
		// Note that thread A will increment the count
		// and thread B will decrement the count
		MyThread mt1 = new MyThread(sem, "A");
		MyThread mt2 = new MyThread(sem, "B");
		
		// stating threads A and B
		mt1.start();
		mt2.start();
		
		// waiting for threads A and B
		mt1.join();
		mt2.join();
		
		// count will always remain 0 after
		// both threads will complete their execution
		System.out.println("count: " + Shared.count);
	}
}




class CountDownLatchDemo
{
    public static void main(String args[]) 
                   throws InterruptedException
    {
        // Let us create task that is going to 
        // wait for four threads before it starts
        CountDownLatch latch = new CountDownLatch(1);
  
        // Let us create four worker 
        // threads and start them.
        Worker first = new Worker(1000, latch, 
                                  "WORKER-1");
        Worker second = new Worker(2000, latch, 
                                  "WORKER-2");
        Worker third = new Worker(3000, latch, 
                                  "WORKER-3");
        Worker fourth = new Worker(4000, latch, 
                                  "WORKER-4");
        first.start();
        second.start();
        third.start();
        fourth.start();
  //first.join();
        // The main task waits for four threads
       // latch.await();
  
        // Main thread has started
        System.out.println(Thread.currentThread().getName() +
                           " has finished");
    }
}
  
// A class to represent threads for which
// the main thread waits.
class Worker extends Thread
{
    private int delay;
    private CountDownLatch latch;
  
    public Worker(int delay, CountDownLatch latch,
                                    String name)
    {
        super(name);
        this.delay = delay;
        this.latch = latch;
    }
  
    @Override
    public void run()
    {
        try
        {
            Thread.sleep(delay);
          //  latch.countDown();
            System.out.println(Thread.currentThread().getName()
                            + " finished");
        }
        catch (InterruptedException e)
        
        {
            e.printStackTrace();
        }
    }
}