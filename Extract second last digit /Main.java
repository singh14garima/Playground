import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	Scanner in = new Scanner ( System.in);
      int n = in.nextInt();
     int second_last_digit= ( n%100)/10;
      // Type your code here
    
      System.out.println( second_last_digit);
        
	}
}