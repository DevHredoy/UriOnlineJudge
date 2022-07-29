package AllProblemsOfUri;

import java.util.Scanner;

public class UriOnline_1018 {


    //100, 50, 20, 10, 5, 2  1

    public static void main(String[] args) {


/*123/100=1
        1 note of 100
                123 mode 100=23

            if (23 /20)>1
        {
            23mod20=
        }*/


        /*int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
// Outputs "Thursday" (day 4)
*/

       /* switch(expression) {
            case x:
                // code block
                break;
            case y:
                // code block
                break;
            default:
                // code block
        }*/


        int notes_of_100 = 0;
        int notes_of_50 = 0;
        int notes_of_20 = 0;
        int notes_of_10 = 0;
        int notes_of_5 = 0;
        int notes_of_2 = 0;
        int notes_of_1 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("please give a money amount : ");
        int floatingnumber_in_integer= scanner.nextInt();


        boolean flag = true;


int n=0;

        while (flag ==true) {
            flag=false;
            if (n / 100 >= 1) {
                notes_of_100 = n / 100;
                n = n % 100;
                System.out.println("number of 100 taka note is :" + notes_of_100);
                flag=true;
                System.out.println("now remaining amount of money is : is ="+n);

            } else if (n / 50 >= 1) {
                notes_of_50 = n / 50;
                n = n % 50;
                System.out.println("number of 50 taka note is : "+notes_of_50);
                flag=true;
                System.out.println("now remaining amount of money is : is ="+n);

            } else if (n / 20 >=1) {
                notes_of_20 = n / 20;
                n = n % 20;
                System.out.println("number of 20 taka note : "+notes_of_20);
                flag=true;
                System.out.println("now remaining amount of money is : is ="+n);

            } else if (n / 10 >= 1) {
                notes_of_10 = n / 10;
                n = n % 10;
                System.out.println("number of 10  taka note : "+notes_of_10);
                flag=true;
                System.out.println("now remaining amount of money is : is ="+n);

            } else if (n / 5 >= 1) {
                notes_of_5 = n / 5;
                System.out.println("notes of 5 taka:" + notes_of_5);
                n = n % 5;
                flag=true;
                System.out.println("now remaining amount of money is : is ="+n);


            } else if (n / 2 >=1) {
                notes_of_2 = n / 2;
                System.out.println("notes of 2 taka is :" + notes_of_2);
                n = n % 2;
                flag=true;
                System.out.println("now remaining amount of money is : is ="+n);


            } else {
                notes_of_1 = n / 1;
                System.out.println("notes of 1 taka:");

            }


        }

    }
}
