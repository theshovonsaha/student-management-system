package StudentManagementApp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String courses;
	private int studentID;
	private String tuitionBalance;
	private static double courseCost = 600.0;
	private static int staticID= 21;
	
	//Constructor: User Name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Student First Name:");
		this.firstName = in.nextLine();
		System.out.print("Enter Student Last Name:");
		this.lastName = in.nextLine();
		
		System.out.println("Enter Student Grade Level from the following:\n1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		
	
			
	}
	//Generate ID
	public void PrintStudentInfo() {
		// Output Created Student
		System.out.println("Name: " +  firstName+ " " + lastName);
		System.out.println("Year: " +  gradeYear);
		System.out.println("Student ID: " +  studentID);
	}
	
	private void setStudentID() {
		
		staticID++;
		//Grade level + staticID
		this.studentID = gradeYear + staticID ;
		
	}
	
	//Enroll in Courses
	public void enroll() {
		
		System.out.println("Name: "); 
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		
	}
	
	
	//View Student Account Balance
	
	//Pay tuition
	
	//Show status
}
