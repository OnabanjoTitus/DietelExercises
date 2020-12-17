import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
        System.out.println("Enter the number");
        int numberEntered= input.nextInt();
        isEven(numberEntered);
    }
    public static void isEven(int number) {
        if(number%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is Odd");
        }

    }
}
