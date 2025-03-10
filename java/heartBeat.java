package java;
import java.util.*;

public class heartBeat {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 1; i<=N; ++i){
            float B = sc.nextFloat();
            float P = sc.nextFloat();

            float BPM = 60*B/P;
            float maxABPM = 60/P + BPM;
            float minABPM = BPM - 60/P ;

            System.out.printf("%.4f",minABPM);
            System.out.printf(" %.4f",BPM);
            System.out.printf(" %.4f",maxABPM);
            System.out.println("");
        }
    }
}
