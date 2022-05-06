package com.bridgelabz.employeeeWage;
import java.util.Random;
public class EmpWage {
    public static void main(String[] args) {
        final int empWagePerHour = 20;
        final int fullTimeHours = 8;
        {
            Random r = new Random();
            int attendance = r.nextInt(2);
            System.out.println("\nRandom value is: " + attendance);

            if (attendance == 1) {
                System.out.println("\nEmployee is Present");
                int dailyWage = empWagePerHour * fullTimeHours;
                System.out.println("wage for the day is " + dailyWage);
            } else {
                System.out.println("\nEmployee is Absent");
            }
        }
    }
}
