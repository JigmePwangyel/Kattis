package java;
import java.util.Scanner;

public class NSum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum=0;

        for(int i=1; i<=n; ++i){
            int num = sc.nextInt();
            sum = sum+num;
        }
        System.out.println(sum);
    }
}
