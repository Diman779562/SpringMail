package sergeev.mail.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SendEmail {

    @Autowired
    private JavaMailSender mailSender;

    @Scheduled (cron="0 35 20   MON-FRI", zone="Europe/Moscow")
    public void sendMail() {

        SimpleMailMessage msg = new SimpleMailMessage();

        msg.setTo("barsdiman@gmail.com");
        msg.setFrom("barsdiman@gmail.com");
        msg.setSubject("Тема.Тест");
        msg.setText("Тело.Тест");

        mailSender.send(msg);

    }
}
