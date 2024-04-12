package Arrays.BinarySearchProblems;


// Only applicable for shorted arrays either increasing / decreasing order
// if we don't have sorted array then we have to sort it which is called "order agnostic binary search"
public class BinarySearch {
    public static void main(String[] args) {
        int[] ar={-12, -9, -6, 1,4,6,8,9,12,23,35,36,45,47};
        System.out.println(binarySearch(ar,12));
    }

    // return the index
    // return -1 if target value does not exist
    static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

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

        return -1;
    }
}
