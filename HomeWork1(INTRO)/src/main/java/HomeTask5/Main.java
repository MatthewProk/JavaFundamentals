package HomeTask5;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        showMatrix(9);
    }

    private static void showMatrix(int a) {
        int[][] matrix = new int[a][a];

        for(int i = 0; i < a; ++i) {
            for(int j = 0; j < a; ++j) {
                if(i == j) {
                    matrix[i][j] = 1;
                } else if(j == a - i - 1) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

    }
}
