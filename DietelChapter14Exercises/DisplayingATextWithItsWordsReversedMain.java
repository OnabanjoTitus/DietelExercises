
import java.util.Scanner;

public class DisplayingATextWithItsWordsReversedMain {
    public static void main(String[] args) {
        DisplayingATextWithItsWordsReversed displayingATextWithItsWordsReversed= new DisplayingATextWithItsWordsReversed();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text you want to reverse");
        displayingATextWithItsWordsReversed.enterSentence(scanner.nextLine());
        displayingATextWithItsWordsReversed.splitWords();
        displayingATextWithItsWordsReversed.reverseWords();
        for(String string: displayingATextWithItsWordsReversed.getWord()){
            System.out.printf("%s ",string);
        }

    }
}
