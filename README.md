# Desafio de Controle de Fluxo
 
## Desafio de Projeto
Vamos exercitar todo o conteúdo apresentado no módulo de Controle de Fluxo codificando o seguinte cenário.

O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console (System.out.print) dos números incrementados, exemplo:

Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo: "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.
Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de ParametrosInvalidosException com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro"
1. Crie o projeto DesafioControleFluxo
2. Dentro do projeto, crie a classe Contador.java para realizar toda a codificação do nosso programa.
3. Dentro do projeto, crie a classe ParametrosInvalidosException que representará a exceção de negócio no sistema.

Para ir ao conteúdo completo do desafio [GitHub - Trilha Java Básico](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo)

## Execução
Após executar o programa no terminal:
1. Insira o primeiro número inteiro
1.1. Insira o segundo número maior que o primeiro
![image](https://user-images.githubusercontent.com/54039360/210678411-850da0d6-fbe8-434e-995a-7e07f4d1eb22.png)

2. Insira qualquer valor ou caractere que não seja um número inteiro quando pedir o primeiro ou o segundo número, um erro será acusado e a aplicação retornará automaticamente para inserir os dados novamente até que seja inserido de maneira correta. O mesmo ocorre se o primeiro número inserido for menor que o segundo, porém a mensagem de erro será diferente.
