package Exercitiu1;
/*1. Se cere să se scrie un program Java care să calculeze şi să afişeze perimetru şi aria unui
        dreptunghi. Valorile pentru lungime şi lățime se citesc de la tastatura. Sa se adauge un break
        point pe prima linie care citește valoarea unei laturi si din acel punct să se ruleze programul
        linie cu linie urmărind valorile variabilelor în memorie.*/
import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
      int a,b;
        System.out.println("Introduceti lungimea a: ");
         a=scanner.nextInt();
        System.out.println("Introduceti latimea b: ");
         b=scanner.nextInt();
         int Aria=a*b;
        System.out.println("Aria este: "+Aria);
          int Perimetru=2*a+2*b;
        System.out.println("Perimetru este: "+Perimetru);
    }
}
