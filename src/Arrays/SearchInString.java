package Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name="Nagendra";
        char target= 'y';
//        System.out.println(search(name,target));
        System.out.println(search2(name,target));
    }


    static boolean search(String str, char target) {

        if (str.length() == 0){
            return false;
        }

        for (int i=0; i < str.length(); i++ ){
            if (target == str.charAt(i)){
                return true;
            }
        }

        System.out.println();
        System.out.println("Character not present");
        return false;
    }



    static boolean search2(String str1, char target)
    {
        if (str1.length() == 0){
            return false;
        }

        for (char ch : str1.toCharArray())
        {
            if (ch == target)
            {
                return true;
            }
        }

        System.out.println();
        System.out.println("Character is not present in given string");
        return false;

    }
}
