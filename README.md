# Documentação do Projeto

## Estrutura de Dados

Usamos uma **Lista Encadeada** (`LinkedList.java`) para gerenciar os livros, facilitando inserções e remoções rápidas através de nós (`Noh.java`). Cada nó guarda um livro (`Collection.java`) e uma referência para o próximo.

### Por que Lista Encadeada?
- **Inserção e remoção rápidas**: Apenas ajusta referências.
- **Uso eficiente de memória**: Só aloca o necessário.

## Algoritmo de Ordenação

Implementamos o **Bubble Sort** (`bubbleSortByTitle()`) para ordenar os livros por título na lista encadeada. Simples e direto, é suficiente para o número de livros que temos.

## Conclusão

A lista encadeada com Bubble Sort é uma solução prática e simples para organizar a coleção de livros, funcionando bem para o nosso contexto atual.
