import java.util.Scanner;

public class CalculatingTheProductsOfOddIntegers {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the integer:");
        int odd=input.nextInt();
        int g=odd;
        int oddProduct=1;
        int counter=1;
        while(counter<odd) {
            if (odd % 2 != 0) {
                oddProduct = oddProduct * odd;
            }
            odd--;
        }
            System.out.printf("The products of odd numbers from %d to 1 is %d",g,oddProduct );
        }
}
