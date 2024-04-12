package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] ar=new int[5];

        for(int i=0;i<ar.length;i++)
        {
            ar[i]=in.nextInt();
        }
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+ " ");
        }
        System.out.println();
        for(int num : ar) // for every element in the array
        {
            System.out.print(num + " ");    // print elements (num representing element of the array)
        }
        System.out.println();
        System.out.println(Arrays.toString(ar));
        System.out.println();

        int[][] arr=new int[][]{{1,2,3,7},{4,5,6,12},{7,8,9,13},{23,45,67,90}};
        System.out.println(arr.length);
        for(int i=0;i< arr.length;i++)
        {   for(int j=0;j<arr.length;j++) {
            System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }


        int[] ab=new int[]{1,2,3,4,5};
        for (int value : ab)
            System.out.print(value + " ");
    }
}
