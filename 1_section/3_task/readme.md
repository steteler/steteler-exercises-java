# ⁉️ Estruturas Condicionais em Java

`if` : executa um bloco de código se a condição for verdadeira.  

**Sintaxe:**

```java
if (condição) {
  // código a ser executado
}
```

`if/else` : executa o bloco de código do **if** se a condição for verdadeira, se não for verdadeira ele executa o bloco de código do **else**.

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

# 🔄 Conversão de Variáveis em Java

## Casting Implícito

Casting implícito é a conversão automática entre tipos compatíveis: 

```java
int numero = 10;
double decimal = numero; // implícito: int -> double
```

Outros exemplos:

```java
byte b = 10;  
short s = b; // byte -> short   

String texto = "ola";
Object obj = texto; // subtipo -> supertipo
```

## Casting Explícito    

Casting explícito requer uma conversão explícita (cast):

```java
double decimal = 10.5; 
int numero = (int)decimal; // explícito: double -> int
```

Outros exemplos:    

```java
Object obj = new String("text");   
String texto = (String)obj; // supertipo -> subtipo

float f = 10.5F;
long l = (long)f; // float -> long
```

## Tipos Primitivos e Não Primitivos   

```java
String texto = "10";
int numero = Integer.parseInt(texto); // String -> int   

int numero2 = 20; 
String texto2 = String.valueOf(numero2); // int -> String  

int primInt = 10;
Integer objInt = primInt; // autoboxing
   
Double objDouble = 10.5;  
double primDouble = objDouble; // unboxing
```
