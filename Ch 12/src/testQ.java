public class testQ {
    public static void main(String[] args) {
        System.out.println(mystery("bob",'b'));
    }
    public static int mystery(String s, char c) {
        if (s.length() == 0) {
            return 0;
        }
        if (s.charAt(0) == c) {
            return 1 + mystery(s.substring(1), c);
        }
        return mystery(s.substring(1), c);
    }
}
