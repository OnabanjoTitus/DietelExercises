import java.util.Scanner;

public class TheTwelveDaysOfChristmas {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a day between 1 to 12");
            int days = input.nextInt();
            switch (days) {
                case 12:
                    if (days == 12) {
                        System.out.println(("On the twelfth day of Christmas my true love gave to me"));
                    }
                    System.out.println("Twelve drummers drumming");
                case 11:
                    if (days == 11) {
                        System.out.println(("On the eleventh day of Christmas my true love gave to me"));
                    }
                    System.out.println("Eleven pipers piping,");
                case 10:
                    if (days == 10) {
                        System.out.println(("On the tenth day of Christmas my true love gave to me"));
                    }
                    System.out.println("Ten lords a leaping,");
                case 9:
                    if (days == 9) {
                        System.out.println(("On the ninth day of Christmas my true love gave to me"));
                    }
                    System.out.println("Nine ladies dancing,");
                case 8:
                    if (days == 8) {
                        System.out.println(("On the eighth day of Christmas my true love gave to me"));
                    }
                    System.out.println("Eight maids a milking,");
                case 7:
                    if (days == 7) {
                        System.out.println(("On the seventh day of Christmas my true love gave to me"));
                    }
                    System.out.println("Seven swans a swimming,");
                case 6:
                    if (days == 6) {
                        System.out.println(("On the sixth day of Christmas my true love gave to me"));
                    }
                    System.out.println("Six geese a laying,");
                case 5:
                    if (days == 5) {
                        System.out.println(("On the fifth day of Christmas my true love gave to me"));
                    }
                    System.out.println("Five gold rings,");
                case 4:
                    if (days == 4) {
                        System.out.println(("On the fourth day of Christmas my true love gave to me"));
                    }
                    System.out.println("Four calling birds,");
                case 3:
                    if (days == 3) {
                        System.out.println(("On the third day of Christmas my true love gave to me"));
                    }
                    System.out.println("Three French hens,");
                case 2:
                    if (days == 2) {
                        System.out.println(("On the second day of Christmas my true love gave to me"));
                    }
                    System.out.println("Two turtle doves and ");
                case 1:
                    if (days == 1) {
                        System.out.println(("On the first day of Christmas my true love gave to me"));
                    }
                    System.out.println("A partridge in a pear tree ");
                    break;
                default:
                    System.out.println("invalid day, enter a day between 1-12");

            }

        }
    }


