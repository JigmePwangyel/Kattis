package java;
import java.util.Scanner;

class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for (int i = 0; i < x; ++i) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int count = 1;
        for (int j = 0; j < x - 1; ++j) {
            if (arr[j] < arr[j + 1]) {
                ++count;
            }
            if (count > max) {
                max = count;
            } else {
                count = 1;
            }

        }
        System.out.println(max);
    }
}