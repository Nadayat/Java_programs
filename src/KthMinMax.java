import java.util.Arrays;

public class KthMinMax {
    public static void main(String[] args) {
        int[] ar={4,2,5,1,6,8,90};
        int k=2;
        Arrays.sort(ar);
        System.out.println(ar[k-1]);    // kth min
        System.out.println(ar[ar.length-k]);    // kth max
    }
}
