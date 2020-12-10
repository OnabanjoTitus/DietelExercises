import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
      int total=1;
      int totalExponential=1;
      int totalExponentialE=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The number");
        int counter=input.nextInt();
        int number=counter;
        for(;counter>0;counter--){
            total=total*counter;
        }
        System.out.printf("The factorial of %d is %d%n",number,total);
        System.out.println("Enter the mathematical constant e");
        int e= input.nextInt();
        for(;e>0;e--){if(e>1){
           while(e>1){
               totalExponential+=1/e*(e-1);
               e--;
           }
       }
           totalExponential+=1+(1/e);
       }
        System.out.printf("The exponential is %d%n",totalExponential);

        System.out.println("Enter the mathematical constant e");
        int ex= input.nextInt();
        for(;ex>0;ex--){if(ex>1){
            while(ex>1){
                totalExponentialE+=1/ex*(ex-1);
                ex--;
            }
        }
            totalExponentialE+=1+(1/ex);
        }
        System.out.printf("The exponential is %d%n", totalExponentialE);
    }


}
