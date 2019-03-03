package server;

/**
 * @author Anna Bondarenko
 * @version 03.03.19
 */

import client.Client;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

    public ChatServer(){
        ServerSocket server = null;
        Socket socket = null;
        try {
            server = new ServerSocket(8189);
            System.out.println("Server started, waiting for connection...");
            socket = server.accept();
            System.out.println("Client connected");
            new Client(socket, "Server");
            while(true){
                if(socket.isClosed()){
                    break;
                }
            }
            server.close();
            System.exit(0);
        } catch (IOException e) {
            System.out.println("Server initialization error");
        } finally {
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        new ChatServer();
    }
}