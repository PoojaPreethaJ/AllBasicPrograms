package com.example.java8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTime {

	/*
	 * issues in previous version for using DateTime API :
	 * to format the date we have to use additional package java.text
	 * when one thread is working the other thread would suffer 
	 *
	 *
	 * Changes brought in New version
	 * values are immutable
	 * special package assigned for time ( java.time)
	 * use of loose coupling /DI creating object without new keyword
	 */
	public static void main(String[] args) {
		//LocalDate d = LocalDate.of(1998,02,23);
		LocalDate d = LocalDate.of(1998,Month.FEBRUARY,23);
		System.out.println(d);
		
		//LocalTime t = LocalTime.now();
		LocalTime t = LocalTime.of(12, 30, 05, 999);
		
		//To get the timezone . (human readable)
		LocalTime zone = LocalTime.now(ZoneId.of("GMT"));
		System.out.println(zone);	
		
		//to get the GMT  -> Machine readable 
		Instant i = Instant.now();
		System.out.println(i);
		
		//to fetch all the zoneIds
		/*for(String s :ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}*/
		
		
		//to get both date and time
		LocalDateTime dt = LocalDateTime.now(ZoneId.of("GMT"));
		System.out.println(dt);
	}
}
