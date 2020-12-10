package com.company;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    ArrayList<String> networkDates = new ArrayList<>();
    String netDate;


    public static void main(String[] args)throws Exception{
      new Client();
    }

    public Client() throws Exception{
        Socket socket = new Socket("127.0.0.1", Server.PORT);


        ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());

       // receives the date object from server
        Date serverDates = (Date)inStream.readObject();
        //run the methods for client
        serverDates.getDate();

        //send user 2 arraylist back to server
        Date clientDate = new Date(serverDates.user2Chooses());//the call to user2Chooses() just needs to written here
        outStream.writeObject(clientDate);




       // outStream.close();
        socket.close();
    }
}
