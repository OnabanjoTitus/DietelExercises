import javax.swing.*;
import java.util.Scanner;

public class AirlineReservationSystem {

    private boolean[] seats= new boolean[10];
    private int FirstClassSeatCounters;
    private int EconomySeatCounters;

    Scanner scanner= new Scanner(System.in);

    public boolean[] getAllFlightSeats() {
        return seats;
    }

    public void reserveSeats(int number) {
        if(number==1){
            bookFirstClassSeats(number);
        }
        if(number==2){
            bookEconomyClassSeats(number);
        }
    }

    private void bookEconomyClassSeats(int number) {
        if(number==2){
            if(this.EconomySeatCounters==5){
                seatCounters(number);
            }
            for(int counter=9;counter>=(seats.length/2);counter--)
            {
                if(checkEconomyClassSeats(counter)==2){
                    JOptionPane.showMessageDialog(null,"The seat "+(counter+1)+" for the Economy class has been booked");
                    break;
                }

            }

        }

    }
    private int checkEconomyClassSeats(int counter) {
        if(!seats[counter]){
            if(markEconomyClassSeats(counter)==2){
                return 2;
            }
        }
        return 0;
    }

    private int markEconomyClassSeats(int counter) {
        if(!seats[counter]){
            seats[counter]=true;
            boardingPass(2,counter);
            this.EconomySeatCounters+=1;
            return 2;
        }
        return 0;
    }

    private void bookFirstClassSeats(int number){
        if(number==1){
            if(this.FirstClassSeatCounters==5){
                seatCounters(number);
            }
            for(int counter=0;counter<(seats.length/2);counter++)
            {
                if(checkFirstClassSeats(counter)==1){
                    JOptionPane.showMessageDialog(null,"The seat " +(counter+1)+" for the First-class has been booked");
                    break;
                }

            }
        }
    }

    private int checkFirstClassSeats(int counter) {
        if(!seats[counter]){
            if(markFirstClassSeats(counter)==1){
                return 1;
            }
        }
        return 0;
    }

    private int markFirstClassSeats(int counter) {
        if(!seats[counter]){
            seats[counter]=true;
            boardingPass(1,counter);
            this.FirstClassSeatCounters+=1;
            return 1;
        }
        return 0;
    }
    private void seatCounters(int number){

        if(number==1 && this.FirstClassSeatCounters==5 && this.EconomySeatCounters<5){
            JOptionPane.showMessageDialog(null,"First class seats are all occupied but Economy class seats are available");


        }
        if(number==2 && this.EconomySeatCounters==5 && this.FirstClassSeatCounters<5){
            JOptionPane.showMessageDialog(null, "Economy class seats are all occupied but First class seats are available");

        }
        if(this.EconomySeatCounters==5&&this.FirstClassSeatCounters==5){
            JOptionPane.showMessageDialog(null, "Flight is fully booked next flight leaves in 3 hours");
        }
    }
    private void boardingPass(int number,int number2){
        if(number==1){
            JOptionPane.showMessageDialog(null,"Your First class Flight has been booked and ur boarding pass number is "+number+"-"+(number2+1));
        }
        if(number==2){
          JOptionPane.showMessageDialog(null,"Your Economy class Flight has been booked and ur boarding pass number is "+number+"-"+(number2+1));
        }
    }

}
