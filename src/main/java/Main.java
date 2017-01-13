
public class Main {
    public static void main(String[] args) {
        if ( args.length < 2 ) {
            System.out.println("Элементов должно быть не меньше двух.");
        }
        else {
            double maxValue = Double.parseDouble(args[0]) + Double.parseDouble(args[1]);
            for ( int i = 0; i < ( args.length + 1 ) / 2; i++) {
                if ( Double.parseDouble(args[i]) + Double.parseDouble(args[ args.length - i - 1 ]) > maxValue ) {
                    maxValue = Double.parseDouble(args[i]) + Double.parseDouble(args[ args.length - i - 1 ]);
                }
            }
            System.out.println(maxValue);
        }
    }
}
