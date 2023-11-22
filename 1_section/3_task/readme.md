# ⁉️ Estruturas Condicionais em Java

`if` : executa um bloco de código se a condição for verdadeira.  

**Sintaxe:**

```java
if (condição) {
  // código a ser executado
}
```

`if/else` : executa um bloco se a condição for verdadeira, ou outro bloco se for falsa.

**Sintaxe:**

```java
if (condição) {
  // código 1
} else {
  // código 2
}
```

`if/else if/else` : verifica múltiplas condições e executa o primeiro bloco com condição verdadeira. Se todas forem falsas, executa o bloco `else`.

**Sintaxe:**

```java
if (condição 1) {
  // código 1
} else if (condição 2) {
  // código 2
} else {
  // código 3
}
```

`switch` : compara uma variável com múltiplos casos e executa o código do caso correspondente.  

**Sintaxe:**

```java
switch(variável) {
  case valor1: 
    // código 1
    break;
  case valor2:
    // código 2 
    break;
  default:  
    // código padrão  
}
```

# ♻️ Estruturas de Repetição em Java

`while` : executa um bloco de código enquanto a condição for verdadeira.

**Sintaxe:** 

```java
while (condição) {
  // código a executar
}
```

`do while` : executa um bloco de código e depois verifica a condição. O bloco é executado pelo menos uma vez.

**Sintaxe:**

```java
do {
  // código a executar 
} while (condição);
```

`for` : loop controlado por contador. Executa um bloco de código para cada valor do contador.

**Sintaxe:**

```java
for (inicialização; condição; incremento) {
  // código a executar
}
```

`for each` : percorre os elementos de uma coleção sem usar contador. 

**Sintaxe:**

```java
for (Tipo item : coleção) {
  // código para cada item
}
```
