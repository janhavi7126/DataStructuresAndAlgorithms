import java.util.*;

public class Main{

public static void main(String[] args) {

  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  int remainder;
  int sum = 0;
  int noOfDigits = 0;
  while ( n!=0 ) {

    remainder = n%10;
    n = n/10;

    int pos = (int)Math.pow(10,remainder - 1);

    noOfDigits++; 
    sum = sum + pos * noOfDigits;  
  }
  System.out.println(sum);

  
  

  // write your code here  
 }
}
