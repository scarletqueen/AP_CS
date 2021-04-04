import java.util.Scanner;

public class BackTrackTravel {
    public static int COUNTER;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter (x, y) coordinates as two integers separated by a space: ");
        int targetX = console.nextInt();
        int targetY = console.nextInt();

        travel(targetX, targetY);
        System.out.println("Number of paths = " + COUNTER);

    }
    public static void travel(int targetX, int targetY) {
        explore(targetX, targetY, 0, 0, "moves:");
    }
    private static void explore(int targetX, int targetY, int currX, int currY, String path) {
        if (currX == targetX && currY == targetY) {
            System.out.println(path);
            COUNTER += 1;
        } else if (currX <= targetX && currY <= targetY) {
            explore(targetX, targetY, currX, currY + 1, path + " N");
            explore(targetX, targetY, currX + 1, currY + 1, path + " NE");
            explore(targetX, targetY, currX + 1, currY, path + " E");
        }
    }
}
