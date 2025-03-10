import java.util.Scanner;

public class sibice {
    public static void main(String[] args) {
        int numberOfMatches, height, width, length, sizeOfMatches;

        Scanner sc = new Scanner(System.in);
        numberOfMatches = sc.nextInt();
        height = sc.nextInt();
        width = sc.nextInt();
        for (int i = 0; i < numberOfMatches; ++i) {
            sizeOfMatches = sc.nextInt();
            length = (int) Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
            if (length >= sizeOfMatches) {
                System.out.println("DA");
            } else
                System.out.println("NE");
        }
        sc.close();
    }
}
