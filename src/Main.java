public class Main {

    public static void main(String[] args) {

        int a = 3;
        int b = 3;
        int c = 4;

        String text1 = "HELLO";
        String text2 = "World";
        String text3 = "Hello";

        if (a < b) {
            // Comparing numbers
            output("a is less than b");
        }
        else if (a == b) {
            output("a is equal to b");
        }

        if (text1.equals(text3)) {
            // Comparing strings
            output("text 1 equals text3");
        }
        else if (text1.equalsIgnoreCase("hello")) {
            output("My strings are equal!");
        }

        int myTempResult = sumOfTwo(2,3);
        output("The sum of 2 and 3 is: " + myTempResult);

    }

    public static void output(String message) {
        System.out.println(message);
    }

    public static int sumOfTwo(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

}
