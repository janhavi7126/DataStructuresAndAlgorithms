import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here 

      Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = n1; 
        int n4 = n2;
        int n;
        int GCD = 1;
        
        if (n1>n2){
             n= n1;
        }else{
            n =n2; 
        }
       
        
        for (int i=2;i<=n;i++){ //2 to greater number
            
            if (n1%i==0 && n2%i==0){   // if both are divisble     2 | 8    32
                                                               //  2 | 4    16
               GCD = GCD * i;         // 1* the number             2 | 2     8
               n1 = n1/i;             // divide by that number     2 | 1     4
               n2 = n2/i;             // divide                    2 * 2 * 2 * 2=16 = GCD common 
               i--;                   // to see if i++ i-- same number is divisible 
              
            }
        }
        System.out.println(GCD);
        int LCM = GCD * n3/GCD * n4/GCD;        // lcm*gcd = n1*n2
        System.out.println(LCM);
        




     }
    }
