package java;
import java.util.Scanner;

public class PrintedStatues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prints = sc.nextInt();
        int i = 0;
        if (prints <= 1) {
            System.out.println(1);
        }

        else {
            int b = 1;
            while (prints > b) {
                i = 1 + i;
                b = 2 * b;
            }
            System.out.println(i + 1);
        }
    }
}
