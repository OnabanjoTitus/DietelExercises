public class CircleArea {
    public static void main(String[] args) {

        System.out.println(circleArea(4));
        System.out.println(circleArea(8));
    }

    public static double circleArea(int radius) {
        double circleArea=2*Math.PI*Math.pow(radius,2);

        return circleArea;

    }
}
