/*
Author: Armin Irvije
Description: This class stores and prints out the information of the event
 */
package com.company;
public class Itinerary {
    protected String event;
    protected String location;
    protected String description;

   public Itinerary(String userEvent, String meetinglocation, String eventDescription){
        event = userEvent;
        location = meetinglocation;
        description = eventDescription;
    }
    public void printItinerary(){
        System.out.println();
        System.out.println("Your event: " + event);
        System.out.println("Meeting location: " + location);
        System.out.println("Description of meeting: "+ description + "\n");
    }

}
