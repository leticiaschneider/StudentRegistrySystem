package studentdatabase;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses = null;
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	public Student() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter student first name:");
		this.firstName = scanner.nextLine();
		
		System.out.println("Enter student last name:");
		this.lastName = scanner.nextLine();
		
		System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level:");
		this.gradeYear = scanner.nextInt();
		
		setStudentID();
	}
	
	private void setStudentID() {
		id++;
		this.studentId = gradeYear + "" + id;
	}
	
	public void enroll() {
		
		do { 
			System.out.println("Enter couse to enroll ( Q to quit ): ");
			Scanner scanner = new Scanner(System.in);
			String course = scanner.nextLine();
			
			if (!course.equals("Q")) {
				courses = courses + "\n   " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else { break; }
			
		} while ( 1 != 0 );
	}
	
	public void viewBalance() {
		System.out.println("Your balance is: $ " + tuitionBalance);
	}
	
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: &");
		Scanner scanner = new Scanner(System.in);
		int payment = scanner.nextInt();
		
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $ " + payment);
		viewBalance();
	}
	
	public String showInfo() {
		return "Name: " + firstName + " " + lastName +
				"\nGrade Level: " + gradeYear + 
				"\nStudent ID: " + studentId + 
				"\nCourses Enrolloed: " + courses + 
				"\nBalance: $" + tuitionBalance;
	}
}
