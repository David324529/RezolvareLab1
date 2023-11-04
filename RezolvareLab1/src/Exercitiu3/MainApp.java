package Exercitiu3;

/*3. Să se scrie un program care citește un număr n natural de la tastatură și afișează toți
        divizorii acestuia pe ecran. Dacă numărul este prim se va afișa un mesaj corespunzător.*/
import java.util.Scanner;


public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //citim de la tastatura
        System.out.println("a= ");
        int a = scanner.nextInt(); //citeste si atribuie valoarea lui a
        int i, numarDivizori=0;
        System.out.println("Divizorii lui " + a + " sunt: ");
        for (i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.println(i + " ");  //afisam divizorii
                numarDivizori++;       //numaram divizorii
            }

        }
        System.out.println();
        if( numarDivizori>2)   //daca are mai mult de 2 divizori nu este prim
        {
            System.out.println("Numarul nu este prim");
        }
        else
        {
            System.out.println("Numarul este prim");
        }

    }
}

