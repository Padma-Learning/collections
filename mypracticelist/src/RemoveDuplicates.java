import java.util.LinkedHashSet;
import java.util.LinkedList;

public class RemoveDuplicates {

    static void main() {

        //creating linked list
        LinkedList<Integer> originalList=new LinkedList<>();
        originalList.add(10);
        originalList.add(40);
        originalList.add(10);
        originalList.add(60);
        originalList.add(80);
        originalList.add(60);
        originalList.add(20);
        System.out.println("Original List : "+originalList);
        //Approach 1
        LinkedList<Integer> uniqueNumbers=new LinkedList<>();
        for(Integer number:originalList){
            if(!uniqueNumbers.contains(number)){
                uniqueNumbers.add(number);
            }
        }
        System.out.println(uniqueNumbers);

        /*//Remove duplicates
        LinkedHashSet<Integer> uniqueList=new LinkedHashSet<>(originalList);
        System.out.println("After removing duplicates: "+uniqueList);
        //Convert back to Linke List
        LinkedList<Integer> result=new LinkedList<>(uniqueList);
        System.out.println("After Removed duplicates :  "+result);
*/
    }
}
