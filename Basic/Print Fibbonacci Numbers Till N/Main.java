import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n =scn.nextInt();

      int fib1 = 0;
      int fib2 = 1;
      int sum ;
      for(int i=1 ;i<=n; i++){        
        sum = fib1 + fib2;      
        System.out.println(fib1);
        fib1 = fib2;
        fib2 = sum;
        
      }



   }
  }
