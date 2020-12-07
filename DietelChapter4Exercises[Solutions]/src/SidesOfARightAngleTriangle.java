import java.util.Scanner;
import static java.lang.StrictMath.sqrt;

public class SidesOfARightAngleTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side a");
        int a = input.nextInt();
        System.out.println("Enter the side b");
        int b = input.nextInt();
        System.out.println("Enter the side c");
      int c = input.nextInt();
        if ( c==sqrt((a*a)+(b*b)) && b==sqrt((c*c)-(a*a)) && a==sqrt((c*c)-(b*b))){
            System.out.println("This is a right angle triangle" );
        }
        else{
            System.out.println("This is not a right angle triangle");}
        }
    }


