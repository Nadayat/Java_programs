package Arrays;

import java.util.Arrays;

public class MutableArray {
    public static void main(String[] args) {
        int[] num={3,5,1,7};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }

    private static void change(int[] arr) {
        arr[0]=93;
    }
}
