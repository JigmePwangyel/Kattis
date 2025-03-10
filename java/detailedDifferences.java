package java;
import java.util.Scanner;

public class detailedDifferences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        for (int i = 0; i < x; ++i) {
            String str = sc.next();
            String str1 = sc.next();
            eq(str, str1);
        }
    }

    public static void eq(String str, String str1) {
        System.out.println(str);
        System.out.println(str1);
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == str1.charAt(i)) {
                System.out.print(".");
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
