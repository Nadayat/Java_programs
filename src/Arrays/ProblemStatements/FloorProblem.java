package Arrays.ProblemStatements;

public class FloorProblem {
    public static void main(String[] args) {
        int[] ar={2,3,5,9,14,16,18};
        int target=-2;
        System.out.println(floor(ar,target));     // find the ceiling of the target value
        // ceiling = smallest element in the array which is greater than or equal to the target value/element
    }

    static int floor(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        // condition for if the given target value is smaller than the smallest element in the array
        // if it happens then we cant find the floor of that particular value
        if (target < arr[start]){
            System.out.println();
            System.out.println("Sorry..!!  Given array does not contain floor of the target value ");
            System.out.println("because minimum value of array is "+arr[start]+" and the target value is "+target);
            return -1;
        }


        // find whether the given array is in ascending or descending order
        boolean isascending = arr[start] <= arr[end];

        while (start <= end)
        {
            // int mid= (start + end)/2;   // might be possible that (start + end) exeeds the range of integer in java
            int mid = start + (end-start)/2;
            if (arr[mid] == target){
                return arr[mid];
            }

            if (isascending){
                if (target < arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            } else {
                if (target > arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return arr[end];

    }
}
