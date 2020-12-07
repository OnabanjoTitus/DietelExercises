import java.util.Scanner;

public class GuessTheNumberMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessTheNumber values = new GuessTheNumber();

        System.out.println("Enter a guess between 1 and 20 number and -1 to end the game:");
        int number= input.nextInt();
        while(number!=-1){
            values.setNumber(number);
            values.setRandomNumberGreater(number);
            values.setRandomNumberSmaller(number);
            values.getRandomNumber();
            values.getRandomNumberGreater();
            values.getRandomNumberSmaller();
            System.out.println("Enter a guess between 1 and 20 number and -1 to end the game:");
            number= input.nextInt();
            if(number==values.getRandomNumber())
            {values.generator();}

        }

    }
}
