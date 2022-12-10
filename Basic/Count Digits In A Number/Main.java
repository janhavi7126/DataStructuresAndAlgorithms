import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int r1 =0;
    int r =0;
    
    for(int i= n ;i>=0;i--) {

       i = i/10;

      r1= n % 10; 
      r++;
      
       
    }
      System.out.println(r); 
       

    
    // write your code here  
   }
  }
