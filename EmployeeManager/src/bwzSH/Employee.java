package bwzSH;

import org.w3c.dom.html.HTMLImageElement;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Employee {

    public Employee(String lastName, String firstName, String street, String postalCode, String city, String phone, String email, String dateOfBirth) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
        this.phone = phone;
        this.email = email;
        this.setDateAsString(dateOfBirth);
    }


    private String lastName;
    private String firstName;
    private String street;
    private String postalCode;
    private String city;
    private String phone;
    private String email;
    private LocalDate dateOfBirth;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
    public String getDateOfBirthasString(){
        return this.dateOfBirth.toString();
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public  void setDateAsString(String dateOfBirth){
        this.dateOfBirth = LocalDate.parse(dateOfBirth,DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public int getAge(){
        //age[years] = now - dateOfBirth) => year
        Period age = Period.between(dateOfBirth, LocalDate.now());
        return age.getYears();
    }



}
