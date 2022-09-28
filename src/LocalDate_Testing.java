package day5;

import java.time.LocalDate;

public class LocalDate_Testing {

	public static void main(String[] args) {
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(2016, 10, 16);
		LocalDate date3=LocalDate.parse("2022-11-08");
		
		System.out.println("date1: "+date1);
		System.out.println("date2: "+date2);
		System.out.println("date3: "+date3);
		
		LocalDate yesterday=date1.minusDays(1);
		System.out.println("yesterday: "+yesterday);
		LocalDate tomorrow=date1.plusDays(2);
		System.out.println("tomorrow: "+tomorrow);
		
		System.out.println("Current Year: "+date1.getYear());
		System.out.println("Current Month: "+date1.getMonthValue());
		System.out.println("Current Month: "+date1.getMonth());
		System.out.println("Current day: "+date1.getDayOfWeek());
		System.out.println("Current day: "+date1.getDayOfMonth());
		System.out.println("Current day: "+date1.getDayOfYear());
		
		System.out.println("date1 is leap year? : "+date1.isLeapYear());
		System.out.println("date2 is leap year? : "+date2.isLeapYear());
		System.out.println("date1 == date2 ? : "+date1.equals(date2));

	}

}
