package AllProblemsOfUri;

import java.util.Scanner;

public class Average1_1005 {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("enter the first floating number : ");
        Float numberOne =scanner.nextFloat();
        System.out.println("Enter the second floating number : ");
       Float numberTwo= scanner.nextFloat();

       Float Average=numberOne+numberTwo;
       Average=Average/2;

        System.out.println("MEDIA = "+String.format("%.4f",Average));




    }


}
