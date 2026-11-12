import java.util.LinkedList;

public class LinkedListIntExample {

    static void main() {
        //creating a LinkedList
        LinkedList<Integer> numbers=new LinkedList<>();
        numbers.add(30);
        numbers.add(70);
        numbers.add(90);
        numbers.add(20);
        numbers.add(60);
        numbers.add(40);
        System.out.println(numbers);

        //Remove number 30
        numbers.remove(Integer.valueOf(30));
        //print using for loop
        for(Integer num:numbers){
            System.out.println(num);
        }
    }
}
