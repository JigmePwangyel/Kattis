
import java.util.Scanner;
class pot{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total =0;
        
        for(int i =1; i<=n; ++i){
            int x = sc.nextInt();
            int pow = x%10;
            int num = x/10;
            total += Math.pow(num, pow);
        }
        System.out.println(total);
    }
}