package entities;

public class LinkedList {
    private Noh head;  // Referência para o primeiro nó da lista

    public LinkedList() {
        this.head = null;  // A lista começa vazia
    }

    // Método para adicionar um novo livro à lista
    public void add(Collection collection) {
        Noh newNode = new Noh(collection);  // Cria um novo nó com o objeto Collection
        if (head == null) {  // Se a lista estiver vazia
            head = newNode;  // O novo nó se torna o primeiro nó (head)
        } else {
            Noh current = head;  // Começa do início da lista
            while (current.proximo != null) {  // Percorre até o último nó
                current = current.proximo;
            }
            current.proximo = newNode;  // Adiciona o novo nó ao final da lista
        }
    }

    // Método para listar todos os livros
    public void list() {
        Noh current = head;  // Começa do início da lista
        while (current != null) {  // Percorre a lista até o final
            System.out.println("Título: " + current.data.getTitulo() + 
                               ", Autor: " + current.data.getAutor() + 
                               ", Ano: " + current.data.getAno());
            current = current.proximo;  // Move para o próximo nó
        }
    }
    
 // Método para ordenar os livros por título usando Bubble Sort
    public void bubbleSortByTitle() {
        if (head == null || head.proximo == null) return;  // Se a lista estiver vazia ou com um único nó, não há o que ordenar
        
        boolean swapped;
        do {
            swapped = false;
            Noh current = head;
            while (current.proximo != null) {
                // Comparação ignorando diferenças entre maiúsculas e minúsculas
                if (current.data.getTitulo().toLowerCase().compareTo(current.proximo.data.getTitulo().toLowerCase()) > 0) {
                    // Troca dos dados dos nós
                    Collection temp = current.data;
                    current.data = current.proximo.data;
                    current.proximo.data = temp;
                    swapped = true;  // Indica que uma troca foi feita
                }
                current = current.proximo;  // Move para o próximo nó
            }
        } while (swapped);  // Continua enquanto houver trocas
    }
    
    public void searchByAuthor(String author) {
        Noh current = head;  // Começa do início da lista
        boolean found = false;  // Flag para verificar se encontrou algum livro
        while (current != null) {  // Percorre a lista até o final
            if (current.data.getAutor().equalsIgnoreCase(author)) {  // Verifica se o autor corresponde
                System.out.println("Título: " + current.data.getTitulo() + 
                                   ", Autor: " + current.data.getAutor() + 
                                   ", Ano: " + current.data.getAno());
                found = true;  // Marca que encontrou pelo menos um livro
            }
            current = current.proximo;  // Move para o próximo nó
        }
        if (!found) {
            System.out.println("Nenhum livro encontrado para o autor: " + author);
        }
    }

    // Método para inicializar a lista com 20 livros
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
