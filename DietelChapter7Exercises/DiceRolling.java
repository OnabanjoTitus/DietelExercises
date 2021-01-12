import java.security.SecureRandom;

public class DiceRolling {
    public static void main(String[] args) {
        int [] total=new int[11];
        for(int counter=0;counter<36000000;counter++){
            SecureRandom secureRandom= new SecureRandom();
            int randomNumber1= 1+secureRandom.nextInt(6);
            int randomNumber2= 1+secureRandom.nextInt(6);
            int sum=randomNumber1+randomNumber2;
            switch (sum){
                case 2->++total[0];
                case 3->++total[1];
                case 4->++total[2];
                case 5->++total[3];
                case 6->++total[4];
                case 7->++total[5];
                case 8->++total[6];
                case 9->++total[7];
                case 10->++total[8];
                case 11->++total[9];
                case 12->++total[10];
            }

        }
        for(int counter=1;counter<12;counter++){


            System.out.printf("The sum %d appeared %d times%n",counter+1,total[counter-1]);


        }
    }
}
