import java.util.ArrayList;
import java.util.Scanner;

public class Interleave {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();

        System.out.println();
        System.out.println("Please enter a sequence of integers separated\nby spaces. End the sequence with the sentinel\nvalue 0, followed by a return.\n");
        while (console.hasNextInt()) {
            int firstArr = console.nextInt();
            if (firstArr == 0) break;
            array.add(firstArr);
        }

        System.out.println("Your first list: " + array.toString());
        System.out.println();

        System.out.println("Please enter a sequence of integers separated\nby spaces. End the sequence with the sentinel\nvalue 0, followed by a return.\n");
        while (console.hasNextInt()) {
            int secondArr = console.nextInt();
            if (secondArr == 0) break;
            array2.add(secondArr);
        }

        System.out.println("Your second list: " + array2.toString());
        System.out.println();

        interleave(array, array2);
        System.out.println("Your interleaved list: " + array.toString());

    }

    public static void interleave(ArrayList array1, ArrayList array2)
    {
        int i = 1;
        int j = 0;

        while(j < array2.size())
        {
            if(i < array1.size())
            {
                array1.add(i, array2.get(j));
                i += 2;
            }
            else
            {
                array1.add(array2.get(j));
                i++;
            }

            j++;
        }
    }
}
