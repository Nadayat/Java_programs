public class RotationByKTimes {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int n=a.length;

        int k=4;
        RightRotation(a,n,k);
    }
    static public void RightRotation(int[] a,int length,int times)
    {
        times=times%length;
        for(int i=0;i<length;i++)
        {
            if (i<times)
            {
                System.out.print(a[length+i-times]+" ");
            }
            else
            {
                System.out.print(a[i-times]+" ");
            }
        }
        System.out.println();
    }
}
