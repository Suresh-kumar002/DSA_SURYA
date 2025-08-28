package Assigment;

import java.util.Scanner;

public class AryRotetCheck {
    public static int[] takeinput(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int size=s.nextInt();
        System.out.print("Enter the elements : ");
        int arr[]=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static void printArray(int arr[]){
        int size=arr.length;
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int ArrayRotateCheck(int arr []){
        for(int i=0; i<arr.length-1; i++){
            if (arr[i]>arr[i+1]) {
                arr[i]=arr[i+1];
                return (i+1);
                
            }
            
        }
        return 0;
    }
    public static void printRotate(int arr[]){
        int size=arr.length;
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=takeinput();

        printArray(arr);
        ArrayRotateCheck(arr);
        printRotate(arr);
    }

}

//DRY RUN:-->>
// # Now loop over array:

// i=0 → 1 < 2 → continue
// i=1 → 2 < 5 → continue
// i=2 → 5 < 7 → continue
// i=3 → 7 > 3 → condition met ✅

// # Action taken:-

// arr[3] = arr[4]; → arr[3] = 3
// So now array becomes: [1, 2, 5, 3, 3]
// return 4;