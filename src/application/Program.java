package application;
import entities.*;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList bookShelf = new LinkedList(); 
        
        bookShelf.initializeBooks();
        
        int option;

        do {
            System.out.println("\n=== Virtual Library ===");
            System.out.println("Choose an option:");
            System.out.println("1) Add a new book");
            System.out.println("2) List books");
            System.out.println("3) Search books by author");
            System.out.println("4) Exit");
            System.out.print("Option: ");
            option = sc.nextInt();
            sc.nextLine();
            
            switch(option) {
                case 1:
                    System.out.println("\n>> Add Book <<");
                    System.out.print("Enter the book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter the book author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter the publication year: ");
                    String year = sc.nextLine();
                    
                    
                    Collection book = new Collection();
                    book.setTitulo(title);
                    book.setAutor(author);
                    book.setAno(year);
                    
                    bookShelf.add(book);
                    System.out.println("Book added successfully!");
                    break;
                case 2:
                    System.out.println("\n>> List Books <<");
                    System.out.println("Choose a listing option:");
                    System.out.println("1) Original order");
                    System.out.println("2) Sorted by title");
                    System.out.print("Option: ");
                    int listOption = sc.nextInt();
                    sc.nextLine();
                    if (listOption == 1) {
                        System.out.println("\nListing books in original order:");
                        bookShelf.list();  
                    } else if (listOption == 2) {
                        System.out.println("\nListing books sorted by title:");
                        bookShelf.bubbleSort();  
                        bookShelf.list();  
                    } else {
                        System.out.println("Invalid option. Returning to the main menu.");
                    }
                    break;
                case 3:
                    System.out.println("\n>> Search Books by Author <<");
                    System.out.print("Enter the author's name: ");
                    String searchAuthor = sc.nextLine();
                    System.out.println("Searching for books by: " + searchAuthor);
                    bookShelf.searchByAuthor(searchAuthor); 
                    break;
                case 4:
                    System.out.println("\nThank you for using the library system!");
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (option != 4);
        
        sc.close();
    }
}
