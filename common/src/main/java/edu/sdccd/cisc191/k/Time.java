package edu.sdccd.cisc191.k;/*
Author:Armin Irvije
Description: This class takes in the time Arraylist and follows the same format as the k.Date class
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Time implements Meeting ,Serializable {
    ArrayList<String> userTime;
    ArrayList<String> user2Times = new ArrayList<>();

    //constructor method
    public Time(ArrayList timeList){
        userTime = timeList;
    }


    @Override
    public void getArray() {

        userTime.stream().forEach(System.out::println);
    }

    @Override
    public ArrayList<String> secondUserChooses() {
        Scanner scan = new Scanner(System.in);
        int choices = 0;

        System.out.print("\nTimes:");
        for(int i= 0; i < userTime.size();i++){
            System.out.print("\n" + i +" - " + userTime.get(i));
        }


        System.out.println("\nwhich of the following Times are you available?" + "\nType -1 if you chosen less than the given options");

        for(int i = 0; i < userTime.size(); i++) {
            choices = scan.nextInt();
            if(choices == -1){
                break;
            }
            switch (choices){
                case(0):
                    user2Times.add(userTime.get(0));
                    break;

                case(1):
                    user2Times.add(userTime.get(1));
                    break;

                case(2):
                    user2Times.add(userTime.get(2));
                    break;

                case(3):
                    user2Times.add(userTime.get(3));
                    break;

                case(4):
                    user2Times.add(userTime.get(4));
                    break;

                default:
                    break;
            }
        }

        return user2Times;
    }

    @Override
    public void getSecondUserArray() {
        for(String date: user2Times){
            System.out.println(date);
        }
    }
}
