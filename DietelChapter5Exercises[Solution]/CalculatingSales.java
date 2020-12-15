import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {
        int counter=1;
        double total=0;
        Scanner input=new Scanner(System.in);
        while(counter>=1){
            System.out.println("Enter the product Number:");
            counter= input.nextInt();
            switch(counter){
                case 1 :total+=2.98;
                    break;
                case 2:total+=4.50;
                break;
                case 3:total+=9.98;
                break;
                case 4:total+=4.49;
                break;
                case 5:total+=6.87;
                break;
                default:
            }
        }
        System.out.printf("The total amount of all products sold is $%.2f",total);

    }
}
