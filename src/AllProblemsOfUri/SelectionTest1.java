package AllProblemsOfUri;

import java.util.Scanner;

public class SelectionTest1 {

    //conditions:
    //total A,B,C,D
    //b is greater than c     b12 c10  d14 a6
    //d is greater than A
    //(a+b)<(c+d)
    //c,d positive
    //A is even




    public static void main(String[] args) {

        System.out.println("give four any unbroken number :");

        Scanner scanner=new Scanner(System.in);

        int A=0,B=0,C=0,D=0;
        A=scanner.nextInt();
        B=scanner.nextInt();
        C=scanner.nextInt();
        D=scanner.nextInt();
        System.out.println("A : " +A+
                "B :" +B+
                "C :" +C+
                "D " +D);

        if(B>C)
        {
            System.out.println("the condition of B>C has been satisfied ");
            if(D>A)
            {
                System.out.println("the condition of D>A has been satisfied ");
               if ((A+B)<(C+D))
                   System.out.println("A+B=" +(A+B)+"<"+
                           "(C+D) =" +(C+D)
                   );
               {
                        if(C>=0 ||D>=0)
                              {
                                  System.out.println("C>=0 ||D>=0"+
                                          "C"+C+
                                          "D"+D);
                                  if(A%2==0)
                                  {
                                      System.out.println("A is a even number :"+A);
                                      System.out.println("accepted");

                                  }
                              }

               }


            }

        }
        else
        {
            System.out.println("not matched ");
        }



        }


    }





