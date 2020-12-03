import java.util.Arrays;

public class TrianglePrintingProgram {
    public static void main(String[] args) {
        System.out.println("(a)");
        for (int asterisksCounter = 10; asterisksCounter >= 1; asterisksCounter--) {

            for (int asterisks = 1; asterisks <= asterisksCounter; asterisks++) {
                System.out.print("*");
            }


            System.out.println();
        }
        System.out.println("(b)");
        for (int asterisksCounter = 1; asterisksCounter <= 10; asterisksCounter++) {
            for (int asterisks = 1; asterisks <= asterisksCounter; asterisks++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("(c)");
        for (int asterisksCounter = 10; asterisksCounter >= 1; asterisksCounter--) {
        for (int asterisksSpacer = 9; asterisksSpacer >= asterisksCounter; asterisksSpacer--) {
            System.out.print(" ");
        }
        for (int asterisks = 1; asterisks <= asterisksCounter; asterisks++) {
            System.out.print("*");
        }

        System.out.println();
    }
        System.out.println("(d)");
    for (int asterisksCounter = 1; asterisksCounter <= 10; asterisksCounter++) {
        for (int asterisksSpacer = 9; asterisksSpacer >= asterisksCounter; asterisksSpacer--) {
            System.out.print(" ");
        }
        for (int asterisks = 1; asterisks <= asterisksCounter; asterisks++) {
            System.out.print("*");
        }

        System.out.println();
    }

    }

}
