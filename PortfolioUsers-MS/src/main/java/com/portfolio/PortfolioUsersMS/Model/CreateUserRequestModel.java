package com.portfolio.PortfolioUsersMS.Model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateUserRequestModel {
    @NotNull(message="First name cannot be null")
    public String firstName;
    @NotNull(message="Last name cannot be null")
    @Size(min=2, max=16, message="Last name must contain at least 2 characters")
    public String lastName;
    public String password;
    @Email
    public String email;

    public CreateUserRequestModel() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
