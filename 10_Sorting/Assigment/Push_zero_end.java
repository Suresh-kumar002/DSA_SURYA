package Assigment;

import java.util.Scanner;

public class Push_zero_end {

    public static int[] takeinput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = s.nextInt();
        System.out.print("Enter the elements : ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void PrintArr(int arr[]) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void ZeroEnd(int arr[]) {
        int nonzero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonzero];
                arr[nonzero] = temp;
                nonzero++;  
            }
        }
    }

    public static void printsortingARR(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = takeinput();
        System.out.print("Original Array : ");
        PrintArr(arr);

        ZeroEnd(arr);
        System.out.print("After pushing zeros to the end : ");
        printsortingARR(arr);
    }

}

// DRY RUN:-

// Size of array: 6  
// Elements:        [1, 0, 2, 0, 3, 4]
// ✅ Step-by-step Execution of pushZeroToEnd()
// Method signature:

// java
// Copy code
// public static void pushZeroToEnd(int[] arr)
// We start with:

// sql
// Copy code
// Initial array: [1, 0, 2, 0, 3, 4]
// nonZero = 0
// Now, we loop through the array with index i from 0 to 5.

// 🔁 i = 0
// arr[0] = 1 → not zero ✅

// Swap arr[0] with arr[nonZero] → swap(0, 0)

// Array becomes: [1, 0, 2, 0, 3, 4] (no change)

// nonZero = 1

// 🔁 i = 1
// arr[1] = 0 → is zero ❌

// Do nothing

// nonZero stays = 1

// 🔁 i = 2
// arr[2] = 2 → not zero ✅

// Swap arr[2] with arr[nonZero] → swap(2, 1)

// Array becomes: [1, 2, 0, 0, 3, 4]

// nonZero = 2

// 🔁 i = 3
// arr[3] = 0 → is zero ❌

// Do nothing

// nonZero = 2

// 🔁 i = 4
// arr[4] = 3 → not zero ✅

// Swap arr[4] with arr[nonZero] → swap(4, 2)

// Array becomes: [1, 2, 3, 0, 0, 4]

// nonZero = 3

// 🔁 i = 5
// arr[5] = 4 → not zero ✅

// Swap arr[5] with arr[nonZero] → swap(5, 3)

// Array becomes: [1, 2, 3, 4, 0, 0]

// nonZero = 4

// 🏁 Final Array after pushing zeroes to the end:
// csharp
// Copy code
// [1, 2, 3, 4, 0, 0]
// ✅ Output Printed:
// java

// Copy code
// Original Array: 1 0 2 0 3 4 
// After pushing zeros to the end: 1 2 3 4 0 0


