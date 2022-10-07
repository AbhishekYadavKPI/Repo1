package practice2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class DTPractice {
	public static void findDay() {
		LocalDate  date1 =LocalDate.of(2030,10,7);
		System.out.println("The day on the date 2030-10-07: "+date1.getDayOfWeek());
		LocalDate nextwed = date1.with(TemporalAdjusters.nextOrSame(DayOfWeek.WEDNESDAY));
		System.out.println("Date of the next Wednesday: "+nextwed);
		
	}
	public static void dateDetails() {
		LocalDate  date =LocalDate.of(1922,1,26);
		Month month = date.getMonth();
		int day = date.getDayOfMonth();
		int year = date.getYear();
		System.out.println("Details of 1922-01-26");
		System.out.println("MOnth:"+month+"\nDay of the month:"+day
				+"\nDay of the week:"+date.getDayOfWeek()+"\nYear:"+year);
	}
	public static void main(String[] args) {
		findDay();
		dateDetails();
	}

}

