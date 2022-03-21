package Quiz1;
import java.io.IOException;
import java.nio.file.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.*;
public class e2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		Stream<Path> paths = Stream.of (Paths. get("C:\\Users\\Mohanraj Palanisamy\\eclipse-workspace\\Practice\\src\\Quiz1\\data.doc"),
//				 Paths. get("C:\\Users\\Mohanraj Palanisamy\\eclipse-workspace\\Practice\\src\\Quiz1\\data.txt"), Paths. get("C:\\Users\\Mohanraj Palanisamy\\eclipse-workspace\\Practice\\src\\Quiz1\\data.xml")); paths.filter(s-> 
//				s.toString().contains("data")).forEach( s -> { try {
//				 Files.readAllLines(s)
//				 .stream()
//				 .forEach(System.out::println); //line n1
//				 } catch (IOException e) {
//					 
//					 System.out.println(e);
//				 System.out.println("Exception");
//				 }
//				 }
//				);
		
		
//		List<Emp>li = Arrays.asList
//				(new Emp("Sam", 20),
//						new Emp("John", 60), 
//						new Emp("Jim", 51)); 
//		System.out.println(li.getClass());
//		Predicate<Emp> agVal = s 
//				-> s.getEAge() > 50; //line n1 
//				li = li.stream().filter(agVal).collect(Collectors.toList()); 
////				li.add(new Emp("Sam", 20));
//				System.out.println(li.getClass());
//				Stream<String> names = 
//				li.stream().map(Emp::getEName); //line n2 
//				names.forEach(n -> System.out.print(n + " "));
		
//		UnaryOperator<Integer> uo1 = s -> s*2;// line n1
//		List<Double> 
//		loanValues = Arrays.asList(1000.0, 2000.0); 
//		loanValues.stream() 
//		 .map(lv -> uo1.apply(lv))
//		.filter(lv -> lv >= 1500)
		// .forEach(s -> System.out.print(s + "  "));
		

//		int rateOfInterest = 0; String accountType = "LOAN"; switch 
//		(accountType) { case "RD": rateOfInterest = 5; 
//		break; case "FD": rateOfInterest = 10; 
//		break; default:
//		 assert true: "No interest for this account"; //line n1
//		 }
//		 System.out.println ("Rate of interest:" + rateOfInterest);
		
		
//		List<TechName> tech = Arrays.asList ( new 
//				TechName("Java-"), new TechName("Oracle DB-"), new TechName("J2EE-")
//				);
//				Stream<TechName> stre = tech.stream();
//				stre.map(out->out.techName)
//				.forEach(System.out::print);
		
		Path source=Paths. get("C:\\Users\\Mohanraj Palanisamy\\eclipse-workspace\\Practice\\src\\Quiz1\\data1.txt");
			Path target=Paths. get("C:\\Users\\Mohanraj Palanisamy\\eclipse-workspace\\Practice\\src\\Quiz1\\data222.txt");
		
		Files.move(source, target,StandardCopyOption.REPLACE_EXISTING);
//		Files.delete(source);

//		Path source=Paths. get("C:\\Users\\Mohanraj Palanisamy\\eclipse-workspace\\Practice\\src\\Quiz1\\data1.txt");
//		Path target=Paths. get("C:\\Users\\Mohanraj Palanisamy\\eclipse-workspace\\Practice\\src\\Quiz1\\data2.txt");
//		
//		try {
//			List<String> content =Files.readAllLines(source);
//			content.stream().forEach(line->{
//				try {
//					Files.write(target,line.getBytes(),StandardOpenOption.APPEND);
//				}
//				catch(IOException e) {
//					System.out.println("inner try");
//					System.out.println(e);}
//				
//				
//			});
//		}
//		catch(IOException e) {
//			System.out.println("outer try");
//			System.out.println(e);}
		
//		try(DC dc=new DC();) //in try with resources the resource must implements AutoClosable by implicit or explicit else cause compilation fails
//		{  
//			dc.c1();
//		}
//		catch(Exception e) {}
		
//		ZoneId zone=ZoneId.of("America/New_York");
//		ZonedDateTime dt=ZonedDateTime.of(LocalDate.of(2015,3,8),LocalTime.of(1,0),zone);
//		ZonedDateTime dt2=dt.plusHours(2);
//		System.out.println(dt);
//		System.out.println(ChronoUnit.HOURS.between(dt,dt2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

//class DC implements AutoCloseable{
//	public void c1() {}
//	public void close() throws Exception{
//		throw new RuntimeException();
//	}
//}

enum Course{
	JAVA(100),J2ME(150);
	private int cost;
//	 Course(int c) { only this constructor and private constructor is valid in enum
//		this.cost=c;
//	}
	private Course(int c) {
			this.cost=c;
		}
}






//class TechName {
//	 String techName; TechName (String 
//	techName) { this.techName=techName; 
//	} } 

// class Emp{ private String 
//eName; private Integer eAge;
// 
// Emp(String eN, Integer eA) { 
//this.eName = eN; this.eAge = eA;
// } public Integer getEAge () {return eAge;} public String 
//getEName () {return eName;}
//}