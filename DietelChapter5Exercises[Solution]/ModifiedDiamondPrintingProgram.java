import java.util.Scanner;

public class ModifiedDiamondPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first_count;
        int second_count;
        System.out.println("Enter the number in the range 1-19");
        int counter= input.nextInt();
        if((counter%2==0)||(counter>19) || (counter<1)){
            System.out.println("Enter an odd number in the range 1-19");
        }
        if(counter%2>0) {
            for (int diamond = 0; diamond < counter; diamond++) {
                System.out.printf("*");
                if(diamond%2>0){
                    System.out.println();
                }
            }

        }
        }

}
