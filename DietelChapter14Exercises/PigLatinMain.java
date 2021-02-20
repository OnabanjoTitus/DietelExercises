import java.util.Scanner;

public class PigLatinMain {
    public static void main(String[] args) {
        PigLatin pigLatin= new PigLatin();
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the word");
        pigLatin.enterSentence(scanner.nextLine());
        pigLatin.printLatinWord();
    }
}
