package org.javaHead.mailExercise.services;

import org.javaHead.mailExercise.models.EmailInfo;
import org.javaHead.mailExercise.models.MailServer;
import org.javaHead.mailExercise.models.User;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailService {
    public void sendEmail(EmailInfo emailInfo, User from, User to){
        try {
            MailServer mailserver = new MailServer("smtp.gmail.com", "465", "pop3", "smtp", "javax.net.ssl.SSLSocketFactory");
            mailserver.initMailServer();
            Properties properties = mailserver.getProperties();
            final PasswordAuthentication passwordAuthentication = new PasswordAuthentication(from.getEmail(), from.getPassword());
            Session session = Session.getDefaultInstance(properties, new Authenticator(){
                protected PasswordAuthentication getPasswordAuthentication() {
                    return passwordAuthentication;
                }});
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from.getEmail()));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to.getEmail()));
            message.setSubject(emailInfo.getSubject());
            message.setText(emailInfo.getBody());
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch(Exception e) {
            e.printStackTrace();
        }


    }


}
