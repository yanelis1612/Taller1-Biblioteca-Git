package com.mycompany.biblioteca;

public class Client extends Person {
    private String Email;

    public Client(String id, String name, String telephoneNumber, String email) {
        super(id, name, telephoneNumber);
        this.Email = email;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }
}
    

