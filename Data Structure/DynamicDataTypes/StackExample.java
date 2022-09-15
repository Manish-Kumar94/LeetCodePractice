package DynamicDataTypes;
import java.util.Scanner;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        
        // Stack is LIFO - Last In First Out 
        // Use this data structure whenever we want to restrict the accessing of elements in LIFO order

        Stack<Integer> st = new Stack<>();

        System.out.print("\nHow many number do you want to add in stack: ");

        try(Scanner sc = new Scanner(System.in)){

            Integer totalNumbers = sc.nextInt();

            System.out.println(String.format("Enter %d numbers to add in stack :-",totalNumbers));
            for (int i = 0; i < totalNumbers; i++) {
                st.add(sc.nextInt());
            }
        }

        System.out.println("\nPrinting values in stack\n");

        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
        
    }
}
