package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printfInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        for(int i = 1; i<=3; i++) {
            String title = sc.nextLine();
            String author = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();

            books.add(new Book(title, author, price));
        }
        System.out.println("---------- LIST OF BOOKS ---------");
        for(Book  book : books) {
            book.printfInfo();
        }
    }
}
