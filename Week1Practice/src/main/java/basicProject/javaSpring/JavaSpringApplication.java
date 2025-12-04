package basicProject.javaSpring;

import basicProject.javaSpring.beans.PaymentService;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaSpringApplication implements CommandLineRunner {
	@Autowired
	PaymentService paymentService;

	@Autowired
	PaymentService paymentService1;

	public static void main(String[] args) {

		SpringApplication.run(JavaSpringApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(paymentService.hashCode());
		System.out.println(paymentService1.hashCode());
		paymentService.pay();
		paymentService1.pay();

	}

}
