import java.util.Arrays;

public class RotationByOne {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5};
        int x=ar[ar.length-1];
        for(int i=ar.length-1;i>0;i--)
        {
            ar[i]=ar[i-1];
        }
        ar[0]=x;
        System.out.println(Arrays.toString(ar));
    }
}
