package pe.upeu.chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class cliente2 {
    public static void main(String[] args) throws IOException {
        String message2, inFromServer2;
        
        Socket alejandroSocket = new Socket("localhost", 6789);
        System.out.println("Establishing connection....");
        
        Scanner inputFromUser = new Scanner(System.in);
        PrintWriter outputToServer = new PrintWriter(alejandroSocket.getOutputStream(),true);
        Scanner inputFromServer = new Scanner(alejandroSocket.getInputStream());
        while(true){
            System.out.print("Alejandro: ");
            message2 = inputFromUser.nextLine();
            
            outputToServer.println(message2);
            if(message2.equals("**close**"))
                break;
            
            inFromServer2 = inputFromServer.nextLine();
            System.out.println("Server: "+inFromServer2);
        }
        alejandroSocket.close();
    }
}
