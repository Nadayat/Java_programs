package Arrays;

public class Arra4d {
    public static void main(String[] args) {
        int[][][][] studentMark=new int[3][2][2][2];
        studentMark[0][0][0][0]=51;
        studentMark[0][0][0][1]=58;

        studentMark[0][0][1][0]=51;
        studentMark[0][0][1][1]=58;

        for(int sno=0;sno< studentMark.length;sno++)
        {
            System.out.println("Student no "+(sno+1));
            for(int exam=0;exam<studentMark[sno].length;exam++)
            {
                System.out.println("Exam no "+(exam+1));
//                System.out.println("Marks are ");
                for(int position=0;position<studentMark[sno][exam].length;position++)
                {
                    System.out.println("position no "+(position+1));
                    System.out.println("Marks are ");
                    for(int marks=0;marks<studentMark[sno][exam][position].length;marks++)
                    {
                        System.out.print(studentMark[sno][exam][position][marks]+"\t");
                    }
                    System.out.println();
//                    System.out.print(studentMark[sno][exam][marks]+"\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
