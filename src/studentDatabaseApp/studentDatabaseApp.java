package studentDatabaseApp;

import java.util.Scanner;

public class studentDatabaseApp {

	public static void main(String[] args) {
		
		// Ask how many new users we want to add
		System.out.println("Enter number of new Students to enroll: ");
		Scanner sc=new Scanner(System.in);
		int studentCount = sc.nextInt();
		Student[] students=new Student[studentCount];
		
		//Create a number of new Students
		for (int n=0;n<studentCount;n++) {
			students[n]=new Student();
			students[n].enroll();
			students[n].payTuitionBalance();
			System.out.println(students[n].showInfo());
		}
		for (int n=0;n<studentCount;n++) {
			System.out.println(students[n].showInfo());
		}
	}

}
