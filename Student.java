package student;

public class Student {

	private String name;

	
	public Student() {
	this.name = "Unkown";
}
public Student(String name) {
	this.name = name;
}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String args[]) {
	Student s1 = new Student();
	Student s2 = new Student("parth");
	Student s3 = new Student("jay");
	Student s4 = new Student();
	Student s5 = new Student("raj");
	
	System.out.println("Student 1 name is : "+ s1.getName());
	System.out.println("Student 2 name is : "+ s2.getName());
	System.out.println("Student 3 name is : "+ s3.getName());
	System.out.println("Student 4 name is : "+ s4.getName());
	System.out.println("Student 5 name is : "+ s5.getName());
}
}
