import java.util.Scanner;

public class finalExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        char c[] = new char[x];
        for (int k = 0; k < c.length; ++k) {
            c[k] = sc.next().charAt(0);
        }
        for (int i = 0; i < c.length - 1; ++i) {
            if (c[i] == c[i + 1]) {
                count++;
            }
        }
        System.out.println(count);

    }
}
