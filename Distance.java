/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduar
 */
import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {

        class Dist {
            double value;

            public Dist(double value) {
                this.value = value;
            }

            public double getValue() {
                return value;
            }
        }

        class Trajectory {
            Dist homeToGym;
            Dist homeToCollege;
            Dist gymToCollege;

            public Trajectory(Dist homeToGym, Dist homeToCollege) {
                this.homeToGym = homeToGym;
                this.homeToCollege = homeToCollege;
                this.gymToCollege = new Dist(Math.sqrt(Math.pow(homeToCollege.getValue(), 2) + Math.pow(homeToGym.getValue(), 2)));
            }

            public Dist getTotalDistance() {
                return new Dist(homeToGym.getValue() + gymToCollege.getValue());
            }
        }

        class TravelTime {
            Trajectory trajectory;
            double speed;

            public TravelTime(Trajectory trajectory, double speed) {
                this.trajectory = trajectory;
                this.speed = speed;
            }

            public double getTime() {
                return trajectory.getTotalDistance().getValue() / speed;
            }
        }


        Scanner input = new Scanner(System.in);

        System.out.print("Enter your speed in meters per minute: ");
        double speed = input.nextDouble();

        Dist homeToGym = new Dist(72);
        Dist homeToCollege = new Dist(97);
        Trajectory trajectory = new Trajectory(homeToGym, homeToCollege);
        TravelTime travelTime = new TravelTime(trajectory, speed);

        System.out.println("It will take you " + travelTime.getTime() + " minutes to travel from home to college.");
    }
}