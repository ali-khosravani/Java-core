package main.java.app.socket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Server {
    private static final int port = 8987;

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        ServerSocket server = new ServerSocket(port);
        System.out.println("Server listen to port "+port);
        while (true) {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss:000000");
            LocalDateTime now = LocalDateTime.now();

            Socket socket = server.accept();
            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
            String str = (String) objectInputStream.readObject();

            System.out.println(dateTimeFormatter.format(now)+" " + str);

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectOutputStream.writeObject(dateTimeFormatter.format(now)+" "+str);

            objectInputStream.close();
            objectOutputStream.close();
            socket.close();

            if (str.equalsIgnoreCase("exit"))
                break;
        }
        server.close();
        System.out.println("Server close connection");

    }
}
