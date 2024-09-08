package entities;

public class Noh {
    Collection data;   // O objeto Collection armazenado no nó
    Noh proximo;       // Referência para o próximo nó

    // Construtor para inicializar o nó com um objeto Collection
    public Noh(Collection data) {
        this.data = data;
        this.proximo = null;  // Inicialmente, o próximo nó é nulo
    }
}
