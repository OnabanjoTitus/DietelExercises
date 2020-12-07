import java.security.SecureRandom;
/*
guess the number from 0-20

*/
public class GuessTheNumber {
    SecureRandom randomNumber = new SecureRandom();
    private int randomValue;
    public void generator() {
        this.randomValue =(randomNumber.nextInt(21));
    }
 public void setNumber(int number) {
        if (number==randomValue){
            System.out.println("Congratulations you guessed the number");
        }
    }
    public int getRandomNumber() {
        return randomValue;
    }


    private int greaterNumber;
    public void setRandomNumberGreater(int number){
     if(number>randomValue);
     this.greaterNumber=number;
        if (number>randomValue){
            System.out.println("Too high.try again");
        }
    }
    public int getRandomNumberGreater() {
      return greaterNumber;
    }


    private int smallerNumber;
    public void setRandomNumberSmaller(int number){
        if(number<randomValue);
        this.greaterNumber=number;
        if (number<randomValue){
            System.out.println("Too low.try again");
        }

    }
    public int getRandomNumberSmaller() {
        return greaterNumber;
    }


    }

