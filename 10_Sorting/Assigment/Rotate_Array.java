package Assigment;

import java.util.Scanner;

public class Rotate_Array {

    // Method to take input from the user
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = s.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    // Method to print array
    public static void printArray(int arr[]) {
        for (int i=0;i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Swaps elements at given indices
    public static void elementSwap(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    // Reverses the array from start to end
    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            elementSwap(arr, start, end);
            start++;
            end--;
        }
    }

    // Rotates the array to the left by d positions
    public static void rotateArray(int arr[], int d) {
        if (arr.length == 0 || d==0) {
            return;
        }
        d = d % arr.length;

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, arr.length - d - 1);
        reverse(arr, arr.length - d, arr.length - 1);
    }

    public static void main(String[] args) {
        int arr[] = takeInput();

        System.out.println("Original array:");
        printArray(arr);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rotation count: ");
        int d = sc.nextInt();

        rotateArray(arr, d);

        System.out.println("Array after rotation:");
        printArray(arr);
    }
}
