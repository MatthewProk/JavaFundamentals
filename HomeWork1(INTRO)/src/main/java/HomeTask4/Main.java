package HomeTask4;

public class Main {

    public static void main(String[] args) {
        int n = 8  ;
        double[] arr = new double[2*n];
        for(int i = 0; i < 2*n; i++){
            arr[i] = Math.random()*15 + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(findMax(arr, n));

    }

    private static double findMax(double[] arr, int n) {
        double max = 0;
        double[] arr1 = new double[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = arr[i] + arr[2 * n - 1 - i];
            System.out.println("Номер " + i + ": " + arr1[i] + " ");
            if (i > 0) {
                if (arr1[i] > arr1[i - 1]) {
                    max = arr1[i];
                } else {
                    max = arr1[i - 1];
                    double tmp = arr1[i];
                    arr1[i] = arr1[i-1];
                    arr1[i-1] = tmp;
                }
            }
        }
        return max;
    }

}
