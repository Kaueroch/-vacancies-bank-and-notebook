import java.util.ArrayList;
import java.util.Scanner;
public class anotações {
    ArrayList<String>anotações = new ArrayList<>();
    String anota;
    public void verificar(String anota){
        this.anota = anota;
    }
   public void anotar(){
       Scanner sc = new Scanner(System.in);
        System.out.println("Faça suas anotações abaixo!");
       System.out.println("Seja direto para facilitar sua compreensão!");
          anota = sc.next();
          anotações.add(anota);
          for( String an : anotações) {
          System.out.println(an);
          }
       ant();
    }
    public void ant(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Faça suas anotações abaixo!");
        anota = sc.next();
        anotações.add(anota);
        for( String an : anotações) {
            System.out.println(an);
      }
        ant();
     }
    }


