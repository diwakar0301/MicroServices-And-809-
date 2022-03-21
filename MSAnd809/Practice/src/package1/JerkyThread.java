package package1;

class JerkyThread extends Thread {    
	private int data = 0;    
	
	private boolean done = false;    
	
	public JerkyThread(int x){      
	
		super(); 
		
		this.data = x;  
		
		}     
	public synchronized int getData(){   
		
		return data;      
		}         
	public synchronized boolean isDone(){ return done; }    
	
	public synchronized void run() {  
//		System.out.println("hi"+Thread.currentThread().getName());
//		System.out.println("hello data before "+data);
		data += data;   
//		System.out.println("hello data after"+data);
//		System.out.println("hello done before"+done);
		done = true;   
//		System.out.println("hello done after"+done);
		}          
	
	
	public static void main(String[] args) throws Exception     {         
		JerkyThread[] jta = new JerkyThread[3];       
		
		for(int i=0; i<3; i++) {  
		System.out.println("hi"+i);
		
			jta[i] = new JerkyThread(i); 
			 jta[i].start();         }   
		System.out.println("in for"+jta[0].isDone()); 
		System.out.println("in for"+jta[1].isDone()); 
		System.out.println("in for"+jta[2].isDone()); 
		for(JerkyThread jt : jta) {  
		System.out.println(jt.isDone());          
			if(jt.isDone()) {
				System.out.println(jt.getData()); 
				}
			}
				   
				}     }  