import java.util.*;

public class chanukah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        for(int i=1; i<=P; ++i){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int days =0;
            N=1;
            for(int j =1; j<=K; ++j){
                days = days+N+1; 
                ++N;
            }
            System.out.println(i + " " + days);
        }
    }
}
