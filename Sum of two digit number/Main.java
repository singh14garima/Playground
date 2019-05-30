import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	Scanner in = new Scanner ( System.in);
      int n = in.nextInt();
     
      // Type your code here
      int firstdigit= n/10;
      int seconddigit= n%10;
      int sum= firstdigit+ seconddigit;
      System.out.println( sum );
        
	}
}