````portugol
algoritmo "Operadores em Portugol"

var
    // Operadores de Atribuição
    inteiro numero = 10;
    inteiro a = 5;

    // Operadores Aritméticos
    inteiro resultadoSoma, resultadoSubtracao, resultadoMultiplicacao;
    real resultadoDivisao;
    inteiro restoDivisao;

    // Operadores Lógicos
    inteiro x = 5;
    inteiro y = 10;
    logico condicao1, condicao2, condicao3;

inicio
    // Operadores Aritméticos
    resultadoSoma = numero + a; // Soma
    resultadoSubtracao = numero - a; // Subtração
    resultadoMultiplicacao = numero * a; // Multiplicação
    resultadoDivisao = real(numero) / real(a); // Divisão
    restoDivisao = numero % a; // Resto da divisão

    // Operadores Lógicos
    condicao1 = (x > 3) E (y < 15); // Verdadeiro se x for maior que 3 E y for menor que 15
    condicao2 = (x == 5) OU (y == 5); // Verdadeiro se x for igual a 5 OU y for igual a 5
    condicao3 = NAO(x > 3); // Verdadeiro se x NÃO for maior que 3

    // Saída
    escreva("Resultado da Soma: ", resultadoSoma, "\n");
    escreva("Resultado da Subtração: ", resultadoSubtracao, "\n");
    escreva("Resultado da Multiplicação: ", resultadoMultiplicacao, "\n");
    escreva("Resultado da Divisão: ", resultadoDivisao, "\n");
    escreva("Resto da Divisão: ", restoDivisao, "\n");

    // Verificação lógica
    se(condicao1) entao
        escreva("Condição 1 é verdadeira.\n");
    senao
        escreva("Condição 1 é falsa.\n");

    se(condicao2) entao
        escreva("Condição 2 é verdadeira.\n");
    senao
        escreva("Condição 2 é falsa.\n");

    se(condicao3) entao
        escreva("Condição 3 é verdadeira.\n");
    senao
        escreva("Condição 3 é falsa.\n");

fimalgoritmo
