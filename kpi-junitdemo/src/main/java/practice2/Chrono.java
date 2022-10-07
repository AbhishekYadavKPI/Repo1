package practice2;

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;

public class Chrono {
	public static void checkingChronoEnum() {
		LocalDate date = LocalDate.now();
		System.out.println("The current date is"+date);
		
		LocalDate year = date.plus(2, ChronoUnit.YEARS);
		System.out.println("next to next year is"+year);
		
		LocalDate nextMonth = date.plus(1, ChronoUnit.MONTHS);
		System.out.println("The next Month is"+nextMonth);
		
		LocalDate nextWeek = date.plus(1, ChronoUnit.WEEKS);
		System.out.println("The next Week is"+nextWeek);
		
		LocalDate Decade = date.plus(2, ChronoUnit.DECADES);
		System.out.println("20 years after Today is"+Decade);
	}
	public static void main(String[] args) {
		checkingChronoEnum();
	}

}
