package com.company;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Server {
    public static final int PORT = 1234;
    ArrayList<String> networkDates = new ArrayList<>();
    String netDate;

    public Server() throws Exception{
        Scanner scnr= new Scanner(System.in);
        ServerSocket serverSock = new ServerSocket(PORT);
        System.out.println("Server is running!");

        //accept connection from client
        Socket socket = serverSock.accept();
        ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());


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

         //prompt user for dates to create the date arraylist
        System.out.println("Enter up to 5 dates you are available by month/day/year (type 'exit' if you have less than 5 dates):");
        for(int i = 0; i < 5; i++) {
            netDate = scnr.nextLine();
            //exit is used when the user has less than 5 entries
            if(netDate.equals("exit")){
                break;
            }
            networkDates.add(netDate);
        }



       // sends object clientDate to client
        Date serverDate = new Date(networkDates);
        outStream.writeObject(serverDate);

        //receive the new datelist from client
        Date clientDates = (Date)inStream.readObject();
        clientDates.getDate();





        serverSock.close();

    }

    public static void main(String[] args) throws Exception {
        new Server();
    }
}
