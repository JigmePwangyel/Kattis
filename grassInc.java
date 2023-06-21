import java.util.Scanner;

class grassInc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float cost = sc.nextFloat();
        int noOfLawns = sc.nextInt();
        float totalArea = 0;
        for(int i=1; i<=noOfLawns; ++i){
            float w= sc.nextFloat();
            float h = sc.nextFloat();

            float area = w*h;
            totalArea = totalArea + area;
        }
        float totalCost = cost * totalArea;
        System.out.printf("%.7f", totalCost);
    }
}