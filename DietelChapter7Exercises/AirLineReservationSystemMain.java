import javax.swing.*;

public class AirLineReservationSystemMain {
    public static void main(String[] args) {
        AirlineReservationSystem airlineReservationSystem= new AirlineReservationSystem();
        String counter="yes";
        while(counter.equals("yes")) {
            airlineReservationSystem.reserveSeats(Integer.parseInt(JOptionPane.showInputDialog("Enter the class you want to book")));
            counter=(JOptionPane.showInputDialog("Would You like to book again yes or no")).toLowerCase();
        }
        System.out.println("End of File");

    }
}
