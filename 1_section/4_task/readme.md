### **Funcionamento da Memória do Computador:**

- A memória do computador é onde os dados e programas são armazenados para execução. Ela é dividida em diferentes partes, como a memória RAM (Random Access Memory) e a memória de armazenamento permanente (disco rígido ou SSD).

- A RAM é utilizada para armazenar temporariamente dados e instruções que estão sendo usados ativamente pelo computador enquanto ele está ligado. Quando o programa é executado, os dados são carregados na memória RAM para serem acessados rapidamente pelo processador.

- Cada variável em um programa consome uma certa quantidade de memória, dependendo do seu tipo de dado.

#### **O que são Tipos de Dados?**
- Os tipos de dados são a base para armazenar informações em um programa. Eles definem o tipo de valor que uma variável pode conter.

#### **Tipos de Dados em Portugol:**
- **Inteiro:** Armazena números inteiros, positivos ou negativos.
  - Exemplo: `inteiro idade = 25;`

- **Real:** Armazena números decimais.
  - Exemplo: `real altura = 1.75;`

- **Caractere:** Armazena um único caractere.
  - Exemplo: `caractere letra = 'A';`

- **Lógico:** Armazena valores lógicos verdadeiro ou falso.
  - Exemplo: `logico aprovado = verdadeiro;`

#### **Analogia dos Tipos de Dados:**
- Imagine uma caixa onde você guarda diferentes itens. Cada tipo de caixa (tipo de dado) comporta um tipo específico de item (valor).

### **Estruturas Condicionais:**

#### **Estrutura Condicional Simples:**
se (condição) então
    // Código a ser executado se a condição for verdadeira
fimse

Exemplo:
se idade >= 18 então
    escreva("Você é maior de idade.");
fimse

#### **Estrutura Condicional Composta:**
se (condição) então
    // Código a ser executado se a condição for verdadeira
senão
    // Código a ser executado se a condição for falsa
fimse

Exemplo:
se idade >= 18 então
    escreva("Você é maior de idade.");
senão
    escreva("Você é menor de idade.");
fimse

#### **Estrutura Condicional Encadeada (Aninhada):**
se (condição1) então
    // Código a ser executado se a condição1 for verdadeira
senão se (condição2) então
    // Código a ser executado se a condição2 for verdadeira
senão
    // Código a ser executado se nenhuma das condições anteriores for verdadeira
fimse

Exemplo:
se idade < 18 então
    escreva("Você é menor de idade.");
senão se idade == 18 então
    escreva("Você tem 18 anos.");
senão
    escreva("Você é maior de idade.");
fimse

### **Boas Práticas de Programação:**

- **Nomenclatura Descritiva:** Use nomes de variáveis que descrevam o seu propósito.
- **Comentários Adequados:** Explique o que o código faz para facilitar a compreensão.
- **Evite Códigos Longos:** Divida o código em partes menores e mais compreensíveis.
- **Indentação e Organização:** Mantenha o código bem estruturado para facilitar a leitura.
- **Evite Repetições Desnecessárias:** Use funções ou loops para evitar duplicações.
