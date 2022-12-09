import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1= scn.nextInt();
        int n2= scn.nextInt();

        while(n1<= n2){

            int factors = 0;
        

            for(int i = 2 ; i * i<= n1;i++ ){
                if(n1 % i == 0){
                    factors++;
                    break; 
                }    
            }

            if(factors == 0){
                System.out.println(n1);         
            }

            n1++;
        }
        
        

    }
}
