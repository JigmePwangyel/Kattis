package java;
import java.util.Scanner;

class Arraysmoothing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = sc.nextInt();
        }
        int max = findMax(arr);

    }

    public static int findMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; ++i) {
            int count = 0;
            for (int j = 0; j < arr.length; ++j) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    public static int remove(int max, int[] arr, int k) {
        int removed = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == max && removed <= k) {
                arr.remove(max);
                ++k;
            }
        }
        return removed;
    }
}