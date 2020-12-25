import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom secureRandom= new SecureRandom();
        int number=(1+secureRandom.nextInt(1000));
        System.out.println("Enter Your guess:");
        int guess= input.nextInt();
        if(guess==number){
            System.out.println("Congratulations. You guessed the number!");
            System.out.println("Enter 0 to play again and -1 to stop");
            guess= input.nextInt();
            number=(1+secureRandom.nextInt(1000));
        }
        if(guess>number){
            System.out.println("Too High. Try again");
        }
        if(guess<number && guess!=-1 && guess!=0){
            System.out.println("Too Low. Try again");
        }

        while(guess!=number && guess!=-1){
            System.out.println("Enter Your guess:");
            guess= input.nextInt();
            if(guess==number){
                System.out.println("Congrats");
                System.out.println("Enter 0 to play again and -1 to stop");
                guess= input.nextInt();
                number=(1+secureRandom.nextInt(1000));
            }
            if(guess>number){
                System.out.println("High");
            }
            if(guess<number && guess!=-1 && guess!=0){
                System.out.println("Low");
            }

        }

    }
}
