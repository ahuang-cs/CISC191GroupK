package edu.sdccd.cisc191.k;/*
Author: Armin Irvije
Description: This class is to hold the methods that prompt the user for k.User, k.Itinerary, k.Date, and k.Time information
 */

import java.util.Scanner;
import java.util.ArrayList;
public class Main {

//this method prompts user for dates and stores them in a arraylist
	public ArrayList<String> enterDates(){
		Scanner scnr = new Scanner(System.in);
		String userDate;
		ArrayList<String> dateList = new ArrayList<>();

		System.out.println("Enter up to 5 dates you are available by month/day/year (type 'exit' if you have less than 5 dates):");
		for(int i = 0; i < 5; i++) {
			userDate = scnr.nextLine();
			//exit is used when the user has less than 5 entries
			if(userDate.equals("exit")){
				break;
			}
			dateList.add(userDate);
		}
		return dateList;
	}

//this method prompts user for times during the day
	public ArrayList<String> enterTime(){
		Scanner scnr = new Scanner(System.in);
		String userTime;
		ArrayList<String> timeList = new ArrayList<>();
		System.out.println("\nEnter the times out of day that you can meet 0:00 am/pm (type 'exit' once you are finished): ");
		for(int i = 0; i < 12; i++){
			userTime = scnr.nextLine();
			if(userTime.equals("exit")){
				break;
			}
			timeList.add(userTime);
		}
		return timeList;
	}

// this method prompts user for description of meeting
	public void itineraryInfo(){
		Scanner scnr = new Scanner(System.in);

		String event, location, description;
		System.out.println("Enter the name of the Event: ");
		event = scnr.nextLine();

		System.out.println("Enter location of meeting: ");
		location = scnr.nextLine();

		System.out.println("Enter a description of Event: ");
		description = scnr.nextLine();

		Itinerary itinerary = new Itinerary(event, location, description);
		itinerary.printItinerary();
	}

//prompts user personal information
	public void userInfo(){
		Scanner scnr = new Scanner(System.in);

		User User1 = new User();


		String name, neighborhood, profession;
		int age;


		System.out.println("Enter your name: ");
		name = scnr.nextLine();

		System.out.println("Enter your age: ");
		age = Integer.parseInt(scnr.nextLine());

		System.out.println("Enter your neighborhood: ");
		neighborhood = scnr.nextLine();

		System.out.println("Enter your profession: ");
		profession = scnr.nextLine();

		User1.setName(name);
		User1.setAge(age);
		User1.setLocation(neighborhood);
		User1.setProfession(profession);
		User1.printInfo();

	}
}
