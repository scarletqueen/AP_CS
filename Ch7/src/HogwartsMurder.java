import java.util.*;

public class HogwartsMurder {
    public static void main(String [] args){
        Scanner console = new Scanner(System.in);

        int length = console.nextInt();
        int[] clue = new int[length];

        for (int i = 0; i < length; i++) {
            clue[i] = console.nextInt();
        }

        int[] swapped = swapNumbers(clue);
        System.out.println(printWord(swapped, length));

    }

    public static int[] swapNumbers(int[] a) {
        for(int i = 1; i<a.length; i+=8) {
            if(i+5<a.length) {
                int temp = a[i];
                int temp2 = a[i+1];
                a[i] = a[i+4];
                a[i+1] = a[i+5];
                a[i+4] = temp;
                a[i+5] = temp2;
            }
        }
        return a;
    }

    public static String printWord(int[] a, int length){
        int sum = 0;
        String word = "";
        for (int i = 0; i<length; i=i+4){
            sum = a[i]+a[i+1]+a[i+2]+a[i+3];
            word = word + (char) sum;
            sum = 0;
        }
        return word;
    }

}




/*import java.util.Scanner;

public class HogwartsMurder {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int length = console.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = console.nextInt();
        }

        int[] swapped = swapNumbers(array);

        int count = 0;
        int sum;
        String asciiValue = "";
        for( int i = 0; i < length; i++) {
            if (count == 4) {
                sum = swapped[i]+swapped[i+1]+swapped[i+2]+swapped[i+3];
                asciiValue = asciiValue + (char) sum;
                count = 0;
                sum = 0;
            }
            count++;
        }
        System.out.print(asciiValue);
    }
    public static int[] swapNumbers(int[] a) {
        for(int i = 1; i<a.length; i+=8) {
            if(i+5<a.length) {
                int temp = a[i];
                int temp2 = a[i+1];
                a[i] = a[i+4];
                a[i+1] = a[i+5];
                a[i+4] = temp;
                a[i+5] = temp2;
            }
        }
        return a;
    }

}
*/