/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduar
 */
import java.util.Scanner;

public class Maturity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coupon/interest payment: ");
        double c = scanner.nextDouble();
        System.out.print("Enter the face value: ");
        double f = scanner.nextDouble();
        System.out.print("Enter the price: ");
        double p = scanner.nextDouble();
        System.out.print("Enter the years to maturity: ");
        double n = scanner.nextDouble();

        double ytm = (c + ((f - p) / n)) / ((f + p) / 2);
        System.out.printf("The approximate Yield to Maturity is: %.2f%%\n", ytm * 100);
    }
}
