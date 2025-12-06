package basicProject.javaSpring.dependencyInjection;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnProperty(name = "notification.service",
//        havingValue = "msg")
public class MessageService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Message Service " +
                "send Message :"+message);

    }
}
