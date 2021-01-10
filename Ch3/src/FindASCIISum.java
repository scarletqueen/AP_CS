import java.util.Scanner;                             // import Scanner class

public class FindASCIISum {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        console.nextLine();                           // tells Scanner that it must scan the next line
        int sum = 0;                                  // created a global sum

        for(int i = 1; i <= n; i++) {                 // for every string entered
            String input = console.nextLine();

            for(int j=0; j<input.length(); j++) {     // for every character that needs to be added
                int asciiValue = input.charAt(j);
                sum = sum + asciiValue;               // adding all the ASCII values together
            }
        }
        System.out.println(sum);                      // printing final sum
        console.close();
    }
}