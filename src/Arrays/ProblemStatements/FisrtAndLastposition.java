package Arrays.ProblemStatements;

import java.util.Arrays;


//Q. Find the first and last index of a given number in a sorted array
// we are doing this with the help of binary search  -  time complexity  -  O(log N)
public class FisrtAndLastposition {
    public static void main(String[] args) {
        int[] ar={3,4,7,7,7,7,8,8,8,9};
        int target=9;
        System.out.println(Arrays.toString(findPosition(ar, target)));
    }

    static int[] findPosition(int[] arr, int target){

        int[] ans={-1, -1};
        int start = search(arr,target,true);
        int end = search(arr,target,false);

        ans[0]=start;
        ans[1]=end;

        return ans;
    }


    // this function will return the index value of target
    static int search(int[] ar, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = ar.length - 1;

        while (start <= end)
        {
            // int mid= (start + end)/2;   // might be possible that (start + end) exceeds the range of integer in java
            int mid = start + (end-start)/2;

            if (target < ar[mid]){
                end=mid-1;
            }else if (target > ar[mid]){
                start=mid+1;
            }else {
                // potential answer is found
                ans=mid;
                if (findStartIndex){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }

        return ans;
    }
}
