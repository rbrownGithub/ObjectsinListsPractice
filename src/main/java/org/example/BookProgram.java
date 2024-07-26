package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class BookProgram {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, pages, year));
        }

        System.out.print("What information will be printed? ");
        String printOption = scanner.nextLine();

        if (printOption.equalsIgnoreCase("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (printOption.equalsIgnoreCase("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }

        scanner.close();
    }
}
