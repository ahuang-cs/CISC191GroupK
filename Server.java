/*
Author: Armin Irvije
Description: This Server class creates a server that connects to a client.
The server is the initial user who creates the event and chooses the initial dates and times
 */

package com.company;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static final int PORT = 1234;


    public Server() throws Exception{
        ServerSocket serverSock = new ServerSocket(PORT);

        //accept connection from client
        Socket socket = serverSock.accept();

        ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
        Main main =  new Main();

	//This is to fill the information for the Itinerary class
        main.itineraryInfo();

	//This is to fill the information for the User class
        main.userInfo();

        Date serverDate = new Date(main.enterDates()); //prompt user for dates to create the date arraylist
        outStream.writeObject(serverDate);// sends object serverDate to client

        Time serverTime = new Time(main.enterTime());//prompts user to create time array
        outStream.writeObject(serverTime);//sends object to client


        //receive the new ArrayLists from client
        Date clientDates = (Date)inStream.readObject();
        Time clientTime = (Time)inStream.readObject();

        System.out.println("\nThe following date(s) that work for both of you are: ");
        clientDates.getArray();
        System.out.println("The following time(s) that work for both of you are: ");
        clientTime.getArray();


        serverSock.close();

    }

    public static void main(String[] args) throws Exception {
        new Server();
    }
}
