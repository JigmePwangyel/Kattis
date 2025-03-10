import java.util.Scanner;

public class greetings {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        String index = word.substring(1, word.length()-1);

        String total ="";

        for(int i=0; i<index.length()*2; ++i){
            total = total+'e';
        }
        System.out.println("h"+total+"y");
    }   
}
