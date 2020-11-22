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
        if(userDate.equals("exit")){
        	break;
		}
        dateList.add(userDate);
	 }

	Date user1 = new Date(dateList);

	if(dateList.get(0).contains("/")){
		user1.getDate();
	 }else{
		user1.parseDate();
	}


    }
}
