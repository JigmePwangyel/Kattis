import java.util.Arrays;
import java.util.Scanner;

public class Akcija {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NumberOfBooks = sc.nextInt();
        int arr[] = new int[NumberOfBooks];
        int price = 0;
        for (int i = 0; i < NumberOfBooks; ++i) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);

        for (int i = NumberOfBooks - 1; i > NumberOfBooks % 3; i -= 3) {
            price = arr[i] + price;
            price = arr[i - 1] + price;

        }
        for (int i = 0; i < NumberOfBooks % 3; i++)
            price += arr[i];
        System.out.println(price);

    }
}
