# Sistema de Gerenciamento de Livros

Este projeto é um sistema simples de gerenciamento de livros desenvolvido em Java, utilizando uma lista encadeada para armazenar e organizar os livros sem o uso do Collections Framework.

## Funcionalidades

- **Adicionar Livros**: Permite adicionar livros com informações de título, autor e ano de publicação.
- **Listar Livros**: Possibilidade de listar os livros na ordem original ou ordenados por título utilizando o algoritmo Bubble Sort.
- **Buscar Livros**: Função para buscar livros por autor, exibindo todos os livros correspondentes.

## Estrutura de Dados Utilizada

- **Lista Encadeada**: Utilizada para armazenar os objetos de livros (`Collection`). A lista é implementada manualmente sem o uso de bibliotecas prontas, como o `ArrayList`.
- **Nós (`Noh`)**: Cada nó armazena um objeto de livro e uma referência para o próximo nó na lista.

## Algoritmo de Ordenação

- **Bubble Sort**: Implementado para ordenar os livros por título. O algoritmo é simples e fácil de entender, ideal para fins educacionais e para ilustrar como funcionam os algoritmos de ordenação básicos.

## Como Usar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
