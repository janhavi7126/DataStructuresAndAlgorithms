import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here 

      Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = n1;
        int n4 = n2;
       
        while (n1%n2 != 0 ) {    // untill two number when divsible gives 0
            int rem =n1%n2;      // rem = non zero   or  rem = 0 (if zero loop will not execute i.e gcd will be one of that number [smaller])8%32 ->rem 8 non zero
                                  // n1 =32 and n2 rem i.e 8 now rem = 0 
                                  // for 
            n1=n2;               //
            n2=rem;          
        }

        System.out.println(n2);
        int LCM = n3 * n4/n2;
        System.out.println(LCM);
        




     }
    }
