package package1;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class StringRegex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pattern.matches(String regex,String input)
//		Pattern p=Pattern.compile(".s",Pattern.CASE_INSENSITIVE);
//		Matcher m=p.matcher("AS");
//		System.out.println(m.matches());
	
//		  String REGEX = "ee";
//		  
//	        // create the string
//	        // in which you want to search
//	        String actualString
//	            = "ee";
//	  
//	        // create equivalent String for REGEX
//	      //  String eqREGEX = Pattern.quote(REGEX);
//	  
//	        // create a Pattern using eqREGEX
//	        Pattern pattern = Pattern.compile(REGEX);
//	  
//	        // get a matcher object
//	        Matcher matcher = pattern.matcher(actualString);
//	  
//	        // print values if match found
//	        boolean matchfound = false;
//	        while (matcher.find()) {
//	            System.out.println("found the Regex in text:"
//	                               + matcher.group()
//	                               + " starting index:"
//	                               + matcher.start()
//	                               + " and ending index:"
//	                               + matcher.end());
//	            System.out.println(matcher.matches());
//	            matchfound = true;
//	        }
//	        if (!matchfound) {
//	            System.out.println("No match found for Regex.");
//	        }
		
	       
		
		
		
		String regex = "(G*s)";
		  
        // Create a pattern from regex
        Pattern pattern
            = Pattern.compile(regex);
  
        // Get the String to be matched
        String stringToBeMatched
            = "GeeksForGeeks";
  
        // Create a matcher for the input String
        MatchResult matcher
            = pattern
                  .matcher(stringToBeMatched);
        System.out.println(matcher.groupCount());
        while (((Matcher)matcher).find()) {
            // Get the last index of match result
            //System.out.println(((Matcher)matcher).find(1));
        	
        }
		
		
//		String regex = "(Geeksa)(fora)(Forq)";
//		 
//        // Create a pattern from regex
//        Pattern pattern
//            = Pattern.compile(regex);
// 
//        // Get the String to be matched
//        String stringToBeMatched
//            = " GeeksForGeeks Geeks for For Geeks Geek";
// 
//        // Create a matcher for the input String
//        MatchResult matcher
//            = pattern
//                  .matcher(stringToBeMatched);
// 
//        // Get the number of capturing groups
//        // using groupCount() method
//        System.out.println(matcher.groupCount());
		
		
	}

}
