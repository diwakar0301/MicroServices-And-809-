
	package p2;
	import p1.Movable;
	public class Donkey extends Movable{
	    public int location = 200;
	    public void move(int by) {
	        location = location+by;
	    }
	    public void moveBack(int by) {
	        location = location-by;
	    }
	    
	   
	}
