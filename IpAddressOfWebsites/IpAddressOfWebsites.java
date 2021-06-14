package ipaddressofwebsites;

import java.io.*;
import java.net.*;
import java.util.*;

public class IpAddressOfWebsites {

    public static void main(String[] args) {

        String host;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Host Name: ");
        host = input.nextLine();
        
        try{
        InetAddress ip = InetAddress.getByName(host);
        
        System.out.println("Host Address: " + ip.getHostName());
        System.out.println("IP Address: " + ip.getHostAddress());
        }
        catch (UnknownHostException e){
            System.out.println("Could not find " + host);
        }
    }
    
}
