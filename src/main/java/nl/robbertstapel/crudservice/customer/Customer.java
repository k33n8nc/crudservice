package nl.robbertstapel.crudservice.customer;
import java.time.LocalDate;

public class Customer {
    private String firstName; // unique in combination with lastName
    private String lastName; // unique in combination with firstName
    private LocalDate dateOfBirth;
    private int age; // calculated from dateOfBirth
    private String address;

    public Customer(String firstName, String lastName, LocalDate dateOfBirth, int age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.address = address;
    }
}