import java.util.Arrays;
public class Inbuilt_Sort {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();   
    }

    public static void main(String[] args) {
        int arr[]={4,3,5,1,2};
        // int arr[]={2,3,1,4,5};
         
        // Arrays.sort(arr,0,3);
        Arrays.sort(arr);
        printArr(arr);

    }
    
    
}


