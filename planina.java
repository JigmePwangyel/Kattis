import java.util.Scanner;

public class planina {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int iteration = sc.nextInt();
        int sol = (int)Math.pow(2,iteration);
        System.out.println((++sol)*(sol));
    }
}
