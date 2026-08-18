package com.mycompany.biblioteca;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static ArrayList<Client> clients = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Loan> loans = new ArrayList<>();
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

    void createBook(String code, String title, String datePublic, String author, String available) {
        Book newBook = new Book(code, title, datePublic, author, available);
        books.add(newBook);
    }

    void listBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    Book searchBook(String code) {
        for (Book book : books) {
            if (book.getCode().equals(code)) {
                return book;
            }
        }

        return null;
    }

    void updateBook(String code, String title, String datePublic) {
        Book book = searchBook(code);

        if (book != null) {
            book.setTitle(title);
            book.setDatePublic(datePublic);
        } else {
            System.out.println("Libro no encontrado");
        }
    }

    void deleteBook(String code) {
        Book book = searchBook(code);

        if (book != null) {
            books.remove(book);
            System.out.println("Libro eliminado");
        } else {
            System.out.println("Libro no encontrado");
        }
    }

    void crearPrestamo(String idLoan, String state, int idClient, String codeBook, String date) {
        Client client = searchClient(idClient);
        Book book = searchBook(codeBook);

        if (client != null && book != null) {
            Loan newLoan = new Loan(idLoan, state, client, book, date);
            loans.add(newLoan);
            book.setAvailable("No");
            System.out.println("Préstamo registrado");
        } else {
            System.out.println("Cliente o libro no encontrado");
        }
    }

}
