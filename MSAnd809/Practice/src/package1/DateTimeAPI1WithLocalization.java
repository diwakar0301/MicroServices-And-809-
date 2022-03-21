package package1;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.*;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.util.stream.*;
public class DateTimeAPI1WithLocalization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//LocalDate ld=LocalDate.now();//2022-02-10
//LocalDateTime ldt=ld.atTime(23,59,59,999999999);//2022-02-10T23:59:59.999999999
//int val1=ld.compareTo(LocalDate.of(2022,Month.MARCH,11)); /*
//for different year gives  a's year - b's year
//for same year different month gives a's month - b's month
//for same year same month different day gives a's day-b's day
//
//*/
//LocalDate ld1=LocalDate.of(2022,Month.NOVEMBER,11);
//boolean val2=ld.equals(ldt);//true or false
//String val3=ld1.format(DateTimeFormatter.ofPattern("MMMM/dd/yyyy"));
//
///*
// * mm is minute gives run time exception
// * M 1
// * MM 01
// * MMM Jan
// * MMMM January
// * y yyyy 2022
// * yy 22
// */
//
//
//System.out.println(val3);
		
//		Locale locale1 = new Locale.Builder()
//				  .setLanguage("fr")
//				  .setRegion("CA")
//				  .setVariant("POSIX")
//				  .setScript("Latn")
//				  .build();
//		Locale locale2 = new Locale("pl", "PL", "UNIX");
//		Locale japan = Locale.JAPAN;
//		Locale japanese = Locale.JAPANESE;
//		Locale defaultLocale = Locale.getDefault();
//		
//		Locale[] numberFormatLocales = NumberFormat.getAvailableLocales();
//		Locale[] dateFormatLocales = DateFormat.getAvailableLocales();
//		Locale[] locales = Locale.getAvailableLocales();
		
		//Stream.of(locales).forEach(System.out::println);
		//Stream.of(dateFormatLocales).forEach(System.out::println);
		//Stream.of(numberFormatLocales).forEach(System.out::println);
		
		
//		ResourceBundle rb = ResourceBundle.getBundle("package1.Message1");
//	
//		System.out.println(rb.getString("name"));
		
//		ResourceBundle rb = ResourceBundle.getBundle("package1.Message2_en_US");
//		
//		System.out.println(rb.getString("greeting"));
		
//		ResourceBundle rb = ResourceBundle.getBundle("package1.Message3", Locale.getDefault());  
//		System.out.println(rb.getString("greeting"));
		
		  Locale.setDefault(new Locale("in"));  
		  System.out.println(Locale.getDefault());
		  ResourceBundle  bundle = ResourceBundle.getBundle("package1.Message4",Locale.getDefault());  
		  System.out.println("Message in "+Locale.getDefault()+":"+bundle.getString("greeting"));  
		
		/*
		 * Cause MissingResourceException if invalid key given (or) if invalid filename given
		 */
		
		
		
		
		
		
		
		
		
	}

}
