import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalMiles = 0;
        double totalGallon = 0;
        int miles = 0;
        int gallon = 0;
        double totalMilesPerGallon;
        double averageTotalMilesPerGallon;
        int counter=0;
        System.out.println("Enter the miles travelled by the Vehicle");
        miles = input.nextInt();
        System.out.println("Enter the gallon of fuel used by the vehicle");
        gallon = input.nextInt();
        System.out.printf("The miles travelled by vehicle is %d and the gallon used is %d%n", miles, gallon);
        while (miles != -1) {
            counter++;
            totalMiles+=miles;
            totalGallon+=gallon;
            System.out.println("Enter the miles travelled by the Vehicle");
            miles = input.nextInt();
            System.out.println("Enter the gallon of fuel used by the vehicle");
            gallon = input.nextInt();
            System.out.printf("The miles travelled by vehicle is %d and the gallon used is %d%n", miles, gallon);


        }

        if (totalMiles > 0) {
           totalMilesPerGallon=totalMiles/totalGallon;
            System.out.printf("The total miles per gallon is %.2f%n",totalMilesPerGallon);
            averageTotalMilesPerGallon=totalMilesPerGallon/counter;
            System.out.printf("The average total miles per gallon is:%.2f%n",averageTotalMilesPerGallon);
        }else{
            System.out.println("Enter a valid mile from 1 and above");}
    }
        }



