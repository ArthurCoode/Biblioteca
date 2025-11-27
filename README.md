# 📚 Sistema de Biblioteca em Java

Este é um sistema de gerenciamento de biblioteca desenvolvido em **Java**, totalmente executado pelo **terminal**.  
Ele permite adicionar, listar, emprestar, devolver e excluir livros de forma simples e eficiente.

---

## 🚀 Funcionalidades

Ao iniciar o programa, o seguinte menu é exibido:

Digite a opção desejada:
[1] Adicionar Livros
[2] Listar Livros
[3] Empréstimo de Livros
[4] Devolver Livro
[5] Excluir Livros
[6] Encerrar Programa


### 📌 Descrição das Funções

### **1️⃣ Adicionar Livros**
Adiciona um novo livro ao sistema com:
- ID  
- Título  
- Autor  
- Disponibilidade (inicialmente disponível)

### **2️⃣ Listar Livros**
Mostra todos os livros cadastrados, incluindo suas informações e status.

### **3️⃣ Empréstimo de Livros**
Realiza o empréstimo de um livro pelo ID.  
Se o livro já estiver emprestado, o sistema exibe um aviso.

### **4️⃣ Devolver Livro**
Altera o status de um livro emprestado para disponível.


### **5️⃣ Excluir Livros**
Permite remover um livro da lista informando seu ID.

### **6️⃣ Encerrar Programa**
Finaliza a execução do sistema.

---

## 🛠️ Tecnologias Utilizadas

- **Java (JDK 17+)**
- **POO — Programação Orientada a Objetos**
- **Scanner (entrada de dados)**
- **ArrayList para gerenciamento dos livros**

---

## 📂 Estrutura do Projeto

/Biblioteca
│── src/
│ ├── Biblioteca.java // Classe principal com menu
│ ├── Livro.java // Classe modelo de Livro
│ └── Servicos.java // Regras de negócio


---

## ▶️ Como Executar

1. Instale o **Java JDK**.
2. Compile os arquivos:
javac *.java
3. Execute:

