package Q1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int number1 = in.nextInt();

        System.out.print("Enter your second number: ");
        int number2 = in.nextInt();

        System.out.print("Choose your operation: ");

        String operation = in.next();
        if (operation.equals("+")) {
            System.out.println("Expected Output: " + (number1 + number2));
        } else if (operation.equals("-")) {
            System.out.println("Expected Output: " + (number1 - number2));
        }else if (operation.equals("/")) {
            System.out.println("Expected Output: " + (number1 / number2));
        } else if (operation.equals("*")) {
            System.out.println("Expected Output: " + (number1 * number2));
        }else if (operation.equals("%")) {
            System.out.println("Expected Output: " + (number1 % number2));
        }
    }
}
