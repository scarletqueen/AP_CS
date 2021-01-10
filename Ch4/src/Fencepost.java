import java.util.Scanner; // Scanner class

public class Fencepost {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String s = console.nextLine(); // taking in a String as user input

        dotPrint(s); // using the dotPrint method for String s
    }
    public static void dotPrint(String s) {
        if (s.length() > 0) { // getting the length of the string
            System.out.print(s.charAt(0));
            for (int i = 1; i < s.length(); i++) { // how many times the dots have to repeat
                System.out.print(".." + s.charAt(i)); // printing the dots
            }
        }
        System.out.println();
    }
}
