import java.util.Scanner; // Scanner class

public class CBizzFuzz {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a positive integer: "); // user input of the number
        int n = console.nextInt();

        long m = sumOfMultiples(n);

        System.out.println(m); // print out the sum
    }
    public static long sumOfMultiples(int n) {
        long sum = 0;
        for (int i = 3 ;  i < n; i++) {
            if ((i % 3 == 0 || i % 5 ==0) && i % 15 != 0) { // modulus 3 and 5 if it equals 0, then the number is a multiple
                sum += i; // add to the sum which starts off as zero
            }
        }
        return sum;
    }
}
