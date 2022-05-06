package com.bridgelabz.employeeeWage;

public class EmpWage
{   static int empWagePerHour = 20;
    static int fullTimeHours = 0;
    static int partTimeHours = 0;
    static int workingDaysPerMonth = 0;
    static int monthlyWorkHours = 0;
    int totalEmpHrs;

    {
        totalEmpHrs = 0;
    }

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static void computeEmpWage (String companyName, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        //Variables
        int empHrs = 0;

                //Computation
                while ( totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
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
                int totalEmpWage = totalEmpHrs * int wagePerHour;
                System.out.println("Total Emp Wage for the company: " + companyName+" is :" + totalEmpWage);


            }
            public static void main (String[]args)
            {
                computeEmpWage("PayPal", 40, 25, 120);

        }