import java.util.Scanner;

public class BatterUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bases = sc.nextInt();
        int sum=0;
        int count = bases;
        for(int i=1; i<=bases; ++i){
            int b1 = sc.nextInt();
            if(b1==-1){
                --count;
            }
            else{
                sum=sum+b1;
            }
        }
        sc.close();
        double runs = (double)sum/(double)count;
        System.out.println(runs);
    }
}
