package main.java.app.socket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;


public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

        InetAddress inetAddress = InetAddress.getLocalHost();
        Socket socket;
        ObjectOutputStream objectOutputStream;
        ObjectInputStream objectInputStream;
        for (int i = 0; i < 50; i++) {
            socket = new Socket(inetAddress.getHostName(), 8987);
            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());


            objectOutputStream.writeObject("  " + i);

            objectInputStream = new ObjectInputStream(socket.getInputStream());
            String str = (String) objectInputStream.readObject();
            System.out.println(str);
            objectInputStream.close();
            objectOutputStream.close();
            Thread.sleep(2000);
        }
    }
}
