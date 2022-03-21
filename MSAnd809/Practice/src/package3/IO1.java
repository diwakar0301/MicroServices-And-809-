package package3;
import java.io.*;
import java.nio.*;
import java.nio.file.Path;
import java.nio.file.Paths;
public class IO1 {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		
//		FileWriter writer = new FileWriter("C:\\Users\\Mohanraj Palanisamy\\eclipse-workspace\\Practice\\src\\package3\\IO1Write");  
//	    BufferedWriter buffer = new BufferedWriter(writer);  
//	    buffer.write("Welcome to javaTpoint1");  
//	    buffer.close();  
//	    System.out.println("Success");  
		
//		 FileReader fr=new FileReader("C:/Users/Mohanraj Palanisamy/eclipse-workspace/Practice/src/package3/IO1Write");    
//         BufferedReader br=new BufferedReader(fr);    
// 
//         int i;    
//         while((i=br.read())!=-1){  
//         System.out.print((char)i);  
//         //break;
//         }  
//         br.close();    
//         fr.close();    
		
//		Path p1=Paths.get("s");
//		Path r1=p1.getRoot();
//		System.out.println(p1.toAbsolutePath());
		
		//*******************************PATH and normalize********************************
		
//		 Path path = Paths.get("D:/workspace/ContentW/Saurav_CV.docx");
//	 //     FileSystem fs =  path.getFileSystem();
//	  //    System.out.println(fs.toString());
//	      System.out.println(path.isAbsolute()); ///true
//	      System.out.println(path.getFileName()); //Saurav_CV.docx
//	      System.out.println(path.toAbsolutePath().toString()); 
//	      System.out.println(path.getRoot()); //D:\
//	      System.out.println(path.getParent()); //D:/workspace/ContentW
//	      System.out.println(path.getNameCount()); //3
//	      System.out.println(path.getName(0)); //workspace
//	      System.out.println(path.subpath(0, 2)); //workspace\ContentW
//	      System.out.println(path.toString());
//	      path=path.subpath(0, 2);
//	      System.out.println(path.getNameCount()); //2
//	      System.out.println(path.isAbsolute()); //false
//	      System.out.println(path.getFileName()); //COntentW
//	      System.out.println(path.toAbsolutePath().toString()); 
//	      System.out.println(path.getRoot()); //null
//	      System.out.println(path.getParent()); //workspace\
//	      System.out.println(path.getName(0)); //workspace
//	     System.out.println(path.subpath(0, 2)); //workspace\ContentW
//	      System.out.println(path.toString());
//	    //  Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
//	    //  System.out.println(realPath.toString());
//	      String originalPath = "d:\\data\\projects\\a-project\\..\\another-project";
//	      Path path1 = Paths.get(originalPath);
//	      System.out.println(path1);
//	      Path path2 = path1.normalize();
//	      System.out.println(path2);
	      
	      //System.out.println(path2.endsWith(Paths.get("another-project")));
	      //  System.out.println("path2 = " + path2);
		//*******************************PATH********************************
		
		
		
		
		//*******************************resolve and normalize********************************
		
//		 Path path= Paths.get("drive\\temp\\Spring\\..");
//			System.out.println(path.normalize());
		
		  Path path= Paths.get("drive\\temp\\Spring\\..");
		String passedPath="hello";
		System.out.println(path.resolve("hello"));
		
		// Path path1 = Paths.get("drive\\temp\\Spring");
//			Path path2=Paths.get("hello");
//			System.out.println(path1.resolve(path2)); //drive\temp\Spring\hello
//		System.out.println(path2.resolve(path1)); //hello\drive\temp\Spring
//		Path path2=Paths.get("C:\\drive");
//		System.out.println(path2.resolve(path1)); //C:\drive\drive\temp\Spring
//		System.out.println(path1.resolve(path2));//C:\drive
//		Path path1=Paths.get("D:\\abc");
//		 Path path2=Paths.get("C:\\drive");
//			System.out.println(path2.resolve(path1)); //D:\abc
//			System.out.println(path1.resolve(path2));//C:\drive
		
		
//		Path path1= Paths.get("..\\..\\..\\..\\..\\..\\..\\..\\..\\..\\..\\drive");
//		System.out.println(path1.normalize());
		//*******************************resolve and normalize********************************
		
		
		
		
		//*******************************Relativize********************************
		
		/*
		 * Works only for same else cause IllegalArgumentException
		 * example 1 : D:\\ and D:\\
		 * example 2 :abc and acd
		 */
		
//		 Path path1= Paths.get("D:\\drive\\temp\\Spring");
//		 Path path2=Paths.get("D:\\hello");
//		 System.out.println(path1.relativize(path2)); //..\..\..\hello
//		System.out.println(path2.relativize(path1));//..\drive\temp\Spring
//		
		

//
//   Path p1 = Paths.get("..\\c:\\temp\\test.txt");
//   System.out.println(p1.normalize().toUri());

	    
		
		
		
		
		
		//*******************************Relativize********************************
		
		
	}

}
