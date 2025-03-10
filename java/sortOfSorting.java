package java;
import java.util.ArrayList;
import java.util.Scanner;

public class sortOfSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        ArrayList<String> a = new ArrayList<String>();
        do {
            x = sc.nextInt();
            String str = sc.next();
            a.add(str);
            for (int i = 0; i < a.size(); ++i) {
                if (a.get(i).charAt(0) > a.get(i + 1).charAt(0)) {
                    String temp = a.get(i);
                    a.set(i, a.get(i + 1));
                    a.set(i + 1, temp);
                }
            }
            for (int j = 0; j < a.size(); ++j) {
                System.out.println(a.get(j));
            }
        } while (x != 0);
    }
}
