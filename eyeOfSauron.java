import java.util.*;

public class eyeOfSauron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int count=0;

        for(int i=0; i<=(str.length()/2);i++){
            if(str.charAt(i)== str.charAt(str.length()-(i+1))){
                count++;
            }
        }
   
        if((count+1)==(str.length()/2)){
            System.out.println("correct");
        }
        else{
            System.out.println("fix");
        }
    }
}
