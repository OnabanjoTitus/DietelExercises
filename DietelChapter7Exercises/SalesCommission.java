import java.util.Scanner;
    public class SalesCommission {
        public static void main(String...args) {
            Scanner input = new Scanner(System.in);
            int grossSales;
            int grossSalary = 0;
            int[] counters = new int[9];
            System.out.println("Enter the gross sales");
            grossSales = input.nextInt();
            while (grossSales >= 0) {
                grossSalary = 200 + ((9 * grossSales) / 100);
                switch (grossSalary/100) {
                    case 2 -> {
                        ++counters[0];
                    }
                    case 3 -> {
                        ++counters[1];
                    }
                    case 4 -> {
                        ++counters[2];
                    }
                    case 5 -> {
                        ++counters[3];
                    }
                    case 6 -> {
                        ++counters[4];
                    }
                    case 7 -> {
                        ++counters[5];
                    }
                    case 8 -> {
                        ++counters[6];
                    }
                    case 9 -> {
                        ++counters[7];
                    }
                    default -> {
                        ++counters[8];
                    }
                }
                System.out.println("Enter the gross sales");
                grossSales = input.nextInt();
            }
            System.out.printf("%10s%10s%n","Salaries","Number of people");
            System.out.printf("%10s%10d%n","$200-299", counters[0]);
            System.out.printf("%10s%10d%n","$300-399", counters[1]);
            System.out.printf("%10s%10d%n","$400-499",counters[2]);
            System.out.printf("%10s%10d%n","$500-599",counters[3]);
            System.out.printf("%10s%10d%n","$600-699",counters[4]);
            System.out.printf("%10s%10d%n","$700-799",counters[5]);
            System.out.printf("%10s%10d%n","$800-899",counters[6]);
            System.out.printf("%10s%10d%n","$900-999",counters[7]);
            System.out.printf("%10s%6d%n","$1000 and over",counters[8]);
        }
    }


