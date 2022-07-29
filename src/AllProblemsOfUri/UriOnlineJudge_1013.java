package AllProblemsOfUri;

import java.util.Scanner;

public class UriOnlineJudge_1013 {

    public static void main(String[] args) {
        System.out.println("please give three integers: ");
        Scanner scanner= new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        /*at first between a and b we shall compare which one is bigger
                 using the given formula*/


         int result=a+b;
        System.out.println("a+b :"+result);
         int n=Math.abs(a-b);

        System.out.println("Math.abs(a-b)"+n);

         result=result+n;

        System.out.println("result+n:"+result);
         result=result/2;

        System.out.println("result/2 : "+ result);

         int larger=result;

        System.out.println("result : "+larger);

        //segement

         larger=larger+c;   //greater+c

        System.out.println("larger + c"+larger);
         n=Math.abs(result-c);//  abs(greater-c)
        System.out.println("Math.abs(larger-c)"+n);

         larger=larger+n;

        System.out.println("larger+n : "+larger);
         larger=larger/2;

        System.out.println("larger/2 : " + larger);
        System.out.println(larger);






    }

}

