/*
 * This class greets the user with the name. The user passes their name
 * to the main function as a parameter.
 */
class GreetUser {
    public static void main(String[] args) {
        String name = args[0];
        System.out.println("Hello " + name + "!");
    }
}