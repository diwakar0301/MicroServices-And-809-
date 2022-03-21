package package3;
import java.util.*;
public class e6 {
	 protected int i = 10;     
	 protected static int getI() { return 12; }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book111> books = Arrays.asList(         new Book111("Gone with the wind", "Fiction"),         new Book111("Bourne Ultimatum", "Thriller"),         new Book111("The Client", "Thriller") );
	
		Reader r = b->{     System.out.println("Reading book "+b.getTitle());   }; 
		books.forEach(x->r.read(x));
	
	
	}

}
class Book111 {    private String title;  
private String genre;   
public Book111(String title, String genre){     
	this.title = title; this.genre = genre;    }    //accessors not shown }
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}



}

interface Reader{ void read(Book111 b); default void unread(Book111 b) {} }