import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        long total=1;
        Scanner input = new Scanner(System.in);
        int counter=1;
        int number=20;
        System.out.printf("%s%20s%n","numbers","factorials");
        for(;counter<number+1;counter++){
            total=total*counter;
            System.out.printf("%d%20d%n",counter,total);
        }
        System.out.printf("%s%10d","Total:",total);
    }
}
