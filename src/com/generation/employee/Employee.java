package com.generation.employee;

public class Employee {
    private String firstName;
    private String lastName;
    private int registration;
    private int age;
    private int daysWorked;
    private int vacationDaysTaken;
    private double salary;
    private int yearsWorked;

    public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.age = age;
        this.daysWorked = daysWorked;
        this.vacationDaysTaken = vacationDaysTaken;
        this.salary = salary;
        this.yearsWorked = yearsWorked;
    }// constructor

    public int timeToRetirement() {
        return Math.min(60 - age, 40 - yearsWorked);
    }// Calcular los años restantes para la jubilación

    public int vacationTimeLeft() {
        return (daysWorked / 360) * (30 - vacationDaysTaken);
    }// Calcular los días de vacaciones restantes

    public double calculateBonus() {
        return Math.round(2.2 * salary);
    }// Calcular el bono

	public String getFirstName() {
		return firstName;
	}// getFirstName

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}// setFirstName

	public String getLastName() {
		return lastName;
	}// getLastName

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}// setLastName

	public int getRegistration() {
		return registration;
	}// getRegistration

	public void setRegistration(int registration) {
		this.registration = registration;
	}// setRegistration

	public int getAge() {
		return age;
	}// getAge

	public void setAge(int age) {
		this.age = age;
	}// setAge

	public int getDaysWorked() {
		return daysWorked;
	}// getDaysWorked

	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	}// setDaysWorked

	public int getVacationDaysTaken() {
		return vacationDaysTaken;
	}// getVacationDaysTaken

	public void setVacationDaysTaken(int vacationDaysTaken) {
		this.vacationDaysTaken = vacationDaysTaken;
	}// setVacationDaysTaken

	public double getSalary() {
		return salary;
	}// getSalary

	public void setSalary(double salary) {
		this.salary = salary;
	}// setSalary

	public int getYearsWorked() {
		return yearsWorked;
	}// getYearsWorked

	public void setYearsWorked(int yearsWorked) {
		this.yearsWorked = yearsWorked;
	}// setYearWorked

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", registration=" + registration
				+ ", age=" + age + ", daysWorked=" + daysWorked + ", vacationDaysTaken=" + vacationDaysTaken
				+ ", salary=" + salary + ", yearsWorked=" + yearsWorked + "]";
	}// toString
}// class Employee
