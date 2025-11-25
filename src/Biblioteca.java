import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Livro> livros = new ArrayList<>();

        Servicos servicos = new Servicos();

        boolean parar = false;
        do{
            int opcao = servicos.opcao();

            switch (opcao) {
                case 1:
                    break;
                case 6:
                    parar = true;
                    System.out.println("Encerrando!");
                    break;
            }
        }while(!parar);

    }
}
