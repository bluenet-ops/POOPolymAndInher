package com.generation.salesmanager;
import java.util.HashMap;

import com.generation.salesrep.SalesRep;

public class SalesManager extends SalesRep {
    private HashMap<Integer, SalesRep> salesTeam;

    public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked, double salesMade) {
        super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade);
        this.salesTeam = new HashMap<>();
    }// constructor

    public double calculateComission() {
        double totalSales = 0;
        for (SalesRep rep : salesTeam.values()) {
            totalSales += rep.calculateComission();
        }
        return Math.round(0.03 * totalSales);
    }// calculateComission

    public void addSalesRep(int id, SalesRep rep) {
        salesTeam.put(id, rep);
    }// addSalesRep

	public HashMap<Integer, SalesRep> getSalesTeam() {
		return salesTeam;
	}// getSalesTeam

	public void setSalesTeam(HashMap<Integer, SalesRep> salesTeam) {
		this.salesTeam = salesTeam;
	}// setSalesTeam

	@Override
	public String toString() {
		return "SalesManager [getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getRegistration()=" + getRegistration() + ", getAge()=" + getAge() + ", getDaysWorked()="
				+ getDaysWorked() + ", getVacationDaysTaken()=" + getVacationDaysTaken() + ", getSalary()="
				+ getSalary() + ", getYearsWorked()=" + getYearsWorked() + "]";
	}// toString
}// class SalesManager
