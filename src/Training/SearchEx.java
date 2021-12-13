package Training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class SearchEx {

	public static void main(String[] args) {
	    Pattern pattern = Pattern.compile("Code Lab Technology", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher("Code Lab Technology");
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }

	}

}
