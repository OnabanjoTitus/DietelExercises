import java.util.Scanner;

public class EmployeeClassTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EmployeeClass employee1= new EmployeeClass("titus","damilola",1000 );
        EmployeeClass employee2= new EmployeeClass("titus","damiii",900 );
        System.out.printf("The name of the employee is %s%7s and the employee yearly salary is %f ", employee1.getFirstName(),employee1.getLastName(),employee1.getSalary());
        System.out.println();
        System.out.printf("The name of the employee is %s%7s and the employee yearly salary is %f ", employee2.getFirstName(),employee2.getLastName(),employee2.getSalary());
        System.out.println();
        System.out.println("Enter raise in percentage for employee 1");
        double raise= input.nextDouble();
        employee1.setSalary(raise);
        System.out.println("Enter raise in percentage for employee2");
        raise= input.nextDouble();
        employee2.setSalary(raise);
        System.out.println();
        System.out.printf("The name of the employee is %s%7s and the employee yearly salary is %f ", employee1.getFirstName(),employee1.getLastName(),employee1.getSalary());
        System.out.println();
        System.out.printf("The name of the employee is %s%7s and the employee yearly salary is %f ", employee2.getFirstName(),employee2.getLastName(),employee2.getSalary());



    }
}
