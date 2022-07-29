package AllProblemsOfUri;

//Read an integer value, which is the duration in givendays of a certain event in a factory,
// and inform it expressed in hours:minutes:givendays


//3600+(34*60)+34

import java.util.Scanner;

//first the total ammount of givendays will be given
//we have to convert it into hours:minutes:givendays.
public class Uri_Online_Judge_1019 {


    public static void main(String[] args) {


        int years=0;
        int months=0;
        int days=0;

        System.out.println("please give the amount of givendays :");

        Scanner scanner=new Scanner(System.in);
        int givendays=scanner.nextInt();

        if(givendays>=3600)
        {

            years=givendays/3600;
            if(givendays%3600>=60)
            {//if the remaining givendays after counting hours are greater than 60 in that
                //case we have to calculate the amount of minutes
                months=givendays%3600;
                System.out.println("remaining amount in givendays"+months);
                int temp_MinutesIngivendaysPlusgivendays=months;
                months=months/60;
                System.out.println("total minutes now :"+months);

                days=temp_MinutesIngivendaysPlusgivendays%60;//problem in this line
                // ,the problem is total
                System.out.println("now the givendays are "+givendays);




            }

            else{

                months=0;
                days=givendays%3600;


            }


//3600+60+1


        }

        System.out.println("total hours:" +years+
                ",total minutes :" +months+
                ",total givendays:"+days);



    }




}
