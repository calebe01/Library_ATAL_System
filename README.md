# Documentação do Projeto

## Estrutura de Dados Utilizada

No projeto, utilizamos uma **Lista Encadeada** como estrutura de dados principal, implementada na classe `LinkedList.java`. Esta escolha foi feita para permitir inserções e remoções eficientes de elementos, o que é particularmente útil para o gerenciamento dinâmico de uma coleção de livros.

A lista encadeada é composta de nós, representados pela classe `Noh.java`. Cada nó contém um objeto da classe `Collection.java`, que armazena informações sobre um livro (título, autor e ano), e uma referência para o próximo nó na lista. Essa abordagem facilita a inserção de novos livros na lista sem a necessidade de redimensionamento, diferentemente de uma estrutura baseada em arrays.

### Vantagens da Lista Encadeada:
- **Inserção e remoção rápidas:** Não é necessário mover outros elementos, apenas ajustar as referências dos nós.
- **Uso dinâmico de memória:** A memória é alocada conforme necessário, evitando desperdícios.

## Algoritmos de Ordenação Utilizados

Para ordenar os livros na lista encadeada, foi implementado o algoritmo **Bubble Sort**, disponível no método `bubbleSortByTitle()` na classe `LinkedList.java`. Este método organiza os livros em ordem alfabética com base nos títulos.

### Escolha do Bubble Sort:
O **Bubble Sort** foi escolhido por sua simplicidade de implementação e porque a lista encadeada permite fácil acesso e troca de elementos adjacentes. Embora o Bubble Sort tenha complexidade O(n²) no pior caso, o que o torna menos eficiente para grandes listas, ele é adequado para este projeto devido ao número limitado de elementos (livros).

### Funcionamento do Bubble Sort na Lista Encadeada:
1. **Comparação de Elementos:** Cada par de nós adjacentes é comparado com base no título do livro.
2. **Troca de Elementos:** Se os elementos estiverem fora de ordem, suas posições são trocadas ajustando as referências dos nós.
3. **Repetição do Processo:** O processo é repetido até que toda a lista esteja ordenada.

## Conclusão

A combinação da lista encadeada com o Bubble Sort oferece uma solução simples e funcional para o gerenciamento e ordenação de uma coleção de livros neste projeto. Apesar das limitações de desempenho do Bubble Sort, sua facilidade de implementação e a eficiência das operações da lista encadeada o tornam uma escolha prática para o contexto atual.
