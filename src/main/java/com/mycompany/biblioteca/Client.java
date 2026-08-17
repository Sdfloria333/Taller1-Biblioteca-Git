package com.mycompany.biblioteca;

public class Client extends Person {

    String email;

    public Client(String name, int id, int phone, String email) {
        super(name, id, phone);
        this.email = email;
    }
}
