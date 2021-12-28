package com.booking.certificacion.models;

public class Credentials {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Credentials(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
