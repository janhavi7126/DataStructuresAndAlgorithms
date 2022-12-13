import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int number = scn.nextInt();
     // int ans = 0;
//////////////////////////////////////////////     
    //  int noOfDigits = 0;
    //  int number1 = number;

    //  while (number !=0 ){
    //    number = number/10;
    //    noOfDigits++;
    //  }

    //  int a = (int)Math.pow(10,noOfDigits - 1); 

    //  while (number1 !=0 ) {

    //   int remainder = number1%10;
    //    number1 = number1/10;
    //    ans = ans + remainder * a;
    //    a = a/10;
       
    //  }
///////////////////////////////////////////////////////
    //  while (number !=0 ){

    //    int remainder = number%10;
    //     number = number/10;
    //     ans = ans*10 + remainder;
    //   }

    //  System.out.println(ans);
    while (number !=0 ){

        int remainder = number%10;
         number = number/10;
         System.out.println(remainder);

    }
    }
   }
