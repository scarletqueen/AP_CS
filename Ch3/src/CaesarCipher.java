import java.util.Scanner;

public class CaesarCipher {

    public static String cipher(String str, int n) {
        String return_str = "";
        int l = str.length();
        for (int i=0; i<l; i++) {
            int ascii_value = (str.charAt(i) + n);
            ascii_value = (ascii_value - 97);
            ascii_value = (ascii_value % 26);
            ascii_value = ascii_value + 97;
            return_str = return_str + (char) ascii_value;

            /*int ascii_value = str.charAt(i) + n;
            if (ascii_value > 122) {
                ascii_value = ascii_value - 26;
            }
            char c = (char) ascii_value;
            return_str = return_str + c;*/
        }

        return return_str;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.print(cipher(str, 2));

    }
}
