import java.util.ArrayList;
import java.util.Scanner;

public class Servicos {

    Scanner scanner = new Scanner(System.in);

    public int opcao() {
        System.out.println("Digite a opção Desejada:");
        System.out.println("[1] Adicionar Livros");
        System.out.println("[2] Listar Livros");
        System.out.println("[3] Empréstimo de Livros");
        System.out.println("[4] Devolver Livro");
        System.out.println("[5] Excluir Livros");
        System.out.println("[6] Encerrar Programa");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        return opcao;
    }

    // Função de Adicionar Livro
    public Livro adicionarLivro(int id) {
        System.out.println("Digite o Título do Livro:");
        String titulo = scanner.nextLine();

        System.out.println("Digite o Nome do Autor:");
        String autor = scanner.nextLine();

        System.out.println("Digite o Ano do Livro:");
        int ano = scanner.nextInt();
        scanner.nextLine();

        Livro livro = new Livro(id, titulo, autor, ano);

        System.out.println("Livro adicionado com Sucesso!");
        System.out.println();

        return livro;
    }

    // Função Listar Livros
    public  void listarLivros(ArrayList<Livro> livros) {
        if (livros.isEmpty()) {
            System.out.println();
            System.out.println("Nenhum Livro Cadastrado em nosso Sistema!");
            System.out.println();
            return;
        }
        System.out.println();
        System.out.println("Lista de Livros: ");
        for (int i = 0; i < livros.size(); i++) {
            System.out.println(livros.get(i).toString());
        }
        System.out.println();
    }

    // Função Emprestar Livro
    public void emprestarLivro(ArrayList<Livro> livros, int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                if (livro.getDisponibilidade()) {
                    livro.setDisponibilidade(false);
                    System.out.println();
                    System.out.println("Livro emprestado com sucesso: " + livro.getTitulo());
                    System.out.println();
                } else {
                    System.out.println();
                    System.out.println("Este livro já está emprestado!");
                    System.out.println();
                }
                return;
            }
        }


        System.out.println();
        System.out.println("Livro com ID " + id + " não encontrado!");
        System.out.println();
    }

}
