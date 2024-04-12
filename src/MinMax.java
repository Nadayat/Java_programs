public class MinMax {
    public static void main(String[] args) {
        int[] ar={6,33,5,1,7,8};
        findMinMax(ar);
    }

    static public void findMinMax(int[] arr)
    {
        if (arr == null || arr.length == 0) return;

        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if (arr[i]<min)
                min=arr[i];
            if (arr[i]>max)
                max=arr[i];


            // With Math functions

            // min=Math.min(min,arr[i]);
            // max=Math.max(max,arr[i]);
        }

        System.out.println(max +" is maximum");
        System.out.println(min +" is minimum");

    }
}
