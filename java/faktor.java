package java;
import java.util.Scanner;

public class faktor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        long ans;

        if(num1==1){
            ans = num1*num2;
            System.out.println(ans);
        }
        else{
            ans = num1*(num2-1)+1;
            System.out.println(ans);
        }
    }
}
