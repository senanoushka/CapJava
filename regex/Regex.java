package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
//		String s="23This a good day, today is 22! ";
//		//String regex=".";
//		//String regex="[ads]";
//		//String regex="[^ads]";
//		//String regex="[^ads\\d]";
//		String regex="^[23]";
//		
//		Pattern pattern=Pattern.compile(regex);
//		Matcher matcher=pattern.matcher(s);
//		
//		while(matcher.find()) {
//			System.out.print(matcher.group());
//		}
		
		//Email Verification
//		String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0]+\\.[a-zA-Z]{2,6}$";
//		String email = "anoushka.sen@gmail.com";
//		
//		Pattern pattern=Pattern.compile(regex);
//		Matcher matcher=pattern.matcher(email);
//		
//		if (matcher.find()) {
//			System.out.println(matcher.group()+" "+matcher.start());
//		}
//		else {
//			System.out.println();
//		}
		
		//PhoneNumber Validation
		String regex = "^[789]\\d{9}";        //"[789]\\d{9}$"
		String text = "7599303920,9830697359";
		
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(text);
		
		if (matcher.find()) {
			System.out.println(matcher.group()+"  "+matcher.start());
		}
//		else {
//			System.out.println("Match not found");
//		}
		
		
	}

}
