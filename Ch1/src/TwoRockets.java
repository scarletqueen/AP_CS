public class TwoRockets {
    public static void main(String[] args){
        cone();
        square();
        middle();
        square();
        cone();
    }
    public static void cone() {
        System.out.println("   /\\       /\\ ");
        System.out.println("  /  \\     /  \\ ");
        System.out.println(" /    \\   /    \\ ");
    }
    public static void square() {
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }
    public static void middle() {
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
    }
}
