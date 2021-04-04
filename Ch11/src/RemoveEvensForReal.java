import java.io.*;
import java.util.*;

public class RemoveEvensForReal {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner console = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<String>();

        System.out.println("Removes strings of even length from an array.");
        System.out.print("Enter filename for file containing strings: ");
        System.out.println("Enter two indices for range of odd words to be printed out: ");

        String fileName = console.next();
        File myObj = new File(fileName);

        Scanner input = new Scanner(myObj);
        while (input.hasNext()) {
            String word = input.next();
            list.add(word);
        }

        int n1 = console.nextInt();
        int n2 = console.nextInt();

        System.out.println("initial list.size(): " + list.size());

        // get an iterator for list
        // Note: under the hood, Java makes iterator when compiling for-each loop
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            if (element.length() % 2 == 0) {
                itr.remove();               // does not change node count
            }
        }

        // Start by deleting "EvensRemoved.txt file" if it exists.
        System.out.println("final   list.size(): " + list.size());
        PrintStream output = new PrintStream(new File("EvensRemoved.txt"));

//             // // This loop takes a FEW MINUTES to complete! An "EvensRemoved.txt file"
//             // // is written to the program folder right away, but if you open it right
//             // // away you find it is incomplete. You can monitor progress by repeatedly
//             // // opening it and observing that the last word in the file has changed.
//             // // LinkedList is incredibly slow for sequential operations like this
//             // // which do not use an iterator.
//             // int j = 0;
//             // while (j < list.size()) {
//             //     output.println(list.get(j));    // populate .txt file in program folder
//             //     j++;
//             // }

//             // Using an iterator, this loop takes about two seconds to complete.
        Iterator<String> itr2 = list.iterator();
        while (itr2.hasNext()) {
            output.println(itr2.next());    // populate .txt file in program folder
        }

        // Print odd words from n1th to n2th indices
        System.out.println("odd words from index " + n1 + " to " + n2 + ":");
        Scanner input2 = new Scanner(new File("EvensRemoved.txt")); // evens removed
        for (int k = 0; k < n1; k++) {
            String stepOver = input2.next();    // step to starting point
        }
        for (int k = 0; k <= (n2 - n1); k++) {
            System.out.println(input2.next());
        }
    }
}

