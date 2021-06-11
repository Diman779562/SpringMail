package sergeev.mail;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import sergeev.mail.config.MailConfig;
import sergeev.mail.controllers.SendEmail;

@EnableScheduling
public class MailApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MailConfig.class);

		SendEmail bean = context.getBean(SendEmail.class);
		bean.sendMail();
	}
}
