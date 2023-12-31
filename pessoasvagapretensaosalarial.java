import java.util.Scanner;

public class pessoasvagapretensaosalarial {
    String nome;
    String vagas;
   int pretensaosalarial;
    public void verifica(String nome,String vagas, int pretensaosalarial){
        this.nome = nome;
        this.vagas = vagas;
        this.pretensaosalarial = pretensaosalarial;
    }
    public void perguntas(){
       Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        nome = sc.nextLine();
        System.out.println("Qual vaga você esta prestando?");
        vagas = sc.nextLine();
        System.out.println("Qual o salario que voce deseja?");
        pretensaosalarial = sc.nextInt();
    }
      public void Apresentações(){
        System.out.println("Olá," + nome + "!" + "Seja bem-vindo");
        System.out.println("Temos muitas vagas para" + vagas +"!"+ "Deu sorte!!");
       if(pretensaosalarial <= 10000){
            System.out.println("Salário Perfeito para nós");
       }else if(pretensaosalarial <= 15000){
           System.out.println("Vamos negociar");
       }else{
           System.out.println("Salário muito alto");
       }

    }
}

