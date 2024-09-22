package com.generation.salesrep;
import com.generation.employee.Employee;

public class SalesRep extends Employee {
    private double salesMade;
    
    public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked, double salesMade) {
        super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
        this.salesMade = salesMade;
    }// constructor

    public double calculateComission() {
        return Math.round(0.1 * salesMade);
    }// calculateComission

	public double getSalesMade() {
		return salesMade;
	}// getSalesMade

	public void setSalesMade(double salesMade) {
		this.salesMade = salesMade;
	}// setSalesMade

	@Override
	public String toString() {
		return "SalesRep [salesMade=" + salesMade + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getRegistration()=" + getRegistration() + ", getAge()=" + getAge()
				+ ", getDaysWorked()=" + getDaysWorked() + ", getVacationDaysTaken()=" + getVacationDaysTaken()
				+ ", getSalary()=" + getSalary() + ", getYearsWorked()=" + getYearsWorked() + "]";
	}// toString
}// class SalesRep