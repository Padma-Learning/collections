public class BinarySearchExample {

    public static int binarySearch(int[] numbers, int target){
        int low=0;
        int high=numbers.length-1;
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if (numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    return -1;

    }

    static void main() {
        int[] numbers={11,15,24,47,89,62,91};
        int target=61;
        int result=binarySearch(numbers,target);
        if(result!=-1){
            System.out.println("Elements found at index:"+result);
        }else {
            System.out.println("Element not found");
        }
    }
}
