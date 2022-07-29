package AllProblemsOfUri;

import java.util.Scanner;

//we have to take three floating number from the user
//
public class UriOnlineJudge_1036 {

    public static void main(String[] args) {


        System.out.println("please give the numbers a b c (floating numbers) : ");
        Scanner scanner = new Scanner(System.in);
        float a,b,c;
        a=scanner.nextFloat();
        b=scanner.nextFloat();
        c=scanner.nextFloat();

        float x1,x2;
        //calculating x1 first:
        x1=b*b;
        x1=x1-4*a*c;
        x1=(float) Math.sqrt(x1);
        x1=x1-b;
        x1=x1/(2*a);


        //calculating x2:
        x2=b*b;
        x2=x2-4*a*c;
        x2=(float) Math.sqrt(x2);
        x2=-x2-b;
        x2=x2/(2*a);

        if(Float.isNaN(x1)|| Float.isNaN(x2) ||x1==Float.NEGATIVE_INFINITY||x1==Float.POSITIVE_INFINITY||x2==Float.NEGATIVE_INFINITY||x2==Float.POSITIVE_INFINITY)
        {
            System.out.println("Impossivel calcular");


        }
        else
        {
            System.out.println("x1 :"+x1+" x2 :"+x2);
        }


    }


}
