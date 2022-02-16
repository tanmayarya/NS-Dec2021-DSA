package OOPS;

class Student {
	String name;
	int rollNo;
	
	public Student() {
//		this.name = "Hitesh";
//		this.rollNo = 10;
//		this("Hitesh", 10);
	}
	
	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public Student(Student student) {
		this.name = student.name;
		this.rollNo = student.rollNo;
	}
	
	void displayStudentData() {
		System.out.println("Name: " + this.name);
		System.out.println("Roll No: " + this.rollNo);
		System.out.println("*****************");
	}
}



public class Basics {	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Sameer", 2);
		Student s3 = new Student(s1);
		
		
//		s1.name = "Tanmay";
//		s2.name = "Suraj";
//		s2.rollNo = 20;
		s1.displayStudentData();
		s2.displayStudentData();
		s3.displayStudentData();
		
//		System.out.println(s1.name);
//		System.out.println(s1.rollNo);
//		
//		System.out.println(s2.name);
//		System.out.println(s2.rollNo);
//		
//		System.out.println(s3.name);
//		System.out.println(s3.rollNo);
		
		String s= new String();
		int a[] = new int[1];
		
		final int ab;
		ab = 1;
//		ab = 3;
//		a.length -> property of a
//		s.length() -> function of String class
		
//		s3 = new Student();
		
	}
}
