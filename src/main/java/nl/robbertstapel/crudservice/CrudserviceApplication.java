package nl.robbertstapel.crudservice;
import nl.robbertstapel.crudservice.customer.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDate;

@SpringBootApplication
public class CrudserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudserviceApplication.class, args);
	}

	Customer cus1 = new Customer(
			"Robbert",
			"Stapel",
			LocalDate.of(1989, 5, 17),
			21,
			"Kerkstraat 1");
}