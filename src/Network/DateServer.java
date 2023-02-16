package Network;

import javax.naming.ldap.SortKey;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;


public class DateServer {
    public static void main(String[] args) {
        try (
                ServerSocket serverSocket = new ServerSocket(9000);
                Socket connection = serverSocket.accept();
                PrintWriter pw = new PrintWriter(connection.getOutputStream(), true);){
            pw.println(new Date().toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
