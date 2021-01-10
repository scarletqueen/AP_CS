
import java.io.*;
import java.util.*;
public class WordCount {
    public static void main(String[] args) throws FileNotFoundException {
            Scanner console = new Scanner(System.in);
            System.out.print("Enter name of text file, e.g. Iliad.txt: ");
            String fileName = console.next();
            Scanner input = new Scanner(new File(fileName));
            int count = 0;
            while (input.hasNext()) {
                String word = input.next();
                count++;
            }
            System.out.println("Total words = " + count);
    }
}

