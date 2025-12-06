package basicProject.javaSpring;

import basicProject.javaSpring.beans.PaymentService;
import basicProject.javaSpring.dependencyInjection.EmailService;
import basicProject.javaSpring.dependencyInjection.NotificationService;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class JavaSpringApplication implements CommandLineRunner {
//	@Autowired
//	PaymentService paymentService;
//
//	@Autowired
//	PaymentService paymentService1;



	public static void main(String[] args) {

		SpringApplication.run(JavaSpringApplication.class, args);

	}

//	final NotificationService notificationService;
//
//	public JavaSpringApplication(NotificationService notificationService) {
//		this.notificationService = notificationService;
//	}


	@Autowired
	Map<String,NotificationService> notificationServiceMap=new HashMap<>();

	@Override
	public void run(String... args) throws Exception {
//		notificationService.send("Hello");
		for (var notificationService: notificationServiceMap.entrySet()){
			System.out.println(notificationService.getKey());
			notificationService.getValue().send("Hello");
		}
	}

}
