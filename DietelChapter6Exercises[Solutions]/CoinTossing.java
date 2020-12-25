import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int TossCoin=0;
        System.out.println("To toss coin enter 1 and any other number to stop:");
        TossCoin= input.nextInt();
        while(TossCoin==1){

            if(TossCoin==1){
                flip();
            }
            System.out.println("To toss coin enter 1 and any other number to stop:");
            TossCoin=input.nextInt();
        }


    }

    public static void flip() {
        SecureRandom randomNumber= new SecureRandom();
        int answer=randomNumber.nextInt(2);
        if(answer==1){
            System.out.println("HEAD");
        }else {
            System.out.println("TAIL");
        }

    }
}
