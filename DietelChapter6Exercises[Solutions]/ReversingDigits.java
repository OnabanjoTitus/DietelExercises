import java.util.Scanner;

public class ReversingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        String value=input.nextLine();
        int length=value.length();
        System.out.printf("%s",reverse(value,length));
    }

    public static String reverse (String number,int lengthSize) {
        String reversed="";

        for(int size =lengthSize-1;size>=0;size--){
            reversed=reversed + number.charAt(size);
        }

        return reversed;
    }


}
