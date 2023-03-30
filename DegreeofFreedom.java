/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduar
 */
import java.util.Scanner;
public class DegreeofFreedom {
    public void calculateLittering(float males, float females, float litters, float deposits) {
        float total = males + females;
        float litteringMales, litteringFemales;
        litteringMales = (males/total) * ((litters/total)*100);
        litteringFemales = (females/total) * ((litters/total)*100);
        System.out.println("The total number of littering males is: " + litteringMales);
        System.out.println("The total number of littering females is: " + litteringFemales);
    }
    public static void main(String[] args) {
        float totalMale, totalFemale, totalDeposit, totalLitter;

        Scanner scan = new Scanner(System.in);
        DegreeofFreedom dof = new DegreeofFreedom();
        System.out.println("Enter the total of males: ");
        totalMale = scan.nextInt();
        System.out.println("Enter the total of females: ");
        totalFemale = scan.nextInt();
        System.out.println("Enter the total who deposits: ");
        totalDeposit = scan.nextInt();
        System.out.println("Enter the total who litters: ");
        totalLitter = scan.nextInt();

        dof.calculateLittering(totalMale, totalFemale, totalLitter, totalDeposit);
    }
}