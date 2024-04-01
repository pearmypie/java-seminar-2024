package eu.ase.oop;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Seminarul 1, 23 februarie 2024");
		
		Student ionut = new Student(1, "Ionut");
		Student gigel = new Student(2, "Gigel");
		
		Student ionel;
		// ionel = ionut;
		ionel = (Student) ionut.clone();
		
		ionel.setStudentId(3);
		ionel.setStudentName("Ionel");
		
		ionut.setAverage(new Average(8, "Java"));
		gigel.setAverage(new Average(10, "Matematica"));
		ionel.setAverage(new Average(6, "P.O.O."));
		
		System.out.println("Student1 grade: " + ionut.getAverage().getGrade() + " subject: " + ionut.getAverage().getSubject());
		System.out.println("Student2 grade: " + gigel.getAverage().getGrade() + " subject: " + gigel.getAverage().getSubject());
		System.out.println("Student3 grade: " + ionel.getAverage().getGrade() + " subject: " + ionel.getAverage().getSubject());
		
		System.out.println("Student1 id: " + ionut.getStudentId() + ", " + "name: " + ionut.getStudentName());
		System.out.println("Student2 id: " + gigel.getStudentId() + ", " + "name: " + gigel.getStudentName());
		System.out.println("Student3 id: " + ionel.getStudentId() + ", " + "name: " + ionel.getStudentName());
	}

}
