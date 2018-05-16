package zybook1;

public class Student extends Person{

	// the amount of credits for study taken so far
	private int Credit;


	public void addCredits(int credit) {
		Credit += credit;
	}

	/**
	 * Return the number of credit points this student has accumulated.
	 */
	public int getCredits() {
		return Credit;
	}


	/**
	 * Print the student's name and ID number to the output terminal.
	 */
	public void print() {
		super.print();
		System.out.println(  ", student ID: " + super.getID() + ", credits: " + Credit);
	}
}
