import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int numOfRows = console.nextInt();


        for (int i = 0; i < numOfRows; i++) {
            for ( int j = 0; j < numOfRows - (i + 1) ; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    System.out.printf("%d", nCr(i, j));
                } else {
                    System.out.printf("%4d", nCr(i, j));
                }

            }
            System.out.println();
        }
    }
    public static long factorial(int n) {
        long factorial;

        for (factorial = 1; n > 1; n--) {
            factorial *= n;
        }
        return factorial;
    }
    public static long nCr(int n, int r) {
        return factorial(n) / (factorial(n-r) * factorial(r));
    }
}
