package com.SpringBoot.AOP.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = " Name is Mandatory ! ")
    @Size(min = 2,max = 30,message = " Name must be between 2 and 30 characters ! ")
    private String name;

    @NotBlank(message = " Email is Mandatory ! ")
    @Email(message = " Not Valid ! ")
    private String email;

    @NotNull(message = " password is Mandatory ! ")
    @Pattern(regexp = "^\\d{10}$", message = " Number is Not valid ! ")
    private String number;

    @NotBlank(message = " password is Mandatory ! ")
    @Size(min = 8,message = " Too weak ! ")
    private String password;

    @NotNull(message = " DateOfBirth is Mandatory ! ")
    @Past(message = " Date of Birth must be a past date ! ")
    private LocalDate dateOfBirth ;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public @NotBlank(message = " Name is Mandatory ! ") @Size(min = 2, max = 30, message = " Name must be between 2 and 30 characters ! ") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = " Name is Mandatory ! ") @Size(min = 2, max = 30, message = " Name must be between 2 and 30 characters ! ") String name) {
        this.name = name;
    }

    public @NotBlank(message = " Email is Mandatory ! ") @Email(message = " Not Valid ! ") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = " Email is Mandatory ! ") @Email(message = " Not Valid ! ") String email) {
        this.email = email;
    }

    @NotBlank(message = " password is Mandatory ! ")
    @Pattern(regexp = "^\\d{10}$", message = " Number is Not valid ! ")
    public String getNumber() {
        return number;
    }

    public void setNumber(@NotBlank(message = " password is Mandatory ! ") @Pattern(regexp = "^\\d{10}$", message = " Number is Not valid ! ") String number) {
        this.number = number;
    }

    public @NotBlank(message = " password is Mandatory ! ") @Size(min = 8, message = " Too weak ! ") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = " password is Mandatory ! ") @Size(min = 8, message = " Too weak ! ") String password) {
        this.password = password;
    }

    public @NotNull(message = " DateOfBirth is Mandatory ! ") @Past(message = " Date of Birth must be a past date ! ") LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(@NotNull(message = " DateOfBirth is Mandatory ! ") @Past(message = " Date of Birth must be a past date ! ") LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}

