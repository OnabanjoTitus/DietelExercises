import java.util.Scanner;

public class ValidatingUserInput {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the user input");
        int userInput=input.nextInt();
        while(userInput!=1 && userInput!=2){
            System.out.println("Enter the user input");
            userInput=input.nextInt();
        }
    }
}
