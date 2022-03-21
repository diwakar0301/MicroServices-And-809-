package package3;
import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
public class IO2Files1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Path p1=Paths.get("C:\\Users\\Mohanraj Palanisamy\\eclipse-workspace\\Practice\\src\\package3\\IO1Write");
Path p2=Paths.get("src1\\package3\\IO1Write");
Path p3=Paths.get("IO1Write");
//System.out.println(p2.toAbsolutePath());
//System.out.println(Files.isSameFile(p1,p2));
		//System.out.println(Files.exists(p2));
//System.out.println(Files.isDirectory(p2));
//System.out.println(Files.isRegularFile(p2));
//System.out.println(Files.isHidden(p2));

//System.out.println(Files.isExecutable(p2));
	
//Object object = Files.getAttribute(p1, "creationTime",
//		 LinkOption.NOFOLLOW_LINKS);
//		 System.out.println("Creation time: " + object);
	//System.out.println(Files.isSymbolicLink(p3));
	
//try(Stream<Path> entries = Files.list(Paths.get("."))) {
//	 entries.forEach(System.out::println);
//}
	

//try(Stream<Path> entries = Files.walk(Paths.get("."))) {
//	 entries.forEach(System.out::println);
//}






	}

}
