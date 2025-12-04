package basicProject.javaSpring.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public void pay(){
        System.out.println("Payment Service is " +
                "Doing Payment...");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("payment is running....");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Destroy the Payment Bean");
    }

}
