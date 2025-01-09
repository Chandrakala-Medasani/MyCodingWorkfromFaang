package HackerRank;
import java.util.Scanner;

public class PascalsTriangle {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        for(int i=1; i<=n; i++){

            for(int j=1; j<=n-i; j++)
                System.out.print(" ");

            int val=1;

            for(int j=1; j<=i; j++){
                System.out.print(val+" ");
                val = val*(i-j)/j;
            }

            System.out.println();
        }
    }
}

