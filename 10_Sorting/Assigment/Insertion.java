package Assigment;

public class Insertion {
    public static void insertionSort(int arr []){
        for(int i=1; i<arr.length; i++){
            int curr=arr[i];
            int prev=i-1;
            while (prev>=0 && arr[prev]>curr) {
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
        
    }
    public static void printA(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,6,2,4,1,4,2,5};
        insertionSort(arr);
        printA(arr);
        
    }
}
