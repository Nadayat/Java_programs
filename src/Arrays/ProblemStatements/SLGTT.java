package Arrays.ProblemStatements;

// Find Smallest letter greater than target
// Given a character array "letters" that is sorted in non-decreasing order and a character "target", returns the smallest
// character in the array that is larger than the target
// Note that the letter wrap around     if target is =  z then answer will be 'a'

public class SLGTT {
    public static void main(String[] args) {
        char[] letter= {'c','f','j'};
        System.out.println(nextGreaterLetter(letter,'c'));
    }

    static char nextGreaterLetter(char[] letters, char target){

        int start = 0;
        int end = letters.length - 1;

        while (start <= end)
        {
            // int mid= (start + end)/2;   // might be possible that (start + end) exceeds the range of integer in java
            int mid = start + (end-start)/2;

                if (target < letters[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
        }
        return letters[start % letters.length];
    }
}
