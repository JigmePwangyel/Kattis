package java;
import java.util.Scanner;

public class knotProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a[] = new int[x];
        int b[] = new int[x - 1];
        for (int i = 0; i < x; ++i) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < x - 1; ++j) {
            b[j] = sc.nextInt();
        }
        check(a, b);
    }

    public static void check(int a[], int b[]) {
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < b.length; ++j) {
                if (a[i] == b[j]) {
                    break;
                }
                if (j == b.length - 1) {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
