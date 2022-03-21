package package1;

import java.util.*;

public class CollectionQuiz implements Comparator{

	static String[] sa= {"a","bb","c"};
	Queue<Request> container=new LinkedList<Request>();
//	Queue container=new LinkedList(); //poll() gives object
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LinkedHashSet<SIZE> hs=new LinkedHashSet<SIZE>();
//		hs.add(SIZE.TALL);
//		hs.add(SIZE.JUMBO);
//		hs.add(SIZE.GRANDE);
//		hs.add(SIZE.TALL);
//		hs.add(SIZE.TALL);
//		hs.add(SIZE.JUMBO);
//		
//		for(SIZE s:hs) {System.out.println(s);}
		
		System.out.println(Arrays.binarySearch(sa,"c",new CollectionQuiz())); 
	//	System.out.println(Arrays.binarySearch(sa,"c")); 
		//System.out.println(Arrays.binarySearch(sa,"cc",new CollectionQuiz())); 
	}
	
	
	
	
	public synchronized void addRequest(Request r) {
		
	}
public synchronized Request getRequestToProcess() {
	return container.poll();
}




@Override
public int compare(Object o1, Object o2) {
	// TODO Auto-generated method stub
	
	int s1=((String)o1).length();
	int s2=((String)o2).length();
	System.out.println((String)o1);
	System.out.println((String)o2);
	return s1-s2;
}
}

class Request{}

enum SIZE{TALL,GRANDE,JUMBO}