package java;
import java.util.Scanner;

class electricalOutlets{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        int count =0;
        for(int i=1; i<=testCase; ++i){
            int powerStrips = sc.nextInt();
            int total = 0;
            for(int j=1;j<=powerStrips;++j){
                int outlets = sc.nextInt();
                total = total+outlets;
                count = j;
            }
            System.out.println(total-(count-1));
        }
        
    }
}