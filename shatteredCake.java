import java.util.Scanner;

public class shatteredCake {
    public static void main(String[] args) {
        int widthOfCake, pieces, Wi, Li, LengthOfCake, AreaOfPieces, TotalArea = 0;
        Scanner sc = new Scanner(System.in);

        widthOfCake = sc.nextInt();
        pieces = sc.nextInt();
        for (int i = 0; i < pieces; ++i) {
            Wi = sc.nextInt();
            Li = sc.nextInt();
            AreaOfPieces = Wi * Li;
            TotalArea = AreaOfPieces + TotalArea;
        }
        LengthOfCake = TotalArea / widthOfCake;
        System.out.println(LengthOfCake);
    }
}
