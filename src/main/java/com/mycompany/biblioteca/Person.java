package com.mycompany.biblioteca;

public class Person {
    protected String Id;
    protected String Name;
    protected String TelephoneNumber;

    public Person(String id, String nombre, String telefono) {
        this.Id = Id;
        this.Name = Name;
        this.TelephoneNumber = TelephoneNumber;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getTelephoneNumber() {
        return TelephoneNumber;
    }

    public void setTelephoneNumber(String TelephoneNumber) {
        this.TelephoneNumber = TelephoneNumber;
    }
}