import java.util.Scanner;

public class depositarsaldonobanco {
double saldo;
double deposito;
double sacar;
    public void verifica(double saldo,double deposito,double sacar){
        this.saldo = saldo;
        this.deposito = deposito;
        this.sacar = sacar;
    }
    public void sacar(){
     if(sacar > saldo){
         System.out.println("Erro! Tente Novamente");
     }else{
         sacar= saldo - sacar;
     }
    }
    public void deposito(){
    saldo = deposito + saldo;
    }
    public void pratica(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o seu saldo?");
        saldo = scan.nextInt();
        System.out.println(saldo);
        System.out.println("Quando voce quer depositar?");
         deposito = scan.nextInt();
        saldo = deposito + saldo;
        System.out.println(saldo);
        System.out.println("Quanto voce quer sacar?");
        sacar = scan.nextInt();
        if (sacar > saldo){
            System.out.println("Opa, não tem dinheiro");
        }else{
            saldo = saldo - sacar;
            System.out.println("Saque feito!!!!!!!");
            System.out.println(saldo);
        }
    }
}
