package com.mycompany.biblioteca;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static ArrayList<Client> clients = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //menu
    }

    void CREATE(String name, int id, int phone, String email) {
        Client newClient = new Client(name, id, phone, email);
        clients.add(newClient);
    }

    Client searchClient(int id) {
        for (Client client : clients) {
            if (client.getId() == id) {
                return client;
            }
        }

        return null;
    }

    void READ() {
        for (Client c : clients) {
            System.out.println(c);
        }
    }

    void UPDATE(int id, String name, int phone, String email) {
        Client client = searchClient(id);

        if (client != null) {
            client.setName(name);
            client.setPhone(phone);
            client.setEmail(email);
        } else {
            System.out.println("Cliente no encontrado");
        }

    }

    void DELETE(int id) {
        Client client = searchClient(id);

        if (client != null) {
            clients.remove(client);
            System.out.println("Cliente eliminado");
        } else {
            System.out.println("Cliente no encontrado");
        }
    }
}
