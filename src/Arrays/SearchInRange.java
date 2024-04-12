package Arrays;

public class SearchInRange {
    public static void main(String[] args) {
        int[] ar={12,23,34,45,56,67,78};
        int target =45;
        int ans=sRange(ar,target,1,4);
        System.out.println(ans);
    }

    static int sRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0)
        {
            return -1;
        }


        for (int i=start; i<=end ; i++){
            if (arr[i] == target){
                return arr[i];
            }
        }

        return -1;
    }
}
