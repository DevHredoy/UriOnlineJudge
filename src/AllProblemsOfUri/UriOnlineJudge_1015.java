package AllProblemsOfUri;

import java.util.Scanner;

public class UriOnlineJudge_1015 {


    public static void main(String[] args) {

            Scanner scanner=new Scanner(System.in);

        System.out.println("please give x1 and y1 : ");

      double x1=scanner.nextDouble();
      double y1=scanner.nextDouble();
        System.out.println(Math.sqrt(25.00));
        System.out.println("please give x2 and y2 :");
      double x2=scanner.nextDouble();
      double y2=scanner.nextDouble();


      double firstdot=x2-x1;
      firstdot=firstdot*firstdot;

      double seconddot=y2-y1;
      seconddot=seconddot*seconddot;

      double finalresult=firstdot+seconddot;

      finalresult=Math.sqrt(finalresult);
        System.out.println(finalresult);
    }
}
