package Network;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class DateClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("서버 주소 입력 : (localhost)");
        String lh = sc.nextLine();

        try (Socket socket = new Socket(lh, 9000);
             BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));)
        {
            String answer = bf.readLine();
            System.out.println(answer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
