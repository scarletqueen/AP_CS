import java.util.Scanner;

public class EuclidGCD {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter positive integer a: "); // getting the first integer
        int a = console.nextInt();

        System.out.println("Enter positive integer b: "); // getting the second integer
        int b = console.nextInt();

        int g = gcd(a, b); // method call with two parameters
        System.out.println("Greatest common divisor (GCD) = " + g);
    }
    public static int gcd(int a, int b) {
        if  (a==0) {
            return b; // because 0 cannot be divided by anything since it will always return zero
        }
        return gcd(b % a,  a); // using Euclid's algorithm
    }
}
