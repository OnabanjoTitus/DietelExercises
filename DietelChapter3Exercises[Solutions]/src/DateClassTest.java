import java.util.Scanner;

public class DateClassTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DateClass day1= new DateClass(12,23,2020);
        day1.displayDate();
        System.out.println();
        System.out.println("Enter the new month:");
        day1.setMonth(input.nextInt());
        System.out.println("Enter the new day:");
        day1.setDay(input.nextInt());
        System.out.println("Enter the new year:");
        day1.setYear(input.nextInt());
        day1.displayDate();


    }
}
