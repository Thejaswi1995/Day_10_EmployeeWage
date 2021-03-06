package com.bridgelabz.employeeeWage;
import java.util.ArrayList;
public class Ewbi extends EmpWageBuilder {
    static ArrayList<EmpWage> array = new ArrayList();

    public int getTotalWage(String companyName) {
        int totalWage = 0;
        for (EmpWage employeeObject : Ewbi.array) {
            if (companyName.equals(employeeObject.companyName)) {
                totalWage = employeeObject.totalEmpWage;
            }
        }
        return totalWage;
    }

    @Override
    public void createWageBuilder() {
        EmpWage paypal = new EmpWage("PayPal",40,25,120,0,8,4);
        paypal.computeEmpWage();
        EmpWage tesla = new EmpWage("Tesla",35,25,95,0,8,4);
        tesla.computeEmpWage();
        EmpWage airtel = new EmpWage("Airtel",30,25,105,0,8,4);
        airtel.computeEmpWage();
        array.add(paypal);
        array.add(tesla);
        array.add(airtel);
    }
}