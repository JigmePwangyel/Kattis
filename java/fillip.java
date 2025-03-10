package java;
import java.util.*;

public class fillip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int reverse1 = 0;
        int reverse2 = 0;
        int R;
    
        while(num1!=0){
            R = num1%10;
            reverse1 = reverse1*10+R;
            num1=num1/10;
        }
        while(num2!=0){
            R = num2%10;
            reverse2 = reverse2*10+R;
            num2=num2/10;
        }
        if(reverse1>reverse2){
            System.out.println(reverse1);
        }
        else{
            System.out.println(reverse2);
        }
    }
}
