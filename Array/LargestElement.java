
import java.util.Arrays;

public class LargestElement {

    public static void main(String[] args) {
        int arr1[] = {2, 5, 1, 3, 0};
        Arrays.sort(arr1);
        System.out.println("Largest element in array is: " + arr1[arr1.length - 1]);
    }
}
