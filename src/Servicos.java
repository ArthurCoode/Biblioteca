import java.util.Scanner;

public class Servicos   {

    Scanner scanner = new Scanner(System.in);

    public int opcao(){
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
}
