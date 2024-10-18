package OOPS_2.problem29;


import java.util.Scanner;

public class ProblemTS{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        for (int i = 1; i <= 5; i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Enter number " + i + ": ");
                String input = scanner.nextLine();
                try {
                    double number = Double.parseDouble(input);
                    total += number;
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input.");
                }
            }
        }
        System.out.println("The total sum is: " + total);
        scanner.close();
    }
}
