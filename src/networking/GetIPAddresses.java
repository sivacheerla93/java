package networking;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class GetIPAddresses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String domainname;
		while (true) {
			System.out.println("Enter Domain Name(Type'end' to stop): ");
			domainname = s.nextLine();
			if (domainname.equals("end")) {
				break;
			}
			try {
				InetAddress ips[] = InetAddress.getAllByName(domainname);
				System.out.println("IP Adress(es)");
				System.out.println("===================================");
				for (InetAddress addr : ips) {
					System.out.println(addr.getHostAddress());
				}
			} catch (UnknownHostException ex) {
				System.out.println("Sorry! Host not found.");
			}
		}
		System.out.println("Thank you!");
	}

}
