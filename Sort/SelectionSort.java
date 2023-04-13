/*
 * This class takes user's input from keyboard, creates an array for the input, sorts the array
 * in ascending order by implementing selection sort algorithm, and prints the sorted array.
 */

import java.util.Scanner;

class Sort {
    /* Implement selection sort algorithm to sort an array in ascending order. */
    static void selectionSort(int[] arr) {
        int len = arr.length;
        if (len <= 1) {
            return;
        }

        for (int comparedIndex = 0; comparedIndex < len - 1; comparedIndex++) {
            int lowestIndex = comparedIndex;
            // Iterate through unsorted array and find the lowest number
            for (int j = comparedIndex + 1; j < len; j++) {
                if (arr[j] < arr[lowestIndex]) {
                    lowestIndex = j;
                }
            }
            // Swap the lowest number with the compared number
            int lowestNumber = arr[lowestIndex];
            arr[lowestIndex] = arr[comparedIndex];
            arr[comparedIndex] = lowestNumber;
        }
    }

    /* Print the elements in an array. */
    static void printArray(int[] arr) {
        for (int number : arr) {
            System.out.print(number + " ");
        }
    }

    /* Take user input and create an array for the input. */
    static int[] createArr() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers in the array: ");
        int num = input.nextInt();
        int[] arr = new int[num];
        System.out.println("Please enter " + num + " random numbers: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = createArr(); // Take user input and create an array
        selectionSort(arr); // Sort the array
        printArray(arr); // Print the sorted array
    }
}