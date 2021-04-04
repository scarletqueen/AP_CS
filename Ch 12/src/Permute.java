import java.util.TreeSet;
import java.util.Scanner;

public class Permute {
    public static void main(String[] args) {
        TreeSet<String> ordered = new TreeSet<>();

        Scanner console = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = console.next();

        int n = str.length();
        Permute permutation = new Permute();
        permutation.permute(str, 0, n-1, ordered);

        for (String value: ordered) {
            System.out.println(value);
        }
    }

    private void permute(String str, int l, int r, TreeSet<String> ordered) {
        if (l == r)
            ordered.add(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r, ordered);
                str = swap(str,l,i);
            }
        }
    }

    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
