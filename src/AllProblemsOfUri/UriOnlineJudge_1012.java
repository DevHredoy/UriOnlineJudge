package AllProblemsOfUri;

import java.util.Scanner;

public class UriOnlineJudge_1012 {

    public static void main(String[] args) {
     /*   first we have to take a b c

                the calculate triangle with the formula
                then circle
                        tripizium
                                square
                                rectangle*/

        System.out.println("please give three  floating values");

        Scanner scanner = new Scanner(System.in);
        float a=scanner.nextFloat();
        float b= scanner.nextFloat();
        float c=scanner.nextFloat();
        //for triangle
        float total=a*c;
        total=total/2;
        System.out.println("TRIANGULO : "+total);
        total=0;
        total= (float) (c*c*3.1416);

        System.out.println("CIRCULO : " +total);
        total=0;
        //A = ½ × (a + b) × h
        total=a+b;
        total=total*c;
        total=total/2;
        System.out.println("TRAPEZIO : "+total);
        total=0;


        //square



        total=b*b;
        System.out.println("QUADRADO : "+total);
        total=0;

        //rectangle

        total=a*b;
        System.out.println("RECTANGULO : " + total);


    }

}
