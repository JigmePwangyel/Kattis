import java.util.Scanner;

public class trik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 0, 0 };
        int temp = 0;
        String str = sc.next();
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == 'A') {
                temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
            }
            if (str.charAt(i) == 'B') {
                temp = arr[1];
                arr[1] = arr[2];
                arr[2] = temp;
            }

            if (str.charAt(i) == 'C') {
                temp = arr[0];
                arr[0] = arr[2];
                arr[2] = temp;
            }
        }
        for (int j = 0; j < 3; ++j) {
            if (arr[j] == 1) {
                System.out.println(j + 1);
            }

        }
    }
}
