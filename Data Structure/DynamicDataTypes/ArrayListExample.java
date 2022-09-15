package DynamicDataTypes;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        /*
         * Array List have dynamic size i.e. we don't have to specify the size while initializing
         * Array List increase the capacity automatically when the exiting capacity is reached.
         * Whenever the capacity is reached then behind the scene a new array list will be created with more capacity
         * and the existing elements will be copied to the new arraylist.
         * Array list is used when we need to do more of accessing the element operation than the modification.
         */

        ArrayList<String> arrList = new ArrayList<>();

        arrList.add("A");
        arrList.add("B");
        arrList.add("C");
        System.out.println(arrList);
        /* ArrayList doesn't have any function to get the current capacity But we can get number of elements using size()*/
        System.out.println("Arraylist size : "+arrList.size());

        System.out.println("Value at index 1 : "+arrList.get(1)); // this is faster and have O(1) complexity

        arrList.remove("B"); // this would remove the element and all the element will be shifted to the right.
        System.out.println("Arraylist after removing B : "+arrList);

        arrList.add(1, "B"); // adding new element at any index
        System.out.println("Arraylist after adding B on index 1 again: "+arrList);

    }
}
