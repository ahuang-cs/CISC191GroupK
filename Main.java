package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
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

	Date user1 = new Date(dateList);
	// this if statement is to decipher whether or not the input of dates has backslashes in them
		//if they do not then the method call to parseDate() will fix that
	if(dateList.get(0).contains("/")){
		user1.getDate();
	 }else{
		user1.parseDate();
	}
	//once user1's date list is set the choices for user2 are provided
     user1.user2Chooses();

    }
}
