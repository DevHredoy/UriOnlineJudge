package AllProblemsOfUri;

import java.text.DecimalFormat;
import java.util.Scanner;

// program to show what could be the changes from a given money amount

public class UriOnlineJudge_1021 {


    private static final DecimalFormat df=new DecimalFormat("0.00");

    public static void main(String[] args) {
         /* this  code below actually seperates the values after decimal from the number:

           float number=0;
        System.out.println("please give a floating number: ");
        Scanner scan=new Scanner(System.in);
        number=scan.nextFloat();
        System.out.println("full float number : " +number);
       float floatingnumber= number%(int)number;

        System.out.println(String.format("%.2f",floatingnumber));
*/

        System.out.println("give a floating full number :");
        Scanner scanner = new Scanner(System.in);

        float number=scanner.nextFloat();

        System.out.println("full float number : " +number);
        int integerpart=(int) number;
        System.out.println(integerpart);
        float floatingnumber= number%(int)number;
        System.out.println(floatingnumber);
        floatingnumber= Float.parseFloat(df.format(floatingnumber));
        System.out.println(floatingnumber);

        //integerpart and floatingnumber are the two parts

        int notes_of_100 = 0;
        int notes_of_50 = 0;
        int notes_of_20 = 0;
        int notes_of_10 = 0;
        int notes_of_5 = 0;
        int notes_of_2 = 0;
        int notes_of_1 = 0;

        boolean flag = true;

        while (flag ==true) {
            flag=false;
            if (integerpart / 100 >= 1) {
                notes_of_100 =integerpart/ 100;
                integerpart = integerpart % 100;
                System.out.println("number of 100 taka note is :" + notes_of_100);
                flag=true;
                System.out.println("now remaining amount of money is : is ="+integerpart);

            } else if (integerpart / 50 >= 1) {
                notes_of_50 = integerpart / 50;
                integerpart = integerpart % 50;
                System.out.println("number of 50 taka note is : "+notes_of_50);
                flag=true;
                System.out.println("now remaining amount of money is : is ="+integerpart);

            } else if (integerpart / 20 >=1) {
                notes_of_20 = integerpart / 20;
                integerpart = integerpart % 20;
                System.out.println("number of 20 taka note : "+notes_of_20);
                flag=true;
                System.out.println("now remaining amount of money is : is ="+integerpart);

            } else if (integerpart / 10 >= 1) {
                notes_of_10 = integerpart / 10;
                integerpart = integerpart % 10;
                System.out.println("number of 10  taka note : "+notes_of_10);
                flag=true;
                System.out.println("now remaining amount of money is : is ="+integerpart);

            } else if (integerpart / 5 >= 1) {
                notes_of_5 = integerpart / 5;
                System.out.println("notes of 5 taka:" + notes_of_5);
                integerpart = integerpart % 5;
                flag=true;
                System.out.println("now remaining amount of money is : is ="+integerpart);


            } else if (integerpart / 2 >=1) {
                notes_of_2 = integerpart / 2;
                System.out.println("notes of 2 taka is :" + notes_of_2);
                integerpart = integerpart % 2;
                flag=true;
                System.out.println("now remaining amount of money is : is ="+integerpart);


            } else {
                notes_of_1 = integerpart/ 1;
                System.out.println("notes of 1 taka:");

            }
}


        // calculation of floating points
        //0.50,0.25,0.10,0.05,0.01

        //at first we have to turn



        floatingnumber=floatingnumber*100;
        int floatingnumber_in_integer=(int)floatingnumber;

        System.out.println("now floatingnumber value is : "+floatingnumber_in_integer);


        int notes_of_0_50 = 0;
        int notes_of_0_25 = 0;
        int notes_of_0_10 = 0;

        int notes_of_0_5 = 0;

        int notes_of_0_1 = 0;

         flag = true;
 while (flag ==true) {
            flag=false;
            if (floatingnumber_in_integer / 50 >= 1) {
                notes_of_0_50 =floatingnumber_in_integer/ 50;
                floatingnumber_in_integer = floatingnumber_in_integer % 50;
                System.out.println("number of 0.50 taka note is :" + notes_of_0_50);
                flag=true;
                System.out.println("now remaining amount of money is : is ="+floatingnumber_in_integer);

            } else if (floatingnumber_in_integer / 25 >= 1) {
                notes_of_0_25 = floatingnumber_in_integer / 25;
                floatingnumber_in_integer = floatingnumber_in_integer % 25;
                System.out.println("number of 0.25 taka note is : "+notes_of_0_25);
                flag=true;
                System.out.println("now remaining amount of money is : is ="+floatingnumber_in_integer);


            } else if (floatingnumber_in_integer / 10 >= 1) {
                notes_of_0_10 = floatingnumber_in_integer / 10;
                floatingnumber_in_integer = floatingnumber_in_integer % 10;
                System.out.println("number of 0.10  taka note : "+notes_of_0_10);
                flag=true;
                System.out.println("now remaining amount of money is : is ="+floatingnumber_in_integer);

            } else if (floatingnumber_in_integer / 5 >= 1) {
                notes_of_0_5 = floatingnumber_in_integer / 5;
                System.out.println("notes of 0.05 taka:" + notes_of_0_5);
                floatingnumber_in_integer = floatingnumber_in_integer % 5;
                flag=true;
                System.out.println("now remaining amount of money is : is ="+floatingnumber_in_integer);


            }  else {
                notes_of_0_1 = floatingnumber_in_integer/ 1;
                System.out.println("notes of 1 taka:"+notes_of_0_1);

            }
 }
 }
}

