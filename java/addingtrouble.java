package java;
import java.util.Scanner;

public class addingtrouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b == c) {
            System.out.println("correct!");
        } else {
            System.out.println("wrong!");
        }
    }
}
