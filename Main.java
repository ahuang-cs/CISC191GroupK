package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	/*
	This is to fill the information for the Itinerary class
	 */
		String event, location, description;
		System.out.println("Enter the name of the Event: ");
		event = scnr.nextLine();

		System.out.println("Enter location of meeting: ");
		location = scnr.nextLine();

		System.out.println("Enter a description of Event: ");
		description = scnr.nextLine();

		Itinerary itinerary = new Itinerary(event, location, description);
		itinerary.printItinerary();


	/*
	This is to fill the information for the User class
	 */
		User User1 = new User();


		String name, neighborhood, profession;
		int age;


		System.out.println("Enter your name: ");
		name = scnr.nextLine();

		System.out.println("Enter your age: ");
		age = Integer.parseInt(scnr.nextLine());

		System.out.println("Enter your location: ");
		neighborhood = scnr.nextLine();

		System.out.println("Enter your profession: ");
		profession = scnr.nextLine();

		User1.setName(name);
		User1.setAge(age);
		User1.setLocation(neighborhood);
		User1.setProfession(profession);
		User1.printInfo();




	/*
	This is to create an instance of date class and call the methods
	 */
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

	Date user1 = new Date(dateList);
	/*
		 this if statement is to decipher whether or not the input of dates has backslashes in them
		 if they do not then the method call to parseDate() will fix that
		*/
		if(dateList.get(0).contains("/")){
		user1.getDate();
	 }else{
		user1.parseDate();
	}
	//once user1's date list is set the choices for user2 are provided
     user1.user2Chooses();

    }
}
