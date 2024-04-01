package eu.ase.oop;

public class Student implements Cloneable {
	
	private int studentId;
	private String studentName;
	private Average average;
	
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.average = new Average(10, "Java");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student cloneStudent = new Student(0, "");
		
		cloneStudent.setStudentId(this.studentId);
		cloneStudent.setStudentName(this.studentName);
		
		Average average = new Average(
				this.getAverage().getGrade(),
				this.getAverage().getSubject()
				);
		
		cloneStudent.setAverage(average);
		
		return super.clone();
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Average getAverage() {
		return average;
	}

	public void setAverage(Average average) {
		this.average = average;
	}
	
}
