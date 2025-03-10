import java.util.*;

public class gcvwr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int GCVWR = sc.nextInt();
        int T = sc.nextInt();
        int N = sc.nextInt();

        double wt = (double)(GCVWR-T) * 0.9;
        int totalWtItems = 0;
        for(int i=1; i<=N; ++i){
            int items = sc.nextInt();
            totalWtItems = totalWtItems+items;
        }
        System.out.println((int)(wt-totalWtItems));
    }
}
