package Arrays.Arraylist;

import java.util.ArrayList;

public class AlExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);      // Good practice of coding1222222222222222
        //ArrayList<> list = new ArrayList<>();     // Its also right but not good practice
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.indexOf(5));

        System.out.print(list);
    }
}
