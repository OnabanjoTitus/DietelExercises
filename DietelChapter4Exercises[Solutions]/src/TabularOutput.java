public class TabularOutput {
    public static void main(String[] args) {
        int counter = 1;
        System.out.println("N      10*N     100*N    1000*N");

        while (counter < 6) {
            int tens = counter * 10;
            int hundred = counter * 100;
            int thousand = counter * 1000;

            System.out.printf("%d       %d      %d      %d%n",counter,tens,hundred,thousand);
            counter++;
        }
    }
}