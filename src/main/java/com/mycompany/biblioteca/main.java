package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    static ArrayList<Client> clients = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Loan> loans = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
      
    }

    public static void createClient() {
        System.out.println("--- Create Client ---");
        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Phone: ");
        String phone = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        Client newClient = new Client(id, name, phone, email);
        clients.add(newClient);

        System.out.println("Client created successfully.");
    }
    public static void listClients() {
    System.out.println("--- Client List ---");
    if (clients.isEmpty()) {
        System.out.println("No clients registered.");
        return;
    }
    for (Client c : clients) {
        System.out.println("ID: " + c.getId()
            + " | Name: " + c.getName()
            + " | Phone: " + c.getTelephoneNumber()
            + " | Email: " + c.getEmail());
    }
}
    public static Client findClient(String id) {
    for (Client c : clients) {
        if (c.getId().equals(id)) {
            return c;
        }
    }
    return null;
}
    public static void updateClient() {
    System.out.print("Enter Client ID to update: ");
    String id = sc.nextLine();
    Client c = findClient(id);

    if (c == null) {
        System.out.println("Client not found.");
        return;
    }

    System.out.print("New Name: ");
    c.setName(sc.nextLine());
    System.out.print("New Phone: ");
    c.setTelephoneNumber(sc.nextLine());
    System.out.print("New Email: ");
    c.setEmail(sc.nextLine());

    System.out.println("Client updated successfully.");
}
    public static void deleteClient() {
    System.out.print("Enter Client ID to delete: ");
    String id = sc.nextLine();
    Client c = findClient(id);

    if (c == null) {
        System.out.println("Client not found.");
        return;
    }

    clients.remove(c);
    System.out.println("Client deleted successfully.");
}
    public static void createBook() {
    System.out.println("--- Create Book ---");
    System.out.print("Code: ");
    String code = sc.nextLine();
    System.out.print("Title: ");
    String title = sc.nextLine();
    System.out.print("Publication Year: ");
    String publicationYear = sc.nextLine();
    System.out.print("Author: ");
    String author = sc.nextLine();

    Book newBook = new Book(code, title, publicationYear, author);
    books.add(newBook);

    System.out.println("Book created successfully.");
}
    public static void listBooks() {
    System.out.println("--- Book List ---");
    if (books.isEmpty()) {
        System.out.println("No books registered.");
        return;
    }
    for (Book b : books) {
        System.out.println("Code: " + b.getCode()
            + " | Title: " + b.getTitle()
            + " | Year: " + b.getPublicationYear()
            + " | Author: " + b.getAuthor()
            + " | Available: " + b.isAvailable());
    }
}
    public static Book findBook(String code) {
    for (Book b : books) {
        if (b.getCode().equals(code)) {
            return b;
        }
    }
    return null;
}
    public static void updateBook() {
    System.out.print("Enter Book Code to update: ");
    String code = sc.nextLine();
    Book b = findBook(code);

    if (b == null) {
        System.out.println("Book not found.");
        return;
    }

    System.out.print("New Title: ");
    b.setTitle(sc.nextLine());
    System.out.print("New Publication Year: ");
    b.setPublicationYear(sc.nextLine());
    System.out.print("New Author: ");
    b.setAuthor(sc.nextLine());

    System.out.println("Book updated successfully.");
}
    public static void deleteBook() {
    System.out.print("Enter Book Code to delete: ");
    String code = sc.nextLine();
    Book b = findBook(code);

    if (b == null) {
        System.out.println("Book not found.");
        return;
    }

    books.remove(b);
    System.out.println("Book deleted successfully.");
}
    public static void createLoan() {
    System.out.println("--- Register Loan ---");
    System.out.print("Client ID: ");
    String clientId = sc.nextLine();
    Client client = findClient(clientId);

    if (client == null) {
        System.out.println("Client not found.");
        return;
    }

    System.out.print("Book Code: ");
    String bookCode = sc.nextLine();
    Book book = findBook(bookCode);

    if (book == null) {
        System.out.println("Book not found.");
        return;
    }

    if (!book.isAvailable()) {
        System.out.println("Book is not available.");
        return;
    }

    String loanId = "L" + (loans.size() + 1);
    Loan newLoan = new Loan(loanId, client, book, LocalDate.now(), "ACTIVE");
    loans.add(newLoan);
    book.setAvailable(false);

    System.out.println("Loan registered successfully. Loan ID: " + loanId);
}
    public static void returnLoan() {
    System.out.print("Enter Loan ID to return: ");
    String loanId = sc.nextLine();

    Loan foundLoan = null;
    for (Loan l : loans) {
        if (l.getId().equals(loanId)) {
            foundLoan = l;
            break;
        }
    }

    if (foundLoan == null) {
        System.out.println("Loan not found.");
        return;
    }

    if (foundLoan.getStatus().equals("RETURNED")) {
        System.out.println("This loan was already returned.");
        return;
    }

    foundLoan.setStatus("RETURNED");
    foundLoan.getLoanBook().setAvailable(true);

    System.out.println("Loan returned successfully.");
}
}

