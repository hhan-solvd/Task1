/*
 * This class takes two numbers and print the sum of these two numbers. The numbers are passed
 * to the main function as parameters.
 */
class AddTwoNumbers {
    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        int result = number1 + number2;
        System.out.println("Sum of " + number1 + " and " + number2 + " is " + result + ".");
    }
}
