import java.util.Scanner;

public class SidesOfATriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side a");
        int a= input.nextInt();
        System.out.println("Enter side b");
        int b= input.nextInt();
        System.out.println("Enter side c");
        int c = input.nextInt();
        if (a + b > c && b + c > a && c + a > b){
            System.out.println("This is a triangle");
        }else{
            System.out.println("This is not a triangle");
        }
    }
}
