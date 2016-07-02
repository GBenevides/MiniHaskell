# MiniHaskell


Este projeto deve ser realizado em grupo de ate três pessoas. Enriqueça a implementação MiniHaskell03 de acordo com os seguintes itens:

-novas expressoes logicas (and, or, not), expressoes envolvendo inteiros (*, /, -) e operadores relacionais (==, !=, <, >, <=, >=)

-casos de testes para as expressoes Let e Aplicacao de Funcao
      -o que ocorre com a expressao "let x = 10 in let x = 5 in x + x" ?
      -o que ocorre com "fat 5", onde "fat n = if (n == 0) then 1 else n * fat (n - 1)" ?
      
-Escrever mais testes para a expressão *aplicação de função*

-Corrigir os visitors implementados, mas que estão "quebrados" na versão 03 da implementação do projeto MiniHaskell.

-Incluir suporte ao tipo Lista, que pode ser uma lista vazia ou uma lista com um elemento seguido de uma outra lista (é um tipo recursivo). Em Haskell, seria algo como:  "data List a = Nill | a (List a)"

-Escreva funções que manipulam listas (tamanho, elemento em uma posicao especifica, ...).

-Implementar um parser e um programa para interpretar MiniHaskell
