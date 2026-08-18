package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Client> clients = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();
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
}

