package AllProblemsOfUri;

import java.util.Scanner;

public class Difference1007 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("give A : ");
        int a=scanner.nextInt();
        System.out.println("give B :");
        int b= scanner.nextInt();

        System.out.println("give C :");
        int c=scanner.nextInt();

        System.out.println("give d : ");
        int d=scanner.nextInt();


        int result =  a*b-c*d;
        System.out.println("DIFERENCA = "+result);

    }
}
