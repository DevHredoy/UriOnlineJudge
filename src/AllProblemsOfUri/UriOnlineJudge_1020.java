package AllProblemsOfUri;

import java.util.Scanner;

public class UriOnlineJudge_1020 {
    public static void main(String[] args) {


        int years=0;
        int months=0;
        int days=0;

        System.out.println("please give the amount of givendays :");

        Scanner scanner=new Scanner(System.in);
        int givendays=scanner.nextInt();

        if(givendays>=365)
        {

            years=givendays/365;
            if(givendays%365>=30)
            {//if the remaining givendays after counting hours are greater than 60 in that
                //case we have to calculate the amount of minutes
                months=givendays%365;
                System.out.println("remaining amount in givendays"+months);
                int temp_totaldaysleftaftercalculatingYear=months;
                months=months/30;
                System.out.println("total minutes now :"+months);

                days=temp_totaldaysleftaftercalculatingYear%30;//problem in this line
                // ,the problem is total
                System.out.println("now the givendays are "+givendays);




            }

            else{

                months=0;
                days=givendays%365;


            }


//3600+60+1


        }

        System.out.println("total years :" +years+
                ",total month :" +months+
                ",total days :"+days);



    }




}

                






