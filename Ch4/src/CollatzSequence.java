import java.util.Scanner; // Scanner class

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter number of terms followed by terms: ");
        int numOfTerms = console.nextInt(); // num of terms the user inputs
        int longestNum = 0; // setting a value for the longest num of terms in a sequence

        for (int i = 0; i < numOfTerms; i++) {
            int firstNum = console.nextInt(); // taking in each integer that is given by user until there are no terms left
            int secondNum;
            int count = 1;
            while (firstNum != 1 && firstNum >= 1) { // setting conditions for the while loop \
                if (firstNum % 2 == 0)  { // checking if the number is even or odd
                    secondNum = firstNum / 2; // if even, do this
                } else {
                    secondNum = 3 * firstNum + 1; // if odd, do this
                }
                firstNum = secondNum;
                count++;
            }
            System.out.println(count);

            if (count > longestNum) {
                longestNum = count; // if the count is the largest we need to print that
            }
        }
        System.out.println("Longest: " + longestNum);
    }
}
