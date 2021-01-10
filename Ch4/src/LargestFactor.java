import java.util.Scanner; // Scanner class

public class LargestFactor {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        if (n > 1) {
            System.out.println(largestInt(n)); // number has to be greater than 1 to work
        }
    }
    public static int largestInt(int n) {
        int factor = n - 1;
        while (n % factor != 0) { // calculates the second to last factor of the number
            factor--;
        }
        return factor;
    }

}
