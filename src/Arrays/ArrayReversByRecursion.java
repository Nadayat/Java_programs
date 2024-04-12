package Arrays;

import java.util.Arrays;

public class ArrayReversByRecursion {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5};
        int n=ar.length;
        recursionArray(ar,0,n-1);
        System.out.println(Arrays.toString(ar));
    }

    static public void recursionArray(int[] arr, int start, int end)
    {
        if(start>end) return;

        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        recursionArray(arr,start+1,end-1);
    }
}
