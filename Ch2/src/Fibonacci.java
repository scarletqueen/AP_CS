import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long n1 = 1;
        long n2;
        int numTerm;

        System.out.println("Enter number of terms:");
        numTerm = s.nextInt();

        for (int i = 0; i <= numTerm-1; i++ ) {
            if (n1>1) {
                System.out.println(i);
            }
            n1 = i + n1;
            n2 = n1;
            System.out.println(n2);
        }

    }
}
