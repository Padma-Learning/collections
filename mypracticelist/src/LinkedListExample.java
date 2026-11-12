
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
//creating a LinkedList
        LinkedList<String> names = new LinkedList<>();
//Adding elements
        names.add("Alice");
        names.add("Bob");
        names.add("David");

        System.out.println("LinkedList:"+names);
        //Adding element at first position
        names.addFirst("Padma");
        //Adding element at Last  position
        names.addLast("Krishna");
        System.out.println("After adding: "+names);
//Accessing elements
        System.out.println("First element: " +names.getFirst());
        System.out.println("Last element: " +names.getLast());

    }
}
