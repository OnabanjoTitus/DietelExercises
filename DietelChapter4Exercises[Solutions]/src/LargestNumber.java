import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int counter=1;
        int largestNumber=0;
        Scanner input = new Scanner(System.in);
        while(counter<=10){
            System.out.printf("Enter the number%d:%n",counter);
            int number=input.nextInt();
            if(number>largestNumber){
                largestNumber=number;
            }
            System.out.printf("The new largest numbers is %d%n",largestNumber);
            counter++;
        }
        System.out.printf("The largest of the 10 numbers is %d",largestNumber);
    }
}
