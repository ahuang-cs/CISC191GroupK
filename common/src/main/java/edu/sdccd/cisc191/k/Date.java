package edu.sdccd.cisc191.k;/*
Author: Armin Irvije
Description: This class takes in the date arraylist, if the dates do not have backslashes in them the getArraylist()
method will fix that. Then the next method will prompt the 2nd user to choose from the options
 */

import java.io.Serializable;
import java.util.Scanner;
import java.util.ArrayList;

public class Date implements Meeting, Serializable {

    private int month;
    private int day;
    private int year;
    private String theDate;
    private String parsedDate;
   ArrayList<String> userDates;
   private int i;
   ArrayList<String> user2Dates = new ArrayList<>();

   //constructor method
    public Date(ArrayList dateList){
        userDates = dateList;

    }

    // prints out the list of dates that user 1 entered from the arraylist
    @Override
    public void getArray() {
        if(!userDates.get(0).contains("/")){
            // this fixes the input of the dates by entering in a backslash in the dates
            for(i = 0; i < userDates.size(); i++){
                theDate = userDates.get(i);
                Scanner StringStream = new Scanner(theDate);
                month = StringStream.nextInt();
                day = StringStream.nextInt();
                year = StringStream.nextInt();
                parsedDate = month + "/" + day + "/" + year;
                userDates.set(i, parsedDate);
            }
        }

        for(i = 0; i<userDates.size(); i++){
            System.out.println(userDates.get(i));
        }
    }


    /*
      Once user1's date list has been set this method will display the options that user2 can choose from
      User2 will type the number corresponding to the date they have chosen
      the chosen dates will then be stored in User2's own arraylist and then the arraylist will be displayed
    */
    @Override
    public ArrayList<String> secondUserChooses() {
        Scanner scan = new Scanner(System.in);
        int choices = 0;

        //I have to iterate this because it could have less than 5 entries
        System.out.print("\nDates:");
        for(i= 0; i < userDates.size();i++){
            System.out.print("\n" + i +" - " + userDates.get(i));
        }


        System.out.println("\nwhich of the following dates are you available?" + "\nType -1 if you chosen less than the given options");

        for(i = 0; i < userDates.size(); i++) {
            choices = scan.nextInt();
            if(choices == -1){
                break;
            }
            switch (choices){
                case(0):
                    user2Dates.add(userDates.get(0));
                    break;

                case(1):
                    user2Dates.add(userDates.get(1));
                    break;

                case(2):
                    user2Dates.add(userDates.get(2));
                    break;

                case(3):
                    user2Dates.add(userDates.get(3));
                    break;

                case(4):
                    user2Dates.add(userDates.get(4));
                    break;

                default:
                    break;
            }
        }

        return user2Dates;
    }

    @Override
    public void getSecondUserArray() {
        for(String date: user2Dates){
            System.out.println(date);
        }
    }
}

