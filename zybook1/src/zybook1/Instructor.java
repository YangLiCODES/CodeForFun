package zybook1;

public class Instructor  extends Person{

	// the amount of credits for study taken so far
	private double salary;


	public double getSalary() {
		return salary;
	}

	public void setSalary(double Salary) {
		salary = Salary;
	}

	public void print() {
		super.print();
		System.out.println(   ", instructor ID: " + super.getID() + ", salary: " + salary);
	}
}
