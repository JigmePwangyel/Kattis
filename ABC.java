import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        String str = sc.next();

        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == 'A') {
                printSmallest(num1, num2, num3);
            } else if (str.charAt(i) == 'B') {
                printMiddle(num1, num2, num3);
            } else if (str.charAt(i) == 'C') {
                printLargest(num1, num2, num3);
            }
        }
    }

    public static void printLargest(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.print(num1 + " ");
        } else if (num2 > num1 && num2 > num3) {
            System.out.print(num2 + " ");
        } else if (num3 > num1 && num3 > num2) {
            System.out.print(num3 + " ");
        }
    }

    public static void printMiddle(int num1, int num2, int num3) {
        if (num2 > num1 && num1 > num3 || num3 > num1 && num1 > num2) {
            System.out.print(num1 + " ");
        }
        // checking num2 is a middle number or not
        if (num1 > num2 && num2 > num3 || num3 > num2 && num2 > num1) {
            System.out.print(num2 + " ");
        }
        // checking num3 is a middle number or not
        if (num1 > num3 && num3 > num2 || num2 > num3 && num3 > num1) {
            System.out.print(num3 + " ");
        }
    }

    public static void printSmallest(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            System.out.print(num1 + " ");
        } else if (num2 < num1 && num2 < num3) {
            System.out.print(num2 + " ");
        } else if (num3 < num1 && num3 < num2) {
            System.out.print(num3 + " ");
        }
    }
}
