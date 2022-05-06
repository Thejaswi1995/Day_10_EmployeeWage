package com.bridgelabz.employeeeWage;

import java.util.ArrayList;
import java.util.Random;

public class EmpWage
{
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    int wagePerHour;
    int fullDayHour;
    int partTimeHour;
    int workingDaysPerMonth;
    int workingHoursPerMonth;
    int totalWorkingHours;
    int totalEmpWage;
    String companyName;
    ArrayList<Integer> dailyWage = new ArrayList<>();

    public EmpWage (String companyName, int wagePerHour, int workingDaysPerMonth, int workingHoursPerMonth, int totalWorkingHours, int fullDayHour, int partTimeHour)
    {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.workingDaysPerMonth = workingDaysPerMonth;
        this.workingHoursPerMonth = workingHoursPerMonth;
        this.totalWorkingHours = totalWorkingHours;
        this.fullDayHour = fullDayHour;
        this.partTimeHour = partTimeHour;
    }

    public void computeEmpWage()
    {
        int empWage = 0;

        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= workingHoursPerMonth && totalWorkingDays < workingDaysPerMonth)
        {
            totalWorkingDays++;
            Random num = new Random();
            int empCheck = num.nextInt(2)+1;

            if( empCheck == IS_PART_TIME)
                if (totalWorkingHours + partTimeHour <= workingHoursPerMonth)
                {
                    empWage = wagePerHour * partTimeHour;
                    totalWorkingHours = totalWorkingHours + partTimeHour;
                }
            if ( empCheck == IS_FULL_TIME)
                if (totalWorkingHours + fullDayHour <= workingHoursPerMonth)
                {
                    empWage = wagePerHour * fullDayHour;
                    totalWorkingHours = totalWorkingHours + fullDayHour;
                }
            dailyWage.add(empWage);
            totalEmpWage = totalEmpWage + empWage;
            totalWorkingDays++;
            System.out.println("Total Wage for Day" + (totalWorkingDays) + " is : " + totalEmpWage);
        }
        System.out.println("Total Working Days :" + totalWorkingDays);
        System.out.println("Total Working Hours :" + totalWorkingHours);
        System.out.println("Employee Wage :" + totalEmpWage);
    }
    @Override
    public String toString() {
        return "EmployeeWage{" +
                "company: " + companyName +
                ", wagePerHour=" + wagePerHour +
                ", fullDayHour=" + fullDayHour +
                ", partTimeHour=" + partTimeHour +
                ", workingDaysPerMonth=" + workingDaysPerMonth +
                ", workingHoursPerMonth=" + workingHoursPerMonth +
                ", dailyWageArray=" + dailyWage +
                ", totalEmpWage=" + totalEmpWage +
                '}';
    }

    public static void main(String[] args)
    {
        EmpWageBuilder.createEmployeeWage();
        for (Object employeeObject : EmpWageBuilder.array)
        {
            System.out.println(employeeObject);
        }
    }
}