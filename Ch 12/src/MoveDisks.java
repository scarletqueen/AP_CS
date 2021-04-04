import java.util.Scanner;

public class MoveDisks {
    public static int COUNTER;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter number of disks: ");
        int n = console.nextInt();

        System.out.print("Enter destination post: ");
        char dest = console.next().charAt(0);

        System.out.println("Moves:");

        if (dest == 'B') {
            moveDisks(n, 'A', 'B', 'C');
        } else {
            moveDisks(n, 'A', 'C', 'B');
        }

        System.out.println("Number of moves: " + COUNTER);
    }
    public static void moveDisks(int n, char source, char dest, char temp) {
        if (n == 1) {
            System.out.println(source + " -> " + dest);  // move last disk from source to dest
            COUNTER++;
        } else {
            moveDisks(n - 1, source, temp, dest);    // move (n-1) disks from source to temp
            System.out.println(source + " -> " + dest);// move bottom disk from source to dest
            moveDisks(n-1, temp, dest, source);    // move (n-1) disks from temp (now source) to source (now temp)
            COUNTER++;
        }
    }
}
