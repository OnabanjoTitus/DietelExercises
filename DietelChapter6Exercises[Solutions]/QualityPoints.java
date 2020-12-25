import java.util.Scanner;

public class QualityPoints {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the student grade");
        points(scanner.nextInt());

    }

    public static void points(int score) {
        switch (score / 10) {
            case 10,9 -> System.out.println("4");
            case 8 -> System.out.println("3");
            case 7 -> System.out.println("2");
            case 6 -> System.out.println("1");
            default -> System.out.println("0");

        }

    }
}
