package nl.robbertstapel.crudservice.rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudRestController {
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
