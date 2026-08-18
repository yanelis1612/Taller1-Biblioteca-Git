package com.mycompany.biblioteca;

public class Person {
    protected String Id;
    protected String Name;
    protected String TelephoneNumber;

    public Person(String id, String name, String telephoneNumber) {
        this.Id = id;
        this.Name = name;
        this.TelephoneNumber = telephoneNumber;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getTelephoneNumber() {
        return TelephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.TelephoneNumber = telephoneNumber;
    }
}