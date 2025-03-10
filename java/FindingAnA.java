package java;
import java.util.*;

public class FindingAnA {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        char [] ch = name.toCharArray();
        int index =0;
        for(int i=0; i<ch.length; ++i){
            if(ch[i]=='a'){
                index = i;
                break;
            }
        }
        for (; index<ch.length; index++) {  
            System.out.print(ch[index]);  
        }
    }
}
