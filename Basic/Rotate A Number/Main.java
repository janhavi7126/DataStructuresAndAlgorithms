import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     long n = scn.nextInt();
     long k = scn.nextInt();
     long number = n;
     long number2 = n;
     int noOfDigits = 0;
     int sum =0;


    while ( n != 0 ) { 
        n = n/10;     
        noOfDigits++; 
    }
    int digits = (int)Math.pow(10,noOfDigits -1);

          k = k  % noOfDigits  ;
           if(k<0)
           {                                       
            k = noOfDigits + k  ;
           }
      

    for (int i = 0; i<k ; i++) {
  
    long r = number2%10;
    number2 = number2/10;
    number2 = number2 + r * digits ;

    }  

    System.out.println(number2);

  
     
    }
   }
