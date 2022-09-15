package DynamicDataTypes;

import java.util.LinkedList;

/* 
Advantages

    Dynamic in size
    No wastage as capacity and size is always equal
    Easy insertion and deletion as 1 link manipulation is required
    Efficient memory allocation

Disadvantages

    If head Node is lost, the linked list is lost
    No random access is possible

Linked List Applications :-

    Suitable where memory is limited 
    Suitable for applications that require frequent insertion and deletion
*/

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> lst = new LinkedList<>();

        System.out.println("Current List: "+lst+" Item Count: "+lst.size()); // List size is the total values present
        lst.add("A");
        lst.add("B");
        System.out.println("Current List: "+lst+" Item Count: "+lst.size()); // List size is the total values present
        lst.add("C");
        lst.add("D");       // Complexity O(1)
        lst.add("E");       // Complexity O(1)

        System.out.println(lst);

        lst.removeLast();
        lst.remove("B");    // Complexity O(1)
        lst.remove("something that doesn't exist"); // doesn't throw exception rather returns false
        

        System.out.println("Current List: "+lst+" Item Count: "+lst.size()); // List size is the total values present

        System.out.println(lst.contains("B"));
        /*
         * Underneath the hood, list contains() method uses indexOf() method to search for the element. 
         * indexOf() method linearly loops through the List and compares every element with the key until the key is found 
         * and returns true otherwise it returns false when the element is not found. 
         * so, the time complexity of contains() is O(n). 
         * The time complexity of Collections.binarySearch() is O(log2(n)). 
         * But if we want to use this method then the list should be sorted. 
         * If the list is not sorted then we need to sort it before using Collections.binarySearch() which takes O(nlog(n)) time.
         */

        // Searching any element has Complexity of O(n), We would need to start from first node and iterate 
        // untill we find a node value matching with searched value
        for(String s:lst){
            System.out.println("Iterated Value: "+s);
        }
    }
}
