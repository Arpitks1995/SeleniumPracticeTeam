package pTestCases;

import java.time.LocalDateTime;
import java.util.Date;

public class TakeTime {

public static void main(String[] args) {
	
	Date date=new Date();

	
	String time=date.toString().replaceAll(" ", "_").replaceAll(":", "_");
	System.out.println(time);
	
		
	
}

}
