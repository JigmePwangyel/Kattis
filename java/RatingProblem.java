package java;
import java.util.Scanner;

public class RatingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        float total = 0;
        for (int i = 0; i < k; ++i) {
            int ratings = sc.nextInt();
            total = total + ratings;
        }

        float minimum = (total + (n - k) * -3) / n;
        float maximum = (total + (n - k) * 3) / n;

        System.out.println(minimum);
        System.out.println(maximum);
    }
}
