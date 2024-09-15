package entities;

public class LinkedList {
    private Noh head;  
    public LinkedList() {
        this.head = null;  
    }

    
    public void add(Collection collection) {
        Noh newNode = new Noh(collection);  
        if (head == null) {  
            head = newNode;  
        } else {
            Noh current = head;  
            while (current.proximo != null) {  
                current = current.proximo;
            }
            current.proximo = newNode;  
        }
    }

    public void list() {
        Noh current = head;  
        while (current != null) {  
            System.out.println("Título: " + current.data.getTitulo() + 
                               ", Autor: " + current.data.getAutor() + 
                               ", Ano: " + current.data.getAno());
            current = current.proximo;  
        }
    }

    public void searchByAuthor(String author) {
        Noh current = head;
        boolean found = false;
        while (current != null) {
            if (current.data.getAutor().equalsIgnoreCase(author)) {
                System.out.println("Title: " + current.data.getTitulo() +
                                   ", Author: " + current.data.getAutor() +
                                   ", Year: " + current.data.getAno());
                found = true;
            }
            current = current.proximo;
        }
        if (!found) {
            System.out.println("No books found by author: " + author);
        }
    }

    // Método para ordenar os livros por título usando Bubble Sort
    public void bubbleSort() {
        if (head == null) return; // Se a lista estiver vazia, não há nada para ordenar

        // Contar o número de nós na lista
        int size = 0;
        Noh current = head;
        while (current != null) {
            size++;
            current = current.proximo;
        }

       
        for (int i = 0; i < size - 1; i++) {
            Noh currentNode = head;
            Noh nextNode = head.proximo;
            for (int j = 0; j < size - 1 - i; j++) {
                // Comparar os títulos dos livros
                if (currentNode.data.getTitulo().compareToIgnoreCase(nextNode.data.getTitulo()) > 0) {
                    // Trocar os dados entre os nós
                    Collection temp = currentNode.data;
                    currentNode.data = nextNode.data;
                    nextNode.data = temp;
                }
                currentNode = nextNode;
                nextNode = nextNode.proximo;
            }
        }
    }

    
    public void initializeBooks() {
        String[][] books = {
            {"Clean Code", "Robert C. Martin", "2008"},
            {"Design Patterns", "Erich Gamma et al.", "1994"},
            {"The Pragmatic Programmer", "Andrew Hunt, David Thomas", "1999"},
            {"Refactoring", "Martin Fowler", "1999"},
            {"Code Complete", "Steve McConnell", "2004"},
            {"The Mythical Man-Month", "Frederick P. Brooks Jr.", "1975"},
            {"Head First Design Patterns", "Eric Freeman et al.", "2004"},
            {"Continuous Delivery", "Jez Humble, David Farley", "2010"},
            {"Introduction to the Theory of Computation", "Michael Sipser", "1997"},
            {"Software Architecture Patterns", "Mark Richards", "2015"},
            {"Structure and Interpretation of Computer Programs", "Harold Abelson, Gerald Jay Sussman", "1984"},
            {"Patterns of Enterprise Application Architecture", "Martin Fowler", "2002"},
            {"Domain-Driven Design", "Eric Evans", "2003"},
            {"You Don't Know JS", "Kyle Simpson", "2014"},
            {"The Art of Computer Programming", "Donald E. Knuth", "1968"},
            {"Clean Architecture", "Robert C. Martin", "2017"},
            {"Working Effectively with Legacy Code", "Michael Feathers", "2004"},
            {"Designing Data-Intensive Applications", "Martin Kleppmann", "2017"},
            {"Artificial Intelligence: A Modern Approach", "Stuart Russell, Peter Norvig", "1995"},
            {"The Phoenix Project", "Gene Kim et al.", "2013"}
        };

        

       
        for (String[] bookInfo : books) {
            Collection book = new Collection();
            book.setTitulo(bookInfo[0]);
            book.setAutor(bookInfo[1]);
            book.setAno(bookInfo[2]);
            add(book);
        }
    }
}
