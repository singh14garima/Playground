import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
	     // Type your code here
      int n = in.nextInt();
           
      for (  int i =1; i <= 2*n; i++)
      { if(n%2==1)
        System.out.println(i); 
       i =  i+1;
       
      }
     
        
	}
}