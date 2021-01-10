import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("enter integer n for nth prime (1st prime = 2): ");
        int nth = console.nextInt();

        System.out.print("Prime #"+ nth + " is " + nthPrime(nth));
        System.out.println();
    }
    public static int nthPrime(int n) {
        int candidate, count;
        for(candidate = 2, count = 0; count < n; ++candidate) {
            if (isPrime(candidate)) {
                ++count;
            }
        }
        return candidate-1;
    }

    private static boolean isPrime(int n) {
        if (n % 2 == 0) return n == 2;
        if (n % 3 == 0) return n == 3;
        int step = 4, m = (int)Math.sqrt(n) + 1;
        for(int i = 5; i < m; step = 6-step, i += step) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}