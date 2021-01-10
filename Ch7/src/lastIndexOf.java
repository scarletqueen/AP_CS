import java.util.Scanner;

public class lastIndexOf {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Please enter seven elements of an integer array and a value: ");

        int[] integers = new int[7];

        for (int i = 0; i < 7; i++) {
            integers[i] = console.nextInt();
        }

        int value = console.nextInt();

        int count = -1;
        for (int i = 0; i < 7; i++) {
            if (value == integers[i]) {
                count = i;
            }
        }
        System.out.println("Last index of value = " + count);
    }
}
