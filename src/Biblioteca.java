import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Livro> livros = new ArrayList<>();

        Servicos servicos = new Servicos();

        boolean parar = false;
        int id_livro = 1;
        do{
            int opcao = servicos.opcao();

            switch (opcao) {
                case 1:
                    livros.add(servicos.adicionarLivro(id_livro));
                    id_livro++;
                    break;
                case 2:
                    servicos.listarLivros(livros);
                    break;
                case 3:
                    System.out.println("Digite o ID do Livro que deseja emprestar:");
                    id_livro = scanner.nextInt();
                    servicos.emprestarLivro(livros, id_livro);
                    break;
                case 4:
                    System.out.println("Digite o ID do Livro que deseja devolver:");
                    id_livro = scanner.nextInt();
                    servicos.devolverLivro(livros, id_livro);
                    break;
                case 5:
                    System.out.println("Digite o ID do Livro que deseja remover:");
                    id_livro = scanner.nextInt();
                    servicos.removerLivro(livros, id_livro);
                    break;
                case 6:
                    parar = true;
                    System.out.println("Encerrando!");
                    break;
            }
        }while(!parar);

    }
}
