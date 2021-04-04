import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n1 = console.nextInt();

        System.out.print("Enter an integer: ");
        int n2 = console.nextInt();

        int GCD = findGCD(n1, n2);
        System.out.println("GCD = " + GCD);

    }
    private static int findGCD(int n1, int n2) {
        Math.abs(n1);
        Math.abs(n2);

        if (n2 == 0) {
            return n1;
        }
        return findGCD(n2, n1%n2);
    }
}

