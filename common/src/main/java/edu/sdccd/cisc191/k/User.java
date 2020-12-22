package edu.sdccd.cisc191.k;/*
Author: Patrick Nguyen
Description: This class sets and prints out the personal information of the users
 */

public class User {

    protected String name;
    protected int age;
    protected String location;
    protected String profession;


    public void setName(String userName) {
        name = userName;
    }

    public void setAge(int userAge) {
        age = userAge;
    }


    public void setLocation(String userLocation) {
        location = userLocation;
    }


    public void setProfession(String userProfession) {
        profession = userProfession;
    }


    public void printInfo() {
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Location: " + location);
        System.out.println("Profession: " + profession + "\n");
    }
}
