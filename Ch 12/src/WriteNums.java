import java.util.Scanner;

public class WriteNums {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = console.nextInt();

        writeNums(n);
        System.out.println();

    }
    public static void writeNums(int n) {
        if (n < 1) throw new IllegalArgumentException();
        if (n == 1) {
            System.out.print(1);
            return;
        }

        writeNums(n - 1);
        System.out.print(", " + n);
    }
}
