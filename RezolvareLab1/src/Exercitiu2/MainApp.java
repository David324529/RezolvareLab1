package Exercitiu2;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/*

2. Să se scrie un program care citește un set de numerele din fișierul de intrare in.txt, care
        conține câte un număr pe un rând, având valorile din figura 18. Programul va determină suma
        lor, media aritmetică, valoarea minimă, valoarea maximă, va afișa aceste valori pe ecran și le
        va scrie în fișierul de ieșire out.txt. Media aritmetică va fi afișată ca un număr real
*/
public class MainApp {
    public static void main(String[] args) {
        try
        {
            // Deschidem fișierul de intrare pentru citire
            File obj=new File("src/Exercitiu2/in.txt");
            Scanner read=new Scanner(obj);
            double sum=0;
            int min = Integer.MAX_VALUE; //valoarea minima= cu maxim
            int max=Integer.MIN_VALUE;   //valoarea maxima=cu minim
            int count=0;

            // Citim și procesăm datele din fișier
            while(read.hasNext())
            {
              /*String data=read.nextLine();
              System.out.println(data);*/
                int number=Integer.parseInt(read.nextLine());// Convertim șirul la un număr întreg
                sum+=number;
                count++;
                if(number<min)
                {
                    min=number;
                }
                if(number>max)
                {
                    max=number;
                }
            }
            read.close(); // Închidem fișierul de intrare
            double average=sum/count;

            // Afișăm rezultatele pe consolă
            System.out.println("Suma: " + sum);
            System.out.println("Media aritmetică: " + average);
            System.out.println("Valoarea minimă: " + min);
            System.out.println("Valoarea maximă: " + max);

// Deschidem fișierul de ieșire pentru scriere
            FileWriter writer=new FileWriter("src/Exercitiu2/out.txt");

            // Scriem rezultatele în fișierul de ieșire
            writer.write("Suma este: "+sum);
            writer.write("\nMedia aritemetica: "+average);
            writer.write("\nValoarea minima: "+min);
            writer.write("\nValoarea maxima: "+max);
            writer.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
