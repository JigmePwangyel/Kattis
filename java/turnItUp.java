package java;
import java.util.Scanner;

class turnItUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int currentVolume = 7;

        for (int i = 0; i <= x; ++i) {
            String str = sc.nextLine();

            if (str.equals("Skru op!")) {

                if (currentVolume < 10 && currentVolume >= 0) {

                    currentVolume++;

                }
            } else if (str.equals("Skru ned!")) {
                if (currentVolume <= 10 && currentVolume > 0) {
                    currentVolume--;
                }
            }
        }
        System.out.println(currentVolume);
    }
}