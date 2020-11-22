package com.company;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class Date {
   protected int month;
   protected int day;
   protected int year;
   protected String theDate;
   protected String parsedDate;
   ArrayList<String> userDates;


    public Date(ArrayList dateList){
        userDates = dateList;

    }

    public void getDate(){
        for(int i = 0; i<userDates.size(); i++){
            System.out.println(userDates.get(i));
        }
    }

    public void parseDate(){
       for(int i = 0; i < userDates.size(); i++){
           theDate = userDates.get(i);
           Scanner StringStream = new Scanner(theDate);
           month = StringStream.nextInt();
           day = StringStream.nextInt();
           year = StringStream.nextInt();
           parsedDate = month + "/" + day + "/" + year;
           System.out.println(parsedDate);
       }
    }
}

