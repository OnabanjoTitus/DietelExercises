import java.security.SecureRandom;

public class RollADie {
    public static void main(String[] args) {
      SecureRandom randomNumber= new SecureRandom();
      int c[]=new int [7];
      for(int roll=1;roll<=20;roll++){
          ++c[1+randomNumber.nextInt(6)];
      }
        System.out.printf("%s%10s%n","index","value");
      for(int counter=1;counter<c.length;counter++){
          System.out.printf("%d%10d%n",counter,c[counter]);

      }


    }
}
