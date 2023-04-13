/*
 * This class takes user's input from keyboard, creates an array for the input, sorts the array
 * in ascending order by implementing bubble sort algorithm, and prints the sorted array.
 */

import java.util.Scanner;

class BubbleSort {
    /* Implement bubble sort algorithm to sort an array in ascending order. */
    static void bubbleSort(int[] arr) {
        int len = arr.length;
        if (len <= 1) {
            return;
        }

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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
        bubbleSort(arr); // Sort the array
        printArray(arr); // Print the sorted array
    }
}