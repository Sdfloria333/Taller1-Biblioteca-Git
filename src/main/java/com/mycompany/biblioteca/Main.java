package com.mycompany.biblioteca;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static ArrayList<Client> clients = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    void CREATE(String name, int id, int phone, String email) {
        Client newClient = new Client(name, id, phone, email);
        clients.add(newClient);
    }
}
