import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number");
        int number= input.nextInt();
        int numb=number;
        while(numb>0) {
            for (int counter = 0; counter < number; counter++) {
                System.out.print("*");
            }
            System.out.println();
            numb--;
        }
    }

}
