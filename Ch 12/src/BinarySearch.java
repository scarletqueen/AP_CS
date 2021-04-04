import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int size, index, num;

        Scanner console = new Scanner(System.in);

        size = console.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = console.nextInt();
        }
        num = console.nextInt();

        System.out.println(search(arr, 0, arr.length - 1, num));
    }
    public static int search(int[] arr, int start, int end, int num) {
        if (end < start) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == num) {
            return mid;
        } else {
            if (num < arr[mid]) {
                return search(arr, start, mid - 1, num);
            } else {
                return search(arr, mid + 1, end, num); 
            }
        }
    }
}
