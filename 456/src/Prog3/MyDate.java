package Prog3;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class MyDate {
	
	private int day;
	private int month;
	private int year;
	private String monthMMM;
	DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	DateTimeFormatter format2 = DateTimeFormatter.ofPattern("MMMM dd,yyyy");
	DateTimeFormatter format3 = DateTimeFormatter.ofPattern("DDD yyyy");
	
	MyDate(int month, int day, int year){
		this.day = day;
		this.month = month - 1;
		this.year = year;
		LocalDate date = LocalDate.of(year, month, day);
		
		System.out.println("MM/dd/yyyy: " +date.format(format1));
		System.out.println("MMMM dd,yyyy: " +date.format(format2));
		System.out.println("DDD yyyy: " +date.format(format3));
		
	}
	MyDate(String month, int day, int year ){
		monthMMM = month.toUpperCase();
		this.day = day;
		this.year = year;
		
		LocalDate date = LocalDate.of(year, Month.valueOf(monthMMM),day);
		System.out.println("MM/dd/yyyy: " +date.format(format1));
		System.out.println("MMMM dd,yyyy: " +date.format(format2));
		System.out.println("DDD yyyy: " +date.format(format3));
	}
	MyDate(int dayOfYear, int year ){
		day = dayOfYear;
		this.year = year;
		
		LocalDate date = LocalDate.ofYearDay(year,dayOfYear);
		System.out.println("MM/dd/yyyy: " +date.format(format1));
		System.out.println("MMMM dd,yyyy: " +date.format(format2));
		System.out.println("DDD yyyy: " +date.format(format3));
		
	}
	
}
