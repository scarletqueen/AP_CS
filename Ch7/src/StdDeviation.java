import java.util.Scanner;

public class StdDeviation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Please enter the integer array dimension: ");
        int length = console.nextInt();
        int[] array = new int[length];

        System.out.println("Please enter the array elements: ");

        for (int i = 0; i < length; i++) {
            array[i] = console.nextInt();
        }

        double avg = average(array, length);
        double sum = 0.0, stdDev = 0.0;
        for (int i = 0; i < length; i++) {
             sum += Math.pow(avg - array[i],2);
        }
        stdDev = Math.sqrt(sum/(length-1));
        stdDev = Math.round (stdDev * 1000.0) / 1000.0;
        System.out.println("Standard deviation = " + stdDev );
    }
    public static double average(int arr[], int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return (double) sum / n;
    }
}
