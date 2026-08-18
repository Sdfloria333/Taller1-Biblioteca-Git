package com.mycompany.biblioteca;

public class Loan {

    private String idLoan, state;
    private Client client;
    private Book book;
    private String date;

    public Loan(String idLoan, String state, Client client, Book book, String date) {
        this.idLoan = idLoan;
        this.state = state;
        this.client = client;
        this.book = book;
        this.date = date;
    }

    public String getIdLoan() {
        return idLoan;
    }

    public void setIdLoan(String idLoan) {
        this.idLoan = idLoan;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
