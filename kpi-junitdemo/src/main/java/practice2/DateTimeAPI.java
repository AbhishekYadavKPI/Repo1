package practice2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI {
	public static void  LocalDateTime() {
		LocalDate date = LocalDate.now();
		System.out.println("The current date is"+date);
		
		LocalTime time = LocalTime.now();
		System.out.println("The current time is"+time);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("Current Date and Time"+current);
		
		DateTimeFormatter format =
				DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDateTime = current.format(format);
		System.out.println("In formatted manner"+formattedDateTime);
		
		Month month = current.getMonth();
		int day = current.getDayOfMonth();
		int seconds = current.getSecond();
		int hour = current.getHour();
		int year = current.getYear();
		System.out.println("MOnth:"+month+" Day"+day
				+" Seconds"+seconds+" Hour"+hour+" Year"+year);
		
		LocalDate  date2 =LocalDate.of(1950,1,26);
		System.out.println("The Republic Day:"+date2);
		
		LocalDateTime specificDate = current.withDayOfMonth(24).withYear(2016);
		
		System.out.println("Specific date with current time:"+specificDate);
		
		
	}
	public static void main(String[] args) {
		LocalDateTime();
		
	}

}
