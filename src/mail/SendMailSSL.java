package mail;

import java.util.Properties;
import java.util.Scanner;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMailSSL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sender email: ");
		String from_email = sc.next();
		System.out.println("Enter receiver's email: ");
		String to_email = sc.next();
		System.out.println("Enter mail password: ");
		String password = sc.next();
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from_email, password);
			}
		});

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from_email));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to_email));
			message.setSubject("A mail from java program!");
			message.setText("Hi, This is Siva Cheerla I'm sending this mail from java program..");

			Transport.send(message);

			System.out.println("Done");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
