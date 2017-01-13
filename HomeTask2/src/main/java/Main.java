public class Main {

    public static void main(String[] args) {
        int i = 0;
        double a;
        final double E = 0.01;
        do {
            i++;
            a = 1 / java.lang.Math.pow( i + 1, 2 );
            System.out.println("a[" + i + "] = " + a);

        }
        while (a >= E );
        System.out.println("Наименьший номер элемента последовательности, для которого выполняется условие = " + i);
    }
}
