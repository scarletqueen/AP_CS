import java.util.Scanner;
import java.util.TreeSet;

public class PrintSquares {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("positive integer: ");
        int n = console.nextInt();

        printSquares(n);
    }
    public static void printSquares(int n) {
        printSquares(n, 1, new TreeSet<Integer>());
    }

    private static void printSquares(int n, int index, TreeSet<Integer> squares) {
        if (n == 0) {
            System.out.println("unique bases: " + squares);;
        } else if (n > 0) {
            int root = (int) Math.sqrt(n);
            for (int i = index; i <= root; i++) {
                if (n - i * i >= 0) {
                    squares.add(i);
                    printSquares(n - i * i, i + 1, squares);
                    squares.remove(i);
                }
            }
        }
    }
}
