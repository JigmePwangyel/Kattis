package java;
import java.util.Scanner;

public class FuriousCocktail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPotions = sc.nextInt();
        int timeToDrinkPotion = sc.nextInt();
        int potion = 0;
        for (int i = 1; i <= totalPotions; ++i) {
            potion = sc.nextInt();
        }
        if (totalPotions <= potion) {
            System.out.println("YES");
        } else
            System.out.println("NO");
    }
}
