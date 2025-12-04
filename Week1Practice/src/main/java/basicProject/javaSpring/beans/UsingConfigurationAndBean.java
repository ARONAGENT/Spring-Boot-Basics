package basicProject.javaSpring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class UsingConfigurationAndBean {

    @Bean
    @Scope("prototype")
    PaymentService paymentService(){
        return new PaymentService();
    }
}
