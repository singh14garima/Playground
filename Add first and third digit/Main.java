import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	Scanner in = new Scanner ( System.in);
      int n = in.nextInt();
     int firstdigit = n/100;
      int thirddigit= n%10;
      int sum = firstdigit+ thirddigit;
      // Type your code here
      
      System.out.println( sum);
        
	}
}