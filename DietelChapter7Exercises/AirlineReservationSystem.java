import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class AirlineReservationSystem {

    private boolean[] seats= new boolean[10];
    private int FirstClassSeatCounters;
    private int EconomySeatCounters;

    Scanner scanner= new Scanner(System.in);

    public boolean[] getAllFlightSeats() {
        return seats;
    }

    public String reserveSeats(int number) {
        String message ="";
    try{

        if(number==1){

            message += bookFirstClassSeats(number);
        }
        if(number==2){

            message += bookEconomyClassSeats(number);
        }
        if(number!=1 && number!=2){
        message += "Enter either 1 or 2 to book";
    }
    }
catch (InputMismatchException exception){
    System.err.println("Enter a valid number either 1 or 2");

    }
        return message;
    }

    private String bookEconomyClassSeats(int number) {
        String message = "";
        if(number==2){
            if(this.EconomySeatCounters==5){
              message +=  seatCounters(number);

            }
            for(int counter=9;counter>=(seats.length/2);counter--)
            {
                if(Objects.equals(checkEconomyClassSeats(counter),( boardingPass(2,counter)))){
                        message += "The seat " +(counter+1)+ " for the Economy class has been booked" +" "+ boardingPass(2,counter);
                        break;

                }

            }

        }
        return message;
    }
    private String checkEconomyClassSeats(int counter) {
        String message = "";
        if(!seats[counter]){
            if(Objects.equals(markEconomyClassSeats(counter), boardingPass(2,counter))){
            message += boardingPass(2,counter);

            }
        }
        return message;
    }

    private String markEconomyClassSeats(int counter) {
        String message = "";
        if(!seats[counter]){
            seats[counter]=true;
            message += boardingPass(2,counter);
            this.EconomySeatCounters+=1;

        }
        return message;
    }

    private String bookFirstClassSeats(int number){
        String message = "";
        if(number==1){
            if(this.FirstClassSeatCounters==5){
                message += seatCounters(number);
            }
            for(int counter=0;counter<(seats.length/2);counter++)
            {
                if(Objects.equals(checkFirstClassSeats(counter), boardingPass(1, counter))){
                message += "The seat " +(counter+1)+" for the First-class has been booked" + " "+boardingPass(1, counter);
                    break;

                }

            }
        }
        return message;
    }

    private String checkFirstClassSeats(int counter) {
        String message = "";
        if(!seats[counter]){
            if(Objects.equals(markFirstClassSeats(counter), boardingPass(1, counter))){
                message += boardingPass(1, counter);

            }
        }
        return message ;
    }

    private String markFirstClassSeats(int counter) {
        String message = "";
        if(!seats[counter]){
            seats[counter]=true;
            message += boardingPass(1,counter);
            this.FirstClassSeatCounters+=1;
        }
        return message;
    }
    private String seatCounters(int number){
        String message = "";
        if(number==1 && this.FirstClassSeatCounters==5 && this.EconomySeatCounters<5){
          message += "First class seats are all occupied but Economy class seats are available";


        }
        if(number==2 && this.EconomySeatCounters==5 && this.FirstClassSeatCounters<5){
         message += "Economy class seats are all occupied but First class seats are available";

        }
        if(this.EconomySeatCounters==5&&this.FirstClassSeatCounters==5){
      message +=  "Flight is fully booked next flight leaves in 3 hours";
        }
        return message;
    }
    private String boardingPass(int number,int number2){
        String message = "";
        if(number==1){
        message += "Your First class Flight has been booked and ur boarding pass number is "+number+"-"+(number2+1);
        }
        if(number==2){
            message += "Your Economy class Flight has been booked and ur boarding pass number is "+number+"-"+(number2+1);


        }
        return message;
    }




}
