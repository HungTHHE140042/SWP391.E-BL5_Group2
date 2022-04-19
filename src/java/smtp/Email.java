/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smtp;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.sql.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author trinh
 */
public class Email {

    public static void sendEmail(String toAddress, String subject, String message) throws AddressException,
            MessagingException {

        // sets SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.googlemail.com");
        properties.put("mail.smtp.port", 587);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        // creates a new session with an authenticator
        final String userName = "rypito.twitter@gmail.com";
        final String password = "rypito123456";
        
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            @Override
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(userName, password);
            }
        });

        // creates a new e-mail message
        Message msg = new MimeMessage(session);

        msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
        msg.addHeader("format", "flowed");
        msg.addHeader("Content-Transfer-Encoding", "8bit");

        msg.setFrom(new InternetAddress(userName));
        InternetAddress[] toAddresses = {new InternetAddress(toAddress)};
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject(subject);

        String htmlContent = "<h1>" + message + "</h1> <br> <h3>- From GamesShop with LOVE</h3> <br> <img aria-label=\"logo\" width=\"215px\" height=\"79px\" src=\"https://uc3b8bf5170412817032af00f85a.previews.dropboxusercontent.com/p/thumb/ABgL9Y7hLF-fa7PLwpwGQqEnnwkvwXsUaR-bMebf8PoI4NR_B00teNi9iXsmExiHTix0msRpaKW5AKQXbWrdP5ZDuvlgHpB34OqI8UeSCzrwHmWakH8jt6amAv-msQmbHWhBQe7qzbodXGnl76RHo_K9JkkAOmcXhpv-gnY5w7vbjJE-KhV-VjCK4v-g72OfIK1zOjTfI36-GuCMCTwgxljm7RGgcuynF0ummJjCvMUQOfQlUcutkL39xwL_rw0c62MpagobTfLzniXkLqsgJGZzpAAU_cE_xHmD7V5recctf2Nv68l61FEXYZdYl5QndtbdDZWQmejX8Hb258d8BQ_23hCzz_7C_vzfnmIxlmGcOIOVAKwo4YY5fZ8gPnNdJ_c/p.png\" alt=\"\">";
        msg.setContent(htmlContent, "text/html");

        // sends the e-mail
        Transport.send(msg);

    }
}
