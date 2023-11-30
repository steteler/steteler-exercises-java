# Atalhos 💨

- [O que são Estruturas Condicionais?](#-estruturas-condicionais)
- [O que são Estruturas de Repetição?](#-estruturas-de-repetição)
- [O que é Conversão de Variáveis?](#-conversão-de-variáveis)
- [Referências](#-referências)

---

# ⚙️ Estruturas Condicionais

**Explicação Técnica:**
Estruturas condicionais são utilizadas para controlar o fluxo do programa baseado em condições. No Java, as principais estruturas condicionais são o `if`, `else if` e `else`, além do `switch-case`. O `if` permite executar um bloco de código se uma condição for verdadeira. O `switch-case` é usado para avaliar uma expressão e executar diferentes blocos de código com base no valor dessa expressão.

**Explicação Simples:**
É como tomar decisões em um jogo: se algo acontecer, você faz uma ação específica; senão, faz outra coisa.

**Sintaxe / Exemplo:**

```java
int idade = 18;
if (idade >= 18) {
    System.out.println('Pode dirigir!');
} else {
    System.out.println('Não pode dirigir.');
}
```

---

# ⏳ Estruturas de Repetição

**Explicação Técnica:**
Estruturas de repetição são utilizadas para executar um bloco de código várias vezes, enquanto uma condição for verdadeira. Em Java, temos o `for`, `while` e `do-while`. O `for` é útil para repetir um bloco de código um número específico de vezes. O `while` executa um bloco de código enquanto uma condição é verdadeira. O `do-while` executa o bloco de código pelo menos uma vez e depois verifica a condição.

**Explicação Simples:**
É como repetir um exercício várias vezes até ficar bom nele, mas cada estrutura tem sua própria maneira de começar e parar.

**Sintaxe / Exemplo:**

```java
for (int i = 0; i < 5; i++) {
    System.out.println('Número: ' + i);
}
```

---

# ↔️ Conversão de Variáveis

**Explicação Técnica:**
A conversão de variáveis envolve transformar um tipo de dado em outro. No Java, existem conversões implícitas (quando ocorrem automaticamente de um tipo compatível para outro) e conversões explícitas (quando é necessário indicar a mudança de tipo). Isso pode ser útil ao lidar com diferentes tipos de dados ou ao realizar operações entre eles.

**Explicação Simples:**
É como transformar água em gelo e vice-versa. Às vezes, acontece automaticamente; outras vezes, precisamos fazer algo para mudar.

**Sintaxe / Exemplo:**

```java
int numeroInteiro = 10;
double numeroDecimal = numeroInteiro; // Conversão implícita

double valorDecimal = 20.5;
int valorInteiro = (int) valorDecimal; // Conversão explícita"
```

---

# 🔗 Referências

- [Trybe - Aceleração Java](https://betrybe.com/)
