package org.example;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try(Socket clientSocket = new Socket("localhost", Server.SERVER_PORT);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            out.println("Robert");
            String resp = in.readLine();
            System.out.println(resp);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
