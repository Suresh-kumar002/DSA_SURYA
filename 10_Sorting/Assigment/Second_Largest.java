package Assigment;

import java.util.Scanner;

public class Second_Largest {
    public static int[] takeinput(){
        Scanner s=new Scanner(System .in);
        System.out.print("Enter the array range : ");
        int size=s.nextInt();
        System.out.print("Enter the element : ");
        int arr[]=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=s.nextInt();
        }
        return arr;

    }
    public static void PrintArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int secondLargest(int arr[]){
        if (arr.length==0) {
            return Integer.MIN_VALUE;
        }
        int largest=arr[0];
        int secLarg=Integer.MIN_VALUE;
        for(int i=0;     i<arr.length; i++){
            if (largest<arr[i]) {
                secLarg=largest;
                largest=arr[i];
                
            }else if (secLarg<arr[i] && arr[i]!=largest){
                secLarg=arr[i];
            }
        }
        return secLarg;

    }
    
    public static void main(String[] args) {
        int arr[] = takeinput();
        System.out.print("Original Array : ");
        PrintArr(arr);

        System.out.print("Second largest number : "+secondLargest(arr));
        
    }
}
