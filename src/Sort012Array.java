public class Sort012Array {
    public static void main(String[] args) {
        int[] ar={2,1,2,1,0,1,2,1,0,0,2,1};
        int c1=0,c2=0,c3=0;
        for(int i=0;i<ar.length;i++)
        {
           if(ar[i]==0) c1++;
           else if (ar[i]==1) c2++;
           else c3++;
        }
        int k=0;
        for(int i=0;i<c1;i++) ar[k++]=0;
        for(int i=0;i<c2;i++) ar[k++]=1;
        for(int i=0;i<c3;i++) ar[k++]=2;

        for(int i=0;i<ar.length;i++)
            System.out.print(ar[i]+" ");
    }
}
