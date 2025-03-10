import java.util.*;

public class jumboJaveline {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int size=0;

        for(int i=1; i<=N; ++i){
            int x = sc.nextInt();
            size = size+x;
        }
        System.out.println(size-(N-1));
    }
}
