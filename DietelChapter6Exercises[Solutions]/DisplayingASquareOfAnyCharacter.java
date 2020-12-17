import java.util.Scanner;

public class DisplayingASquareOfAnyCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character you would like to print");
        char character=input.next().charAt(0);
        System.out.println("Enter the number of times you want to print");
        int number= input.nextInt();
        int count=number;
        while(count>0){
            for(int counter=0;counter<number;counter++)
            {
                System.out.printf("%c",character);
            }
            System.out.println();
            count--;
        }

    }
}
