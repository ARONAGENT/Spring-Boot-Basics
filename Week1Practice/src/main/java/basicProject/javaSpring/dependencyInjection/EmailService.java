package basicProject.javaSpring.dependencyInjection;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnProperty(name = "notification.service",
//        havingValue = "email")
public class EmailService implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Email Service" +
                " send Message :"+message);
    }
}
