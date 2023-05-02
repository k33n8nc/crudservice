package nl.robbertstapel.crudservice.customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    // inject properties for application.theme
    @Value("${application.theme}")
    private String theme;

    // expose "/theme" endpoint that returns the theme property
    @GetMapping("/theme")
    public String getTheme() {
        return "Current theme: " + theme;
    }

    // expose "/" endpoint that returns "Hello World";
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/watch")
    public String sayChanged() {
        return "This was watched and changed...";
    }
}

