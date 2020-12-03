import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
     Scanner input= new Scanner(System.in);
int counter=0;
        while(counter<3){

            System.out.println("Enter the name of the employee:");
            String employee = input.next();

            System.out.println("Enter the hourly rate of the employee:");
            double rate= input.nextDouble();

            System.out.println("Enter the number of hours worked:");
            int hours= input.nextInt();

            if(hours<=40){
                double grossPay=rate*hours;
                System.out.printf("The gross pay of %s is %.2f %n",employee,grossPay);
            }
            if(hours>40){
                int difference= hours-40;
                double overtime=difference*(rate/2);
                double mainPay=rate*40;
                double grossPay=mainPay+overtime;
                System.out.printf("The gross pay of %s is %.2f%n",employee,grossPay);

            }
            counter++;
            System.out.println();
        }


    }
}
