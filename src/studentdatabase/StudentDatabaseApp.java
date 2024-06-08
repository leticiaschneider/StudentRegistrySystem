package studentdatabase;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		System.out.println("Enter number of new students to enroll:  ");
		Scanner scanner = new Scanner(System.in);
		int numOfStudents = scanner.nextInt();
		Student[] students = new Student[numOfStudents];
		
		for (int n = 0; n < numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
		}
		
		for (int n = 0; n < numOfStudents; n++) {
			System.out.println(students[0].toString());
		}
	}

}
