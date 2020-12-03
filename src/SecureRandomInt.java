import java.security.SecureRandom;

public class SecureRandomInt {
    public static void main(String[] args) {
        SecureRandom randomNumber= new SecureRandom();
        int random=  3+randomNumber.nextInt(12);
        System.out.println(random);
    }
}

