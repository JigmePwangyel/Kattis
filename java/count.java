package java;
import java.util.*;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count =0;
        String str = sc.nextLine();
        char [] ch = str.toCharArray();

        for(int i=0; i<ch.length; ++i){
            if(ch[i]=='a'|ch[i]=='e'|ch[i]=='i'|ch[i]=='o'|ch[i]=='u'){
                ++count;
            }
            else if(ch[i]=='A'|ch[i]=='E'|ch[i]=='I'|ch[i]=='O'|ch[i]=='U'){
                ++count;
            }
        }
        System.out.println(count);
    }
}
