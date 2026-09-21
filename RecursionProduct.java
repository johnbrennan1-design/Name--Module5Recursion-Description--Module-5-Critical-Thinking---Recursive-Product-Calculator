package module5recursion;

import java.util.Scanner;

public class RecursionProduct {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[5];

        System.out.println("Recursive Product Calculator");
        System.out.println("----------------------------");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        double product = calculateProduct(numbers, 0);

        System.out.println();
        System.out.println("The product of the five numbers is: " + product);

        scanner.close();
    }

    public static double calculateProduct(double[] numbers, int index) {

        // Base case
        if (index == numbers.length) {
            return 1;
        }

        // Recursive case
        return numbers[index] * calculateProduct(numbers, index + 1);
    }
}