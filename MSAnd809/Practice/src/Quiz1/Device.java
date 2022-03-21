package Quiz1;


import java.io.*;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

//public class Device implements AutoCloseable{
//    String header = null;
//    public Device(String name) throws IOException{
//        header = name;
//        if("D2".equals(name)) throw new IOException("Unknown");
//        System.out.println(header + " Opened");        
//    }
//
//    public String read() throws IOException{
//        return "";
//    }
//    
//    public void close(){
//        System.out.println("Closing device "+header);
//        throw new RuntimeException("RTE while closing "+header);
//    }
//    
//    public static void main(String[] args) throws Exception {
//        try(Device d1 = new Device("D1");
//            Device d2 = new Device("D2")){
//            throw new Exception("test");
//        }
//    }
//    
//}


//
//import java.io.IOException;
//
public class Device implements AutoCloseable{
    String header = null;
    public void open() throws IOException{
        header = "OPENED";
        System.out.println("Device Opened");
        throw new IOException("Unknown");
    }

    public String read() throws IOException{
        return "";
    }
    
    public void close(){
        System.out.println("Closing device");
        header = null;
        throw new RuntimeException("rte");
    }
    
    public static void main(String[] args) throws Exception {
////        try(Device d = new Device()){
////            throw new Exception("test");
    	
    	
//    	 Moo moo = new Moo();    
//    	 moo.moo = 20;   
//    	 FileOutputStream fos = new FileOutputStream("moo1.ser"); 
//   ObjectOutputStream os = new ObjectOutputStream(fos);  
//  os.writeObject(moo);     os.close();
//  
  FileInputStream fis = new FileInputStream("moo1.ser");    
  ObjectInputStream is = new ObjectInputStream(fis);   
  Moo moo1 = (Moo) is.readObject();   
 is.close();   
 System.out.println(moo1.moo);
////        }
//    	
//    	Path p1 = Paths.get("photos\\..\\beaches\\.\\calangute\\a.txt"); Path p2 = p1.normalize();  
//   
//   System.out.println(p1+"\\"+p2);
//   System.out.println(p2+"\\"+p1);
    }
    
}




class Names{    
	private List<String> list;    
	public List<String> getList() {  
		return list;     }     
	public void setList(List<String> list) {     
		this.list = list;     }    
	public void printNames(){       
		System.out.println(getList());     }     
	public static void main(String[] args) {     
		List<String> list = Arrays.asList(        
				"Bob Hope",         "Bob Dole",         "Bob Brown"        );     
		Names n = new Names();       
		n.setList(list.stream().collect(Collectors.toList()));       
		  n.getList().forEach(System.out::println);;
	
	}      }  


class Top{
	Top(int i){}
Top(){
	System.out.println(1);
	}
}

class Boo extends Top{   
	public Boo(int i){ 
		super(i);
		System.out.println("In Boo"); 
	}
	//public  Boo() {System.out.println(2);}
	
	}
class BooBoo extends Boo {   
	public BooBoo() {super(1);System.out.println(3);}
	
	
	public BooBoo(int i){super(i); System.out.println("In BooBoo"); } }
class Moo extends BooBoo implements Serializable {  
  int moo = 10; { System.out.println("moo set to 10"); }    
  public Moo(){super(100); System.out.println("In Moo"); } }




