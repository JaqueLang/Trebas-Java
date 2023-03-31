/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduar
 */
public class Vehicle {
    
    public static void main(String args []) {
        
        class Vehic {
            double milesDriven;
            double gasUsed;
        
            public Vehic(double milesDriven, double gasUsed) {
                this.milesDriven = milesDriven;
                this.gasUsed = gasUsed;
            }
        
            public double calculateMileage() {
                return milesDriven / gasUsed;
            }
        }
        
        class Car extends Vehic {
            
            public Car(double milesDriven, double gasUsed) {
                super(milesDriven, gasUsed);
            }
            
        }
        
        Car myCar = new Car(600, 50);
        double mileage = myCar.calculateMileage();
        System.out.println("Your car's gas mileage is " + mileage + " miles per gallon.");
    }
}