package java;
import java.util.Scanner;

public class NastyHacks {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=1; i<=n; ++i){
            int r = sc.nextInt();
            int e = sc.nextInt();
            int c = sc.nextInt();

            if(e-r> c){
                System.out.println("advertise");
            }
            else if(e-r == c){
                System.out.println("does not matter");
            }
            else{
                System.out.println("do not advertise");
            }
        }
    }
}
