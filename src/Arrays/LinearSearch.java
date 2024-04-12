package Arrays;

import java.util.concurrent.LinkedBlockingDeque;

public class LinearSearch {
    public static void main(String[] args) {
        int[] ar={12,3,45,56,67,78,89};
        int target=45;
//        int ans = lSearch(ar,target);
//        int ans = lSearch2(ar,target);
        boolean ans = lSearch3(ar,target);
        System.out.println(ans);
    }

    //method 1
    // Returning an index of the target value
    static int lSearch(int[] arr, int target) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        System.out.println();
        System.out.println("Target value is not present in the given array");
        return -1;
    }


    //method 2
    // Returning an target value if present
    static int lSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return -1;
        }

        // for each loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        System.out.println();
        System.out.println("Target value is not present in the given array");
        return -1;
    }


    //method 3
    // Returning true / false
    static boolean lSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return false;
        }

        // for each loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        System.out.println();
        System.out.println("Target value is not present in the given array");
        return false;
    }


}
