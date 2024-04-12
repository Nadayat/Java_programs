public class UnionIntersection {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,9,10};
        int[] b={3,4,5,6,7,8,9,79};
        int m=a.length;
        int n=b.length;
        System.out.println("Union -  ");
        arrayUnion(a,b,m,n);
        System.out.println();
        System.out.println("Intersection -  ");
        arrayIntersection(a,b,m,n);
    }

    static public void arrayUnion(int[] j,int[] k, int l,int o)
    {
        int i=0;
        int p=0;
        while (i<l & p<o)
        {
            if (j[i] < k[p])
            {
                System.out.print(j[i++]+" ");
            } else if (k[p]< j[i]) {
                System.out.print(k[p++]+" ");
            }else {
                System.out.print(k[p++]+" ");
                i++;
            }
        }
        while(i<l)
        {
            System.out.print(j[i]+" ");
            i++;
        }
        while(p<o)
        {
            System.out.print(k[p]+" ");
            p++;
        }

    }

    static public void arrayIntersection(int[] j,int[] k, int l,int o)
    {
        int i=0;
        int p=0;
        while (i<l & p<o)
        {
            if (j[i] < k[p])
            {
                i++;
            } else if (k[p]< j[i]) {
                p++;
            }else {
                System.out.print(k[p++]+" ");
                i++;
            }
        }
//        while(i<l)
//        {
//            System.out.print(j[i++]+" ");
//        }
//        while(p<o)
//        {
//            System.out.print(k[p++]+" ");
//        }

    }

}
