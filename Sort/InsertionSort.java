/*
 * This class takes user's input from keyboard, creates an array for the input, sorts the array
 * in ascending order by implementing insertion sort algorithm, and prints the sorted array.
 */

import java.util.Scanner;

class Sort {
    /* Implement insertion sort algorithm to sort an array in ascending order. */
    static void insertionSort(int[] arr) {
        int len = arr.length;
        if (len <= 1) {
            return;
        }

        for (int currentIndex = 1; currentIndex < len; currentIndex++) {
            int currentValue = arr[currentIndex];
            int leftIndex = currentIndex - 1;
            while (leftIndex >= 0 && arr[leftIndex] > currentValue) {
                arr[leftIndex + 1] = arr[leftIndex];
                leftIndex = leftIndex - 1;
            }
            arr[leftIndex + 1] = currentValue;
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
        insertionSort(arr); // Sort the array
        printArray(arr); // Print the sorted array
    }
}
