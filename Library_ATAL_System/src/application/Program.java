package application;
import entities.*;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList bookShelf = new LinkedList(); // Cria uma instância da lista encadeada
        
        // Inicializa a lista com 20 livros
        bookShelf.initializeBooks();
        
        int option;

        do {
            System.out.println("\nOptions:\n1) Add book\n2) List books\n3) Search books by author\n4) Exit");
            option = sc.nextInt();
            sc.nextLine();
            
            switch(option) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter book author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter book year: ");
                    String year = sc.nextLine();
                    
                    // Cria um novo objeto Collection e adiciona à lista
                    Collection book = new Collection();
                    book.setTitulo(title);
                    book.setAutor(author);
                    book.setAno(year);
                    
                    bookShelf.add(book);
                    break;
                case 2:
                    System.out.println("\nList Options:\n1) List original order\n2) List sorted by title");
                    int listOption = sc.nextInt();
                    sc.nextLine();
                    if (listOption == 1) {
                        System.out.println("Listing books in original order:");
                        bookShelf.list();  // Lista os livros na ordem original
                    } else if (listOption == 2) {
                        System.out.println("Listing books sorted by title:");
                        bookShelf.bubbleSortByTitle();  // Ordena os livros por título usando Bubble Sort
                        bookShelf.list();  // Lista os livros ordenados
                    } else {
                        System.out.println("Invalid option. Returning to main menu.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the author to search for: ");
                    String searchAuthor = sc.nextLine();
                    bookShelf.searchByAuthor(searchAuthor);  // Chama o método para buscar livros por autor
                    break;
                case 4:
                    System.out.println("Thank you for using the library system!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (option != 4);
        
        sc.close();
    }
}
