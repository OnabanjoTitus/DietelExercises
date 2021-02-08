import java.util.InputMismatchException;
import java.util.Scanner;

public class TimeWithTickMain {
    public static void main(String[] args) {
        TimeWithTick timeWithTick= new TimeWithTick();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the hour");
        try {
            timeWithTick.setHour(scanner.nextInt());
        }catch (InputMismatchException inputMismatchException){
            System.err.println("Invalid input enter a number");
        }
        System.out.println("Enter the minute");
        try {
            timeWithTick.setMinutes(scanner.nextInt());
        }catch (InputMismatchException inputMismatchException){
            System.err.println("Invalid input enter a number");
        }
        System.out.println("Enter the seconds");
        try {
            timeWithTick.setSeconds(scanner.nextInt());
        }catch (InputMismatchException inputMismatchException){
            System.err.println("Invalid input enter a number");
        }
        System.out.printf("%s",timeWithTick.toString());
    }
}
