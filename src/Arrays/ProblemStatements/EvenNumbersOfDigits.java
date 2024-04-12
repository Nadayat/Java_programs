package Arrays.ProblemStatements;

// Question :- Given an array "nums" of integer, returns how many of them contains an even number of digits ?
public class EvenNumbersOfDigits {
    public static void main(String[] args) {
        int[] ar={1,23,456,6745,54,78,768,9744,9856,789};
        System.out.println(findNumbers(ar));
        System.out.println(digits(0));
        System.out.println(digits2(-349478670));

    }

    static int findNumbers(int[] nums){
        int count=0;
        for (int num : nums)
        {
            if (even(num)){
                count++;
            }
        }
        return count;
    }


    // function to check if numbers contains even digits or not
    static boolean even(int num) {
        int numOfDigits=digits(num);

//        if (numOfDigits % 2 ==0 ){
//            return true;
//        }
//        return false;
//

        return numOfDigits % 2 ==0;         // if condition is right then returns true otherwise it will return false
    }

    // count number of digits in a number
    static int digits(int num){


        // if number is negative then first converting it into positive
        if (num < 0){
            num *= -1;
        }

        if (num == 0)
        {
            return 1;
        }


        // counting digits by dividing number by 10
        int count=0;
        while (num > 0){
            count++;
            num /= 10;
        }
        return count;
    }

    // second way to find digits
    static int digits2(int num)
    {
        if (num < 0){
            num *= -1;
        }

        if (num == 0)
        {
            return 1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}
