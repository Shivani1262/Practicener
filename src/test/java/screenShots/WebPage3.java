package screenShots;

import java.time.LocalDateTime;

public class WebPage3 {

	public static void main(String[] args) {
		
		//To take current time
		LocalDateTime ldt = LocalDateTime.now();
		
		//To print Current Date Time
		System.out.println(ldt);
		
		//To print Current Date Time and replace ':' char with '-' char
		System.out.println(ldt.toString().replace(':', '-'));

	}

}
