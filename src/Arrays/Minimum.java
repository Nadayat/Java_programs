package Arrays;

public class Minimum {
    public static void main(String[] args) {
        int[] ar = {12,56,2,465,23,56,1};
        int ans = mini(ar);
        System.out.println(ans);

    }

    static int mini(int[] ar) {

        int min=ar[0];

        if (ar.length == 0){
            return -1;
        }

        for (int i=1; i<ar.length; i++){
            if (ar[i]<min) {
                min = ar[i];
            }
        }

        return min;
    }
}
