package AllProblemsOfUri;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AverageConsumption
{

    public static void main(String[] args) {
      /*  BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
       */
       Scanner scanner=new Scanner(System.in);
        System.out.println("give the amount of litres :");
        float litres= scanner.nextFloat();
        System.out.println("type the amount of length you travelled : ");
        float km=scanner.nextFloat();

        float result;
        result= km/litres;
        System.out.println(result+" litres per km");


    }
}
