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
          File obj=new File("src/Exercitiu2/in.txt");
          Scanner read=new Scanner(obj);
          double sum=0;
         double min = Double.MAX_VALUE;
         double max=Double.MIN_VALUE;
         int count=0;
          while(read.hasNext())
          {
              /*String data=read.nextLine();
              System.out.println(data);*/
              double number=Double.parseDouble(read.nextLine());
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
          read.close();
          double average=sum/count;
          System.out.println("Suma: " + sum);
          System.out.println("Media aritmetică: " + average);
          System.out.println("Valoarea minimă: " + min);
          System.out.println("Valoarea maximă: " + max);


          FileWriter writer=new FileWriter("src/Exercitiu2/out.txt");
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
