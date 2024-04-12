package Arrays;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int target = 10;
     //   System.out.println(search(arr,target));
        int[] ans= search(arr,target);
        System.out.println();
        System.out.println(Arrays.toString(search(arr,target)));
        System.out.println();
        System.out.println(search2(arr,target));
        System.out.println();
        System.out.println(max(arr));

    }


    static int[] search(int[][] arr, int target) {
        for (int row=0; row<arr.length ; row++){
            for (int col=0; col<arr[row].length; col++)
            {
                if (arr[row][col] == target)
                {
                    return  new int[]{row,col};
                }
            }
        }

        return new int[]{-1,-1};
    }



    static boolean search2(int[][] arr, int target) {
        for (int row=0; row<arr.length ; row++){
            for (int col=0; col<arr[row].length; col++)
            {
                if (arr[row][col] == target)
                {
                    return  true;
                }
            }
        }

        return false;
    }


    // finding maximum value with
    // for each loop or enhanced for loop
    static int max(int[][] arr) {
        int max=Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }

        return max;
    }


}
