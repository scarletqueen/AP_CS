import java.util.Scanner;

public class Primes2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        lesserPrime(n);
        greatestPrime(n);
        System.out.println(greatestPrimeFactor(n));

    }
    public static int greatestPrimeFactor(int n) {
        int primeFactor = n - 1;
        while(n % primeFactor != 0 || !isPrime(n)) {
            primeFactor--;
        }
        return primeFactor;
    }
    public static void greatestPrime(int n) {
        while ( ! isPrime(n)) {
            if (n % 2 == 0) {
                n++;
            } else {
                n += 2;
            }
        }
        System.out.println(n);
    }
    public static void lesserPrime(int n) {
        while ( ! isPrime(n)) {
            if (n % 2 == 0) {
                n--;
            } else {
                n -= 2;
            }
        }
        System.out.println(n);
    }
        public static boolean isPrime(int n) {
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
