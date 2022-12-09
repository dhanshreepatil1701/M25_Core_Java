package org.tnsindia.enumdemo;

public class EnumMealDemo {

	public static void main(String[] args) {
		//Meal m=new.Mael();
		for (Meal m: Meal.values()) {
			
			System.out.println(m+" "+m.getValue());
		}

	}

}