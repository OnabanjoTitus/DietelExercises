import javax.swing.*;
import java.util.InputMismatchException;

public class AirLineReservationSystemMain {
    public static void main(String[] args) {
        AirlineReservationSystem airlineReservationSystem= new AirlineReservationSystem();
try {


//        JOptionPane.showMessageDialog(null,airlineReservationSystem.reserveSeats(Integer.parseInt(JOptionPane.showInputDialog("Enter 1 for First class and  2 for Economy"))));

    System.out.println(airlineReservationSystem.reserveSeats(0));
//        System.out.println(airlineReservationSystem.reserveSeats(1));
//
//        System.out.println(airlineReservationSystem.reserveSeats(1));
//        System.out.println(airlineReservationSystem.reserveSeats(1));
//
//        System.out.println(airlineReservationSystem.reserveSeats(1));
//       System.out.println(airlineReservationSystem.reserveSeats(1));
//
//
//        System.out.println(airlineReservationSystem.reserveSeats(2));
//
//        System.out.println(airlineReservationSystem.reserveSeats(2));
//        System.out.println(airlineReservationSystem.reserveSeats(2));
//
//        System.out.println(airlineReservationSystem.reserveSeats(2));
//        System.out.println(airlineReservationSystem.reserveSeats(2));
//        System.out.println(airlineReservationSystem.reserveSeats(2));
}catch (InputMismatchException inputMismatchException){
    System.err.println("The value entered is not a number");
}


    }
}
