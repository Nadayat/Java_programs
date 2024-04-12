package Arrays.BinarySearchProblems;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,6,7,8,9,10,11};
        int[] br={90,89,78,67,56,45,34,23,12,1};
        System.out.println(orderAgnosticBS(ar,10)); // printing the index of the target value in the array "ar"
        System.out.println(orderAgnosticBS(br,12)); // printing the index of the target value in the array "br"

    }

    static int orderAgnosticBS(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;


        // find whether the given array is in ascending or descending order
        if (arr[start] <= arr[end])
        {
            while (start <= end)
            {
                // int mid= (start + end)/2;   // might be possible that (start + end) exeeds the range of integer in java
                int mid = start + (end-start)/2;

                if (target < arr[mid]){
                    end=mid-1;
                }else if (target > arr[mid]){
                    start=mid+1;
                }else {
                    return mid;
                }
            }
        }else {
            while (start <= end)
            {
                // int mid= (start + end)/2;   // might be possible that (start + end) exeeds the range of integer in java
                int mid = start + (end-start)/2;

                if (target < arr[mid]){
                    start=mid+1;
                }else if (target > arr[mid]){
                    end=mid-1;
                }else {
                    return mid;
                }
            }

        }

        return -1;

    }
}
