
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
        System.out.println("Escolha um desses!");
        System.out.println("1-anotar");
        System.out.println("2-Banco");
        System.out.println("3-Vagas");

        int escolha = scan.nextInt();
        switch (escolha){
            case 1:
                anotações an = new anotações();
                an.anotar();
            break;
            case 2:
               depositarsaldonobanco banco = new depositarsaldonobanco();
               banco.pratica();
             break;
            case 3:
              pessoasvagapretensaosalarial vagas = new pessoasvagapretensaosalarial();
              vagas.perguntas();
              vagas.Apresentações();
            break;
        }
    }
}