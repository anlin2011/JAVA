package com.programs;
public class SwitchEnum {
	public enum Day { Sun, Mon, Tue, Wed, Thu, Fri, Sat}
	public static void main(String[] args) {
		Day[] daysOfWeek = Day.values();
		for(Day day: daysOfWeek) {
			switch(day) {
			case Sun:
				System.out.println("Sunday");
				break;
			case Mon:
				System.out.println("Monday");
				break;
			case Tue:
				System.out.println("Tuesday");
				break;
			case Wed:
				System.out.println("Wednesday");
				break;
			case Thu:
				System.out.println("Thursday");
				break;
			case Fri:
				System.out.println("Friday");
				break;
			case Sat:
				System.out.println("Saturday");
				break;
			}
		}
	}
}
