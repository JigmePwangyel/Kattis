import java.util.*;

public class fyi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int count =0;
        for(int i=0; i<3; ++i){
            if(num.charAt(i)=='5'){
                ++count;
            }
        }
        if(count ==3){
            System.out.println(1);
        }
        else 
            System.out.println(0);
    }
}
