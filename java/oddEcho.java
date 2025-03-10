package java;
import java.util.Scanner;

public class oddEcho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str;

        for(int i=1; i<=n; i++){
            str = sc.next();

            if(i%2!=0){
                System.out.println(str);
            }
        }
    }
}