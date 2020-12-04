import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the side of the square");
        int counter=input.nextInt();
        for(int asterisks=0;asterisks<counter;asterisks++){
            System.out.printf("*");
        }
        System.out.println();
        for(int asterisks=0;asterisks<counter;asterisks++){
            System.out.printf("*");
        }
    }
}
