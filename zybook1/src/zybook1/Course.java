package zybook1;
import java.util.*;

/**
 * The Course class represents an enrollment list for one class. It stores the
 * time, room and participants of the lab, as well as the instructor's name.
 */
public class Course {
	private String name;
	private String room;
	private String timeAndDay;
	private ArrayList<Student> students;
	private Instructor instructor;
	private int capacity;

	/**
	 * Create a Course with a maximum number of enrolments. All other details are
	 * set to default values.
	 */
	public Course(String name, int maxNumberOfStudents) {
		this.name = name;
		instructor = new Instructor();
		room = "unknown";
		timeAndDay = "unknown";
		students = new ArrayList<Student>();
		capacity = maxNumberOfStudents;
	}

	/**
	 * Add a student to this Course.
	 */
	public void enrollStudent(Student newStudent) {
		boolean atCapacity = (students.size() == capacity);
		if (atCapacity == true) {
			System.out.println("The class is full, you cannot enrol.");
		} else {
			students.add(newStudent);
		}
	}

	/**
	 * Return the number of students currently enrolled in this Course.
	 */
	public int numberOfStudents() {
		return students.size();
	}

	/**
	 * Set the room number for this Course.
	 */
	public void setRoom(String roomNumber) {
		room = roomNumber;
	}

	/**
	 * Set the time for this Course. The parameter should define the day and the
	 * time of day, such as "Friday, 10am".
	 */
	public void setTime(String timeAndDayString) {
		timeAndDay = timeAndDayString;
	}

	/**
	 * Set the name of the instructor for this Course.
	 */
	public void setInstructor(Instructor instructorN) {
		instructor = instructorN;
	}

	/**
	 * Print out a class list with other Course details to the standard terminal.
	 */
	public void printList() {
		System.out.println(name + " " + timeAndDay);
		System.out.println("Instructor: " + instructor.getName() + "   Room: " + room);
		System.out.println("Class list:");
		for (Student student : students) {
			student.print();
		}
		System.out.println("Number of students: " + numberOfStudents());
	}
}
