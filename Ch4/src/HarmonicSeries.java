import java.util.Scanner; // Scanner class

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double number = console.nextDouble(); // input from user
        double sum = 0.0; // total sum of the harmonic series
        double x = 0;
        while (sum <= number) { // to complete total iterations from the user
            x++;
            sum += 1/x;
        }
        // output
        System.out.printf("Actual sum = %.5f\n", sum);
        System.out.println("Number of terms required: " + (int) (x));
    }
}
