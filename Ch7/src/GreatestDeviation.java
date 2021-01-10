import java.util.Scanner;

public class GreatestDeviation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int length = console.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = console.nextInt();
        }

        double value = 0, maxValue = -1;
        int largeD = 0;
        double avg = average(array, length);
        for (int i = 0; i < length; i++) {
            value = Math.abs(array[i] - avg);
            System.out.println(value);
            if(i == 0 || value>maxValue) {
                maxValue = value;
                largeD = array[i];
            }
        }
        System.out.println(largeD);

    }
    public static double average(int arr[], int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum / n;
    }
}
