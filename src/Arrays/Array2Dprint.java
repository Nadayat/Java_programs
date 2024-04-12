package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array2Dprint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[3][4], b={{5,6},{7,8}};
        for (int i=0;i<3;i++)
            for (int j = 0; j < 4; j++) a[i][j] = sc.nextInt();

        for(int[] arr: a){
            System.out.println(Arrays.toString(arr));
        }

        for(int[] brr: b){
            System.out.println(Arrays.toString(brr));
        }

    }
}
