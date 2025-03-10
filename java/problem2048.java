package java;
import java.util.Scanner;

public class problem2048 {

    static int arr[] [] = new int[4][4];
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        for(int i=0 ; i<4; ++i){
            for(int j=0; j<4; ++j){
                arr[i][j]=sc.nextInt();
            }
        }

        int move = sc.nextInt();
        operation(move);
        printArray();
    }
    public static void printArray(){
        for(int i=0 ; i<4; ++i){
            for(int j=0; j<4; ++j){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void operation(int move){

        switch(move){
            case  0:
                rightToLeft();
                break;
            case  1:
                downToUp();
                break;
            case  2:
                LeftToRight();
                break;
            case  3:
                UpToDown();
                break;
        }
    }

    public static void swap(int[][] arr, int r1, int c1, int r2, int c2) {
        int temp = arr[r1][c1];
        arr[r1][c1] = arr[r2][c2];
        arr[r2][c2] = temp;
    }

    public static void rightToLeft(){
        for(int i=0; i<4; ++i){
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == 0 && arr[i][j+1] != 0) {
                    swap(arr, i, j, i, j+1);
                    j = 0;
                }
            }

            for(int j=0; j<3; ++j){
                if(arr[i][j]==arr[i][j+1]){
                    arr[i][j]*=2;
                    arr[i][j+1]=0;
                }
            }

            for(int j=0; j<3; ++j){
                if(arr[i][j]==0 && arr[i][j+1] !=0){
                    swap(arr, i, j, i, j+1);
                    j=0;
                }
            }
        }
    }
    public static void downToUp(){
        for(int c=0; c<4; ++c){

            for(int r=0; r<3; ++r){
                if(arr[r][c]==0 && arr[r+1][c]!=0){
                    swap(arr,r,c,r+1,c);
                    r=0;
                }
            }

            for(int r=0; r<3; ++r){
                if(arr[r][c]==arr[r+1][c]){
                    arr[r][c]*=2;
                    arr[r+1][c]=0;
                }
            }
            for(int r=0; r<3; ++r){
                if(arr[r][c]==0 && arr[r+1][c]!=0){
                    swap(arr,r,c,r+1,c);
                    r=0;
                }
            }
        }
    }
    public static void LeftToRight(){
        for(int r=0; r<4; ++r){
            for(int c=3; c>0; --c){
                if(arr[r][c]==0 && arr[r][c-1]!=0){
                    swap(arr, r, c, r, c-1);
                    c=3;
                }
            }
            for(int c = 3; c>0; --c){
                if(arr[r][c]==arr[r][c-1]){
                    arr[r][c]*=2;
                    arr[r][c-1]=0;
                }
            }
            for(int c=3; c>0; --c){
                if(arr[r][c]==0 && arr[r][c-1]!=0){
                    swap(arr, r, c, r, c-1);
                    c=3;
                }
            }
        }
    }
    public static void UpToDown(){
        for(int c=0; c<4; ++c){
            for(int r=3; r>0; --r){
                if(arr[r][c]==0 && arr[r-1][c]!=0){
                    swap(arr,r,c,r-1,c);
                    r=3;
                }
            }

            for(int r=3; r>0; --r){
                if(arr[r][c]==arr[r-1][c]){
                    arr[r][c]*=2;
                    arr[r-1][c]=0;
                }
            }
            for(int r=3; r>0; --r){
                if(arr[r][c]==0 && arr[r-1][c]!=0){
                    swap(arr,r,c,r-1,c);
                    r=3;
                }
            }
        }
    }
}
