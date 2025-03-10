package java;
import java.util.*;

class ColdPutterScience{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int data = sc.nextInt();
        int count = 0;
        for(int i=1; i<=data; ++i){
            int t = sc.nextInt();
            if(t<0){
                ++count;
            }
        }
        System.out.println(count);
    }
}