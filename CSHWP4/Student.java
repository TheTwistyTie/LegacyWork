public class Student{
	private String lastName;
	private double gpa;
	private int age;
	public Student(String lastName, double gpa, int age){
		this.lastName = lastName;
		this.gpa = gpa;
		this.age = age;
	}
	public double getGPA(){
		return gpa;
	}
	public String toString(){
		return lastName + "\t" + gpa + "\t" + age;
	}
	int compareTo(Student s){
		if(gpa<s.getGPA()){
			return -1;
		}
		else if(gpa==s.getGPA()){
			return 0;
		}
		else {
			return 1;
		}
	}
}