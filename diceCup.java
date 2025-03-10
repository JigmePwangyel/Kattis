import java.util.Scanner;

class diceCup{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();

        if(d1>d2){
            int temp = d1;
            d1=d2;
            d2=temp;
        }

        if(d1==d2){
            System.out.println(d1+1);
        }
        else{
            for(int i =d1+1; i<=d2+1; ++i){
                System.out.println(i);
            }
        }
    }
}