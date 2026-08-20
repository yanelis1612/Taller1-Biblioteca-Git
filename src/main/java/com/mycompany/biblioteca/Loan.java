package com.mycompany.biblioteca;

import java.time.LocalDate;

public class Loan {
    private String Id;
    private Client LoanClient;
    private Book LoanBook;
    private LocalDate Date;
    private String Status;

    public Loan(String id, Client client, Book book, LocalDate date, String status) {
        this.Id = id;
        this.LoanClient = client;
        this.LoanBook = book;
        this.Date = date;
        this.Status = status;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public Client getLoanClient() {
        return LoanClient;
    }

    public void setLoanClient(Client client) {
        this.LoanClient = client;
    }

    public Book getLoanBook() {
        return LoanBook;
    }

    public void setLoanBook(Book book) {
        this.LoanBook = book;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        this.Date = date;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        this.Status = status;
    }
}
