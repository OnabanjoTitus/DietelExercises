import java.util.Scanner;

public class FindTheSmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number which also serves as the counter");
        int first= input.nextInt();
        int counter=1;
        int max=first;
        for(;counter<first;counter++){
            System.out.printf("Enter the number%d:%n",counter+1);
            int k= input.nextInt();
            max=Math.max(max,k);
        }
        System.out.printf("The maximum of the numbers is %d:%n",max);
    }
}
