public class ParkingCharges {
    public static void main(String[] args) {

        System.out.printf("$%.2f%n",calculateCharges(24));
        System.out.printf("$%.2f%n",calculateCharges(13));
        System.out.printf("$%.2f%n",calculateCharges(2));
        System.out.printf("$%.2f%n",calculateCharges(0));

    }

    public static double calculateCharges(int hoursParked) {
        double garageCharges =0;
       if (hoursParked<3){
           garageCharges=2.00;
       }
        if (hoursParked>3){
            garageCharges=2.0+(hoursParked-3)*0.5;
        }
        if(hoursParked==24){
            garageCharges=10.00;
        }


       return garageCharges;
    }
}
