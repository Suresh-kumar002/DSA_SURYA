package Assigment;

public class ROTATE_01 {
    public static void Rotate(int arr[],int d){
        int n=arr.length;
        if (n==0 || d==0) {
            return;
            
        }
        //Handle if d is greater than the array size
        d=d%n;
        //loop for 'd' roatet 
        for(int i=0; i<d; i++){
            int temp=arr[0]; //store the first element
            //shift all element one pos to the left
            for(int j=0; j<n-1; j++){
                arr[j]=arr[j+1];
            }
            //place the first element end
            arr[n-1]=temp;
        }
        
    }
    public static void PrintArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
            
    }
    public static void main(String args []){
        int arr[]={1,2,3,4,5};
        int d=2;

        Rotate(arr, d);
        System.out.print("Sorting Roatation : ");
        PrintArr(arr);
    }

}
