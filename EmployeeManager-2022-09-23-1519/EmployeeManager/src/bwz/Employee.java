package bwz;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Employee {
    private String lastname;
    private String firstname;
    private String street;
    private String postalCode;
    private String city;
    private String phone;
    private String email;

    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate dateOfBirth;

    public Employee(String lastname, String firstname, String street, String postalCode, String city, String phone, String email, String dateOfBirth) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
        this.phone = phone;
        this.email = email;
        setDateOfBirthAsString(dateOfBirth);
    }


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDateOfBirthAsString() {
        return this.dateOfBirth.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDateOfBirthAsString(String dateOfBirth) {
        this.dateOfBirth = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public int getAge() {
        // age [years] = (current date - date of birth) => year
        Period period = Period.between(dateOfBirth, LocalDate.now());
        return period.getYears();
    }
}
