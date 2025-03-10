package java;
import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 ="";
        for(int i=0; i<str.length(); ++i){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                str2 = str2+str.charAt(i);
            }
        }
        System.out.println(str2);
        
    }
}
