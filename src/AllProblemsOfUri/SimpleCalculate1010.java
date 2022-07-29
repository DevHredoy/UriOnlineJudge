package AllProblemsOfUri;

import java.util.Scanner;

public class SimpleCalculate1010 {

    public static void main(String[] args) {
        System.out.print("Enter two floating point values : ");

        Scanner my_scan = new Scanner(System.in);
        float totalprice=0;
       for(int j=0;j<2;j++)
       {
           System.out.println("please enter product code(int) , total unit,unit cost");


           int product_code= my_scan.nextInt();
           int total_units=my_scan.nextInt();
           float unit_price=my_scan.nextFloat();
           totalprice=totalprice+total_units*unit_price;
       }



        System.out.println("VALOR A PAGAR: R$ "+totalprice);


    }
}
