package java;
import java.util.*;

public class fizzbuss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        int limit = sc.nextInt();
    
        for(int i=1; i<=limit; ++i){
            if(i%firstNum == 0 && i%secondNum !=0){
                System.out.println("Fizz");
            }
            else if(i%secondNum == 0 && i%firstNum !=0){
                System.out.println("Buzz");
            }
            else if(i%firstNum==0 && i%secondNum==0){
                System.out.println("FizzBuzz");
            }
            else
                System.out.println(i);
        }
    }
}
