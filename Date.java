package com.company;

import java.io.Serializable;
import java.util.Scanner;
import java.util.ArrayList;

public class Date implements Serializable {
   protected int month;
   protected int day;
   protected int year;
   protected String theDate;
   protected String parsedDate;
   ArrayList<String> userDates;
   private int i;
   ArrayList<String> user2Dates = new ArrayList<>();

   //constructor method
    public Date(ArrayList dateList){
        userDates = dateList;

    }

    // prints out the list of dates that user 1 entered from the arraylist
    public void getDate(){
        for(i = 0; i<userDates.size(); i++){
            System.out.println(userDates.get(i));
        }
    }
    //for the if statement in the server class
    public String showIndexZero(){
        return userDates.get(0);
    }

   // this method fixes the input of the dates by entering in a backslash between the month, date, and year
    public void parseDate(){
       for(i = 0; i < userDates.size(); i++){
           theDate = userDates.get(i);
           Scanner StringStream = new Scanner(theDate);
           month = StringStream.nextInt();
           day = StringStream.nextInt();
           year = StringStream.nextInt();
           parsedDate = month + "/" + day + "/" + year;
           userDates.set(i, parsedDate);
           System.out.println(userDates.get(i));
       }
    }

    /*once user1's date list has been set this method will display the options that user2 can choose from
      User2 will type the number corresponding to the date they have chosen
      the chosen dates will then be stored in User2's own arraylist and then the arraylist will be displayed
    */
    public void user2Chooses(){
        Scanner scan = new Scanner(System.in);
        int choices = 0;

        //I have to iterate this because it could have less than 5 entries
        System.out.print("\nDates:");
        for(i= 0; i < userDates.size();i++){
            System.out.print("\n" + i +" - " + userDates.get(i));
        }


        System.out.println("\nUser 2, which of the following dates are you available?(type -1 to finish)");
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
         for(String date: user2Dates){
           System.out.println(date);
       }
    }



}

