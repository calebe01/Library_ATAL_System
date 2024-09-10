package entities;

public class LinkedList {
    private Noh head;  
    public LinkedList() {
        this.head = null;  // A lista começa vazia
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
    
 
    public void bubbleSortByTitle() {
        if (head == null || head.proximo == null) return;  
        
        boolean swapped;
        do {
            swapped = false;
            Noh current = head;
            while (current.proximo != null) {
                if (current.data.getTitulo().toLowerCase().compareTo(current.proximo.data.getTitulo().toLowerCase()) > 0) {
                    // Troca dos dados dos nós
                    Collection temp = current.data;
                    current.data = current.proximo.data;
                    current.proximo.data = temp;
                    swapped = true;  
                }
                current = current.proximo;  
        } while (swapped);  
    }
    
    public void searchByAuthor(String author) {
        Noh current = head;  
        boolean found = false;  
        while (current != null) {  
            if (current.data.getAutor().equalsIgnoreCase(author)) {  // Verifica se o autor corresponde
                System.out.println("Título: " + current.data.getTitulo() + 
                                   ", Autor: " + current.data.getAutor() + 
                                   ", Ano: " + current.data.getAno());
                found = true;  
            }
            current = current.proximo;  // Move para o próximo nó
        }
        if (!found) {
            System.out.println("Nenhum livro encontrado para o autor: " + author);
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

        // Adiciona cada livro na lista encadeada
        for (String[] bookInfo : books) {
            Collection book = new Collection();
            book.setTitulo(bookInfo[0]);
            book.setAutor(bookInfo[1]);
            book.setAno(bookInfo[2]);
            add(book);
        }
    }

}
