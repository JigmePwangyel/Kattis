import java.util.Scanner;
import java.util.Stack;

public class AboveAverage {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Stack<Integer> stk = new Stack<>();
            int average = 0;
            int cases = sc.nextInt();
            float count = 0;
            for (int i = 0; i < cases; ++i) {
                int N = sc.nextInt();
                for (int j = 0; j < N; ++j) {
                    int marks = sc.nextInt();
                    average = marks + average;
                    stk.push(marks);
                }
                average = average / N;
                while (!stk.isEmpty()) {
                    if (stk.pop() > average) {
                        ++count;
                    }
                }
                System.out.printf("%.3f", (count / N) * 100);
                System.out.println("%");
                count = 0;
                average = 0;
            }
        }
    }
}
