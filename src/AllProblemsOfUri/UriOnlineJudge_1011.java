package AllProblemsOfUri;

import java.util.Scanner;

public class UriOnlineJudge_1011 {


    public static void main(String[] args) {
        System.out.println("please enter the radius of your circle: ");
        Scanner scanner =new Scanner(System.in);
        float radius =scanner.nextFloat();

      double result =radius*radius*radius*3.1416*4;

        System.out.println(String.format("%.3f",result/3));
    }
}
