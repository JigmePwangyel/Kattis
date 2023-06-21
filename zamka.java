import java.util.*;

public class zamka {

    public static int sum(int s){
        int sumOfDigit =0;
        while(s>0){
            int digit = s%10;
            sumOfDigit = sumOfDigit+digit;
            s=s/10;
        }
        return sumOfDigit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int N = sc.nextInt();
        int X = sc.nextInt();

        int min=0;
        int max =0;

        for(int i=l; i<=N; ++i){
            min = sum(i);
            if(min==X){
                System.out.println(i);
                break;
            }
        }

        for(int i =N; i>=l; --i){
            max = sum(i);
            if(max == X){
                System.out.println(i);
                break;
            }
        }

    }
}
