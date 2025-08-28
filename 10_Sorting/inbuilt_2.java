import java.util.Arrays;
import java.util.Collections;

public class inbuilt_2 {
    public static void printArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Integer arr[] = {4, 3, 5, 1, 2};
        Integer arr[]={5,3,4,2,1};

        // Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        printArr(arr);
    }
}
