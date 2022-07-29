package AllProblemsOfUri;

import java.util.Scanner;


public class Salary1008 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter the number of the employee : ");

        int numberOfTHeEmployee=scanner.nextInt();
        System.out.println("please enter the number total work hour  of the employee : ");
        int totalHour=scanner.nextInt();
        System.out.println("please enter the unit cost of the employee : ");
            float unitCost=scanner.nextFloat();
        System.out.println("NUMBER = " +numberOfTHeEmployee);
        String formattString=String.format("%.02f",unitCost*totalHour);
        System.out.println("SALARY = U$ " +formattString);
    }

}
