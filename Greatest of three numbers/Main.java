import java.util.Scanner;
class Main
{ public static void main (String args[])
   { Scanner in = new Scanner ( System.in);
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int num3 = in.nextInt();
    if ( num1 <num2 && num1 <num3)
       { if  ( num2<num3 && num2< num1)
         System.out.println( num2);
        else 
          System.out.println( num3);
       }
    else 
      System.out.println( num1);
   }
}
