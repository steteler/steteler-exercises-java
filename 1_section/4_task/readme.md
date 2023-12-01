# Atalhos 💨

- [O que é Gerenciador de Dependências Maven?](#-gerenciador-de-dependências-maven)
- [O que é Gerenciador de Dependências Gradle?](#-gerenciador-de-dependências-gradle)
- [Diferença entre eles](#-diferença-entre-eles)
- [Referências](#-referências)

---

# 📦 Gerenciador de Dependências Maven

**Explicação Técnica:**
O Maven é uma ferramenta de automação de compilação usada principalmente para gerenciar dependências e construir projetos Java. Ele utiliza arquivos de configuração XML (POM - Project Object Model) para definir a estrutura do projeto, suas dependências, plugins e configurações de compilação.

**Explicação Simples:**
Imagine o Maven como um assistente de compras online que ajuda a encontrar e organizar todas as peças que você precisa para construir algo.

**Sintaxe/Exemplo do código ou Analogia:**

```java
<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-core</artifactId>
        <version>5.3.9</version>
    </dependency>
</dependencies>
```

---

# 📚 Gerenciador de Dependências Gradle

**Explicação Técnica:**
O Gradle é outra ferramenta de automação de compilação e gerenciamento de projetos. Ele utiliza uma DSL (Domain-Specific Language) baseada em Groovy ou Kotlin para descrever a estrutura do projeto e suas tarefas. O Gradle oferece flexibilidade e desempenho, permitindo a configuração detalhada do fluxo de construção.

**Explicação Simples:**
O Gradle é como um chef que cria uma receita personalizada para você, permitindo mais liberdade para definir cada etapa do processo de construção.

**Sintaxe/Exemplo do código ou Analogia:**

```java
dependencies {
    implementation 'org.springframework:spring-core:5.3.9'
}
```

---

# ↔️ Diferença entre eles

**Explicação Técnica:**
A diferença principal entre o Maven e o Gradle está na forma como definem e configuram os projetos. Enquanto o Maven utiliza arquivos XML e segue uma estrutura padrão, o Gradle utiliza scripts DSL baseados em Groovy ou Kotlin, oferecendo uma configuração mais flexível e expressiva.

**Explicação Simples:**
É como comparar um formulário predefinido (Maven) com a liberdade de escrever suas próprias instruções (Gradle) para alcançar o mesmo objetivo.

Maven:
- Utiliza XML para configuração.
- Estrutura padrão.
- Mais rígido em termos de configuração.

Gradle:
- Utiliza DSL (Groovy/Kotlin).
- Flexibilidade na definição do projeto.
- Permite uma configuração mais expressiva.

---

# 🔗 Referências

- [Trybe - Aceleração Java](https://betrybe.com/)
