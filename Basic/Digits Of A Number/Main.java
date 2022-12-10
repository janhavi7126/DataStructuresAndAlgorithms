import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {

      Scanner scn = new Scanner(System.in);
	  int n=scn.nextInt();
	  int copyn= n;
      int noOfDigits = 0;
	  int remainder; 


	  while (copyn != 0) {
		  copyn = copyn/10;

		  noOfDigits++;
	  }

	  int divisor = (int)Math.pow(10, noOfDigits - 1);

	  while(divisor != 0){

		int quotient = n/divisor;
		System.out.println(quotient);
		remainder = n%divisor;
		n = remainder;
		divisor = divisor/10;

	  }

      // write your code here  
     }
    }
