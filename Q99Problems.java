import java.util.Scanner;

public class Q99Problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x < 100) {
            System.out.println(99);
        } else {
            int smaller = Integer.parseInt(Integer.toString(x / 100 - 1) + "99");
            int larger = Integer.parseInt(Integer.toString(x / 100) + "99");
            if (Math.abs(x - larger) < Math.abs(x - smaller)) {
                System.out.println(larger);
            } else if (Math.abs(x - larger) == Math.abs(x - smaller)) {
                System.out.println(larger);
            } else if (Math.abs(x - larger) > Math.abs(x - smaller)) {
                System.out.println(smaller);
            }
        }
    }
}
