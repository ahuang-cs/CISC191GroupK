/*
Author: Armin Irvije
Description: This client class in the second user who receives the dates and times from the server.
The second user then chooses from the given options
 */
package com.company;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {


    public static void main(String[] args)throws Exception{
      new Client();
    }

    public Client() throws Exception{
        Socket socket = new Socket("127.0.0.1", Server.PORT);

        Main main = new Main();



        ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());


       // receives the objects from server
        Date serverDates = (Date)inStream.readObject();
        Time serverTime = (Time)inStream.readObject();

        main.userInfo();

        //send user 2 arraylist back to server
       Date clientDate = new Date(serverDates.secondUserChooses());//the call to user2Chooses() just needs to  be written here
         Time clientTime = new Time(serverTime.secondUserChooses());

        outStream.writeObject(clientDate);
        outStream.writeObject(clientTime);


        System.out.println("\nThe following date(s) that work for both of you are: ");
        serverDates.getSecondUserArray();
        System.out.println("The following time(s) that work for both of you are: ");
        serverTime.getSecondUserArray();


       outStream.close();
        socket.close();
    }
}
