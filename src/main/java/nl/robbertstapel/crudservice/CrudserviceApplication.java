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

}