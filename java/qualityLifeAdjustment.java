package java;
import java.util.Scanner;

public class qualityLifeAdjustment {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        float Qaly=1;
        float total=0;
        for(int i=1; i<=N; ++i){
            
            Qaly = sc.nextFloat();
            float time = sc.nextFloat();
            
            Qaly= Qaly*time;
            total=total+Qaly;
        }
        System.out.printf("%.3f" , total);
    }
}
