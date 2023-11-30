# Atalhos 💨

- [O que é Abstração?](#-abstração)
- [O que é o Encapsulamento?](#-encapsulamento)
- [O que são Construtores?](#-construtores)
- [O que são Atributos/Métodos?](#-atributos-/-métodos-de-classe-e-de-instância-e-suas-diferenças)
- [O que são Getters and Setters?](#-getters-and-setters)
- [O que são Modificadores de Acesso?](#️-modificadores-de-acesso)
- [O que é o This?](#️-this)
- [Referências](#-referências)

---

# 🧩 Abstração

**Explicação Técnica:**
Abstração é um conceito na programação que permite focar nos aspectos relevantes de um objeto, ignorando detalhes desnecessários. Em linguagens orientadas a objetos, a abstração é implementada através de classes, onde detalhes internos são ocultados e apenas a interface é exposta.

**Explicação Simples:**
Pense na abstração como um controle remoto de TV. Você não precisa saber como ele funciona por dentro, só precisa dos botões para mudar de canal ou ajustar o volume.

**Sintaxe/Exemplo do código simples:**

```java
abstract class Animal {
    public abstract void emitirSom();
}

class Cachorro extends Animal {
    public void emitirSom() {
        System.out.println('Au au!');
    }
}
```

---

# 💊 Encapsulamento

**Explicação Técnica:**
Encapsulamento é o conceito de ocultar os detalhes de implementação de uma classe e restringir o acesso direto aos dados. Em Java, isso é feito usando modificadores de acesso (public, private, protected) para controlar o acesso aos membros da classe.

**Explicação Simples:**
É como um cofre. Você não pode ver ou mexer diretamente no que está dentro, só pode interagir com ele usando as funcionalidades oferecidas (como a chave).

**Sintaxe/Exemplo do código simples:**

```java
class Carro {
    private String marca;
    private String modelo;

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
```

---

# 🏗️ Construtores

**Explicação Técnica:**
Construtores são métodos especiais que inicializam objetos de uma classe. Em Java, o construtor tem o mesmo nome da classe e é usado para inicializar os atributos do objeto quando ele é criado.

**Explicação Simples:**
O construtor é como uma receita de bolo que define como cada novo bolo (objeto) deve ser feito.

**Sintaxe/Exemplo do código simples:**

```
class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
```

---

# 💎 Atributos / Métodos de Classe e de Instância e suas Diferenças

**Explicação Técnica:**
Atributos de classe pertencem à classe como um todo, enquanto atributos de instância pertencem a instâncias individuais da classe. Métodos de classe operam na classe como um todo, enquanto métodos de instância operam em instâncias específicas.

**Explicação Simples:**
Imagine uma escola: o número total de salas é um atributo da escola (atributo de classe), enquanto o nome do aluno é um atributo específico de cada estudante (atributo de instância).

**Sintaxe/Exemplo do código simples:**

```java
class Exemplo {
    public static int atributoClasse = 0;
    private int atributoInstancia;

    public Exemplo(int valor) {
        this.atributoInstancia = valor;
    }

    public static int metodoClasse() {
        return atributoClasse;
    }

    public int metodoInstancia() {
        return atributoInstancia;
    }
}
```

---

# 👓 Getters and Setters

**Explicação Técnica:**
Getters são métodos que retornam o valor de atributos privados, e setters são métodos que modificam esses atributos. Eles são usados para controlar o acesso aos atributos privados de uma classe.

**Explicação Simples:**
Getters são como espiões que trazem informações secretas para você, e setters são como guardiões que cuidam e modificam essas informações secretas.

**Sintaxe/Exemplo do código simples:**

```
class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
    }
}
```

---

# 🔐 Modificadores de Acesso

**Explicação Técnica:**
São palavras-chave que definem o nível de acesso aos membros (atributos e métodos) de uma classe. Em Java, os principais modificadores de acesso são `public`, `protected` e `private`.

**Explicação Simples:**
É como as regras de uma festa: público é quando todos podem entrar, protegido é quando apenas os convidados têm acesso e privado é quando apenas você pode entrar no quarto.

**Sintaxe/Exemplo do código simples:**

```
class Exemplo {
    public int publico;
    protected int protegido;
    private int privado;
}
```

---

# 🙋‍♂️ This

**Explicação Técnica:**
`this` é uma referência à instância atual de uma classe em Java. É usado para acessar os membros da instância dentro dos métodos da classe.

**Explicação Simples:**
É como se a classe falasse consigo mesma, referindo-se aos seus próprios detalhes.

**Sintaxe/Exemplo do código simples:**

```java
class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void imprimirNome() {
        System.out.println(this.nome);
    }
}
```

---

# 🔗 Referências

- [Trybe - Aceleração Java](https://betrybe.com/)
