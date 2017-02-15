package HomeTask3;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 25;
        int h = 3;
        for (int x = a; x <= b; x += h) {
            double F = java.lang.Math.tan(2 * x) - 3;
            System.out.println("x = " + x + " F = " + F);

        }
    }
}
