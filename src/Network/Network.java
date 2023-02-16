package Network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;


public class Network {
    public static void main(String[] args) {
        InetAddress addr1 = null, addr2 = null;
        System.out.print("호스트 이름을 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();

        try {
            addr1 = InetAddress.getByName(url);
            addr2 = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        System.out.println(url + "의 IP 주소 : " + Arrays.toString(addr1.getAddress()));
        System.out.println("로컬 IP 주소 : " + addr2.getHostAddress());
    }
}
