import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     long n = scn.nextInt();
     long k = scn.nextInt();// 3 times
     long number = n;// 23456
     long number2 = n;//23456
     int noOfDigits = 0;
     int sum =0;


    while ( n != 0 ) { 
        n = n/10;     
        noOfDigits++; 
    }
    int digits = (int)Math.pow(10,noOfDigits -1);// 10 ^4 = 10000

          k = k  % noOfDigits  ;// 3% 5 = 3
           if(k<0)
           {                                       
            k = noOfDigits + k  ;
           }
      

    for (int i = 0; i<k ; i++) {
  
    long r = number2%10;         // 6
    number2 = number2/10;       // 2345
    number2 = number2 + r * digits ; //2345 + 60000 = 62345 rotatated 1 time 

    }  

    System.out.println(number2);

  
     
    }
   }
