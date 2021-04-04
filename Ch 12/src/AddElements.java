import java.util.Scanner;

public class AddElements {
    public static void main(String [] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter size of integer array: ");
        int index = console.nextInt();

        System.out.println("Enter n integers separated by spaces: ");

        int[] list = new int[index];

        for (int i = 0; i < index; i++) {
            list[i] = console.nextInt();
        }

        int sum = sum(list);
        System.out.println("The sum of the elements in your list: " + sum);
    }
    public static int sum(int[] list) {
        return sum(list, 0);
    }
    private static int sum(int[] list, int index) {
        if (index == list.length) {
            return 0;
        } else {
            return list[index] + sum(list, index + 1);
        }
    }
}
