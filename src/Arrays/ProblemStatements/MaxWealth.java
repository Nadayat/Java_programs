package Arrays.ProblemStatements;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts={
                {1,2,3},
                {4,5,6}
        };

        int ans=maximumWealth(accounts);
        System.out.println(ans);
    }

    public static int maximumWealth(int[][] accounts)
    {
        // person = row
        // account = column
        int ans=Integer.MIN_VALUE;



        // with normal for loop
        for (int person=0; person < accounts.length; person++){
            // when we start a new column, take a new sum for that row
            int sum = 0;
            for (int account=0; account<accounts[person].length; account++){
                sum += accounts[person][account];
            }

            // now we have a sum of accounts of a person
            // check with overall answer (ans)

            if (sum > ans){
                ans=sum;
            }
        }



        // with enhanced for each loop
        // We use for each loop when we are not performing any operation with index of an array
//        for (int[] person : accounts) {
//            // when we start a new column, take a new sum for that row
//            int sum = 0;
//            for (int account : person) {
//                sum += account;
//            }
//
//            // now we have a sum of accounts of a person
//            // check with overall answer (ans)
//
//            if (sum > ans) {
//                ans = sum;
//            }
//        }

        return ans;
    }
}
