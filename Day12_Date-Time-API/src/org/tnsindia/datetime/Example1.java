package org.tnsindia.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example1 {

	public static void main(String[] args) {
		//LoaclDate diplay present date
		LocalDate d= LocalDate.now();
		System.out.println(d);
		
		//LocalTime use to display time 
		LocalTime obj=LocalTime.now();
		System.out.println(obj);
		
		
		//It is use to display LocalDateTime
		//LocalDateTime obj1=LocalDateTime.now();
		//System.out.println(obj1)
		
		//It give us exception that saying not a leap year 
		//LocalDate obj2=LocalDate.of(2022, 02, 29);
		//System.out.println(obj2);


	}
}