package ip_finder;

import java.net.InetAddress;
import java.util.Scanner;

public class IP_Finder {

    static InetAddress getAddress;

    IP_Finder(String getURL) {
        try {
            getAddress = InetAddress.getByName(getURL);
            System.out.println("\nYour IP Address for (" + getURL + ") is: " + getAddress.getHostAddress());
        } catch (Exception e) {
            System.out.println("\nNo Internet Connection. Please try again...");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a website Address to obtain you IP Address");
        new IP_Finder(input.nextLine());
    }
}
