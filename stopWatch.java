import java.util.Scanner;

class stopWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int sum = 0;
        for (int i = 0; i < N; ++i) {
            arr[i] = sc.nextInt();
        }
        if (N % 2 != 0) {
            System.out.println("still running");
        } else {
            for (int j = 0; j < N - 1; ++j) {
                if (j % 2 == 0) {
                    sum = arr[j + 1] - arr[j] + sum;
                } else {
                    continue;
                }
            }
            System.out.println(sum);
        }
    }
}