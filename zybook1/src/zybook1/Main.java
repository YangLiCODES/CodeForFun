package zybook1;


public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.setName("Hani Javadi");
		instructor.setID("888777666");
		instructor.setSalary(11111);
		instructor.print();
		
		System.out.println("--- --- ---");
		
		Student student1 = new Student();
		student1.setName("Joe Loop");
		student1.setID("810123456");
		student1.addCredits(10);
		student1.print();
		
		System.out.println("--- --- ---");
		
		Student student2 = new Student();
		student2.setName("Mary Collection");
		student2.setID("811987321");
		student2.addCredits(25);
		student2.print();
		
		System.out.println("--- --- ---");
		
		Student student3 = new Student();
		student3.setName("Ke Method");
		student3.setID("810010101");
		student3.print();
		
		System.out.println("--- --- ---");
		
		Course course = new Course("MIST 4700", 40);
		course.setInstructor(instructor);
		course.setRoom("Z101");
		course.setTime("MWF 6am-7am");
		course.enrollStudent(student1);
		course.enrollStudent(student2);
		course.enrollStudent(student3);
		
		
		course.printList();
		
		

	}

}
