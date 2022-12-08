import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int t = scn.nextInt();

      for(int a = 1; a<=t ; a++){
        int n = scn.nextInt();
        int factors = 0;

        for(int i = 1; i*i<= n; i++){

          if(n%i==0){
            factors++;
          }
        }
        if(factors == 1){
          System.out.println("prime");
        }
        else{
          System.out.println("not prime");
        }

      }
  
   }
  }
