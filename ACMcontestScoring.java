import java.util.ArrayList;
import java.util.Scanner;

public class ACMcontestScoring {
    public static void main(String[] args) {
        int penalty = 0;
        int totalTime = 0;
        int totalSolved = 0;

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        do {
            int time = sc.nextInt();

            if (time == -1) {
                break;
            }
            if (time != -1) {
                String str1 = sc.next();
                String str2 = sc.next();
                if (str2.equalsIgnoreCase("wrong")) {
                    list.add(str1);
                } else if (str2.equalsIgnoreCase("right")) {
                    for (int i = 0; i < list.size(); ++i) {
                        if (str1.equalsIgnoreCase(list.get(i)))
                            ++penalty;
                    }
                    ++totalSolved;
                    totalTime = totalTime + time;
                }
            }

        } while (true);
        totalTime = totalTime + (20 * penalty);
        System.out.println(totalSolved + " " + totalTime);
    }
}