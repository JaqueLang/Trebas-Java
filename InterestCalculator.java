/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduar
 */
import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (as a percentage): ");
        double interestRate = scanner.nextDouble() / 100;

        System.out.print("Enter the time period (in years): ");
        int timePeriod = scanner.nextInt();

        System.out.println("Select the type of interest:");
        System.out.println("1. Simple interest");
        System.out.println("2. Compound interest");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                double simpleInterest = principal * interestRate * timePeriod;
                System.out.printf("Simple interest = %.2f\n", simpleInterest);
                break;
            case 2:
                double compoundInterest = principal * Math.pow(1 + interestRate, timePeriod) - principal;
                System.out.printf("Compound interest = %.2f\n", compoundInterest);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}





