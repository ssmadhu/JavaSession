package org.javaHead.mailExercise;

import org.javaHead.mailExercise.models.EmailInfo;
import org.javaHead.mailExercise.models.User;
import org.javaHead.mailExercise.services.EmailService;

/**
 * Hello world!
 *
 */
public class sendEmail_good
{
    public static void main( String[] args )
    {
        EmailService emailService = new EmailService();
        EmailInfo emailInfo = new EmailInfo("Hi!", "Have a good day");
        User from = new User("Madhumitha", "Sekar", "ssmadhumitha@gmail.com", "****");
        User to = new User("Akshay", "Sharma", "asharma2023@gmail.com");
        emailService.sendEmail(emailInfo, from, to);
    }
}
