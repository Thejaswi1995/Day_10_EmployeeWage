package com.bridgelabz.employeeeWage;

public class EmpWage
{
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static void computeEmpWage (String companyName,int empRatePerHour, int numOfWorkingDays,
            int maxHoursPerMonth)
            {
                //Variables
                int empHrs = 0;
                int totalEmpHrs = 0;
                int totalWorkingDays = 0;

                //Computation
                while (totalEmpHrs <= maxHoursPerMonth &&
                        totalWorkingDays < numOfWorkingDays) {
                    totalWorkingDays++;
                    int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                    empHrs = switch (empCheck) {
                        case IS_PART_TIME -> 4;
                        case IS_FULL_TIME -> 8;
                        default -> 0;
                    };
                    totalEmpHrs += empHrs;
                    System.out.println("On Day " + totalWorkingDays + " Emp Hours is :" + empHrs);
                }
                int totalEmpWage = totalEmpHrs * empRatePerHour;
                System.out.println("Total Emp Wage for the company: " + companyName + " is :" + totalEmpWage);


            }
            public static void main (String[]args)
            {
                computeEmpWage("PayPal", 40, 25, 120);
                computeEmpWage("Tesla", 35, 25, 95);
                computeEmpWage("Airtel", 35, 25, 100);
            }
        }