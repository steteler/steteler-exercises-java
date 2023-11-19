# Atalhos

- [O que são Classes?](#-o-que-são-classes-no-java)
- [O que é o Método Main?](#-o-que-é-o-método-main-no-java)
- [O que são Modificadores de Acesso?](#-o-que-são-modificadores-de-acesso-no-java)
- [O que são Pacotes?](#-o-que-são-pacotes-no-java)
- [O que são Classes Wrappers?](#-o-que-são-classes-wrapper-em-java)
- [Referências](#-referências)
- [Comandos Iniciais](#️-comandos-iniciais-java)


# 🏠 O que são classes no Java?

**Explicação técnica:** As classes são a estrutura básica da programação orientada a objetos em Java. Elas definem
os atributos e comportamentos de um objeto através de variáveis e métodos. A classe funciona como um modelo a partir
do qual são criados objetos.

**Sintaxe básica:**

```java
public class MinhaClasse {

  // Atributos
  tipo nomeVariavel; 
  
  // Métodos
  tipoRetorno nomeMetodo(parametros) {
    //código
  }

}
```

**Explicação simples:** As classes em Java são como modelos para construir objetos, assim como as plantas de uma
casa são os modelos para construí-la. A classe define que tipo de dados (atributos) e funcionalidades (métodos)
os objetos terão.

A partir de uma classe podemos criar muitos objetos com as mesmas características, mas cada um com valores
distintos, como casas construídas a partir da mesma planta, mas decoradas de forma diferente.


# 🚪 O que é o método main no Java?

**Explicação técnica:** O método main é o ponto de entrada de uma aplicação Java. Ele é o código que será
executado quando o programa for iniciado.

**Sintaxe básica:**

```java
public static void main(String[] args) {
  // código do programa
}
```

Onde `public` e `static` são modificadores de acesso, `void` significa que não há retorno e `String[] args` representa
a entrada de parâmetros. 

**Explicação simples:** O método main é como a porta de entrada de uma casa. Quando você chega em uma casa, a porta
de entrada é por onde você passa para acessar tudo que está dentro dela.

No Java, o método main funciona assim: todo o código que estiver dentro dele será executado assim que o programa
for iniciado, permitindo acessar o restante da aplicação Java a partir daí.


# 🔐 O que são modificadores de acesso no Java?

**Explicação técnica:** Os modificadores de acesso definem a visibilidade e o escopo dos membros de
uma classe Java (atributos, métodos, classes internas, etc). Os principais são:

- `public` - visível por todas as outras classes
- `protected` - visível para classe, pacote e sub-classes  
- `private` - visível apenas na própria classe
- default (sem modificador) - visível apenas no pacote

**Explicação simples:** Os modificadores de acesso funcionam como controles de segurança, definindo até
onde cada parte do código pode ser acessada dentro de um programa Java.

O modificador `public` torna um membro totalmente visível, como uma casa sem muros e portões.

O `private` torna o membro visível apenas dentro da própria classe, como os cômodos de uma casa trancados com chave.

O `protected` permite acesso para classes do mesmo pacote e sub-classes, um controle intermediário de acesso.


# 📦 O que são pacotes no Java? 

**Explicação técnica:** Pacotes em Java são diretórios que agrupam classes relacionadas, fornecendo modulação
e evitando conflitos entre nomes de classes.

Sintaxe: 

```java
package nome.do.pacote; 
```

Os pacotes são declarados no início do código das classes Java e indicam sua localização na hierarquia de diretórios.

**Explicação simples:** Os pacotes funcionam como gavetas ou pastas para organizar o código Java. Eles
agrupam classes com funções relacionadas, como classes de conexão com bancos de dados, classes de interface gráfica,
classes de cálculos matemáticos, etc.

Isso ajuda a manter o projeto modularizado e as funcionalidades organizadas, além de evitar conflitos entre
nomes de classes. É como organizar a cozinha com gavetas para talheres, pratos, temperos e assim por diante.


# 🎁 O que são classes wrapper em Java?

**Explicação técnica:** As classes wrapper são versões orientadas a objeto dos tipos primitivos em Java. Elas
"embrulham" tipos como int, double, boolean, etc em objetos, permitindo utilizar funcionalidades de classe como
métodos e atributos nesses tipos de dados.

Exemplos: Integer, Double, Boolean, Character, etc.

**Explicação simples:** As classes wrapper são como embalagens ou contêineres que convertem os tipos primitivos
de Java em objetos. Isso permite adicionar funcionalidades aos tipos primitivos, como métodos para converter string
para int, comparar valores, obter valores máximos e mínimos, etc.

Por exemplo, a classe Integer provê métodos úteis para o tipo primitivo int, como parseInt() para converter
string para int e compareTo() para comparação. Assim fica mais fácil de trabalhar com esses tipos no Java.


# 🖥️ Comandos iniciais Java:

- `System.out.print`: imprime um texto na saída padrão sem quebra de linha.
- `System.out.println`: imprime um texto e depois quebra a linha.  
- `import`: importa classes de outros pacotes Java.

# 🔗 Referências

- [Diagrama JDK, JRE e JVM](https://www.techcrashcourse.com/2017/02/difference-between-jdk-jre-and-jvm.html)
