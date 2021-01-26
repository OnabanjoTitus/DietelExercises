public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(2,2,2020);
        Date date2 = new Date("3",2,2020);
        Date date3 = new Date(223,2020);
        System.out.println(date.getAllTheDates());
        System.out.println(date2.getInWordDate());
        System.out.println(date3.getLongDate());
        System.out.println(date.getLocalDate());

    }
}
