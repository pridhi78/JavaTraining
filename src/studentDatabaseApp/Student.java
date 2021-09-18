package studentDatabaseApp;

import java.util.Scanner;

public class Student {

	private String firstname;
	private String lastname;
	private int gradeYear;
	private String studentID;
	private String courses="";
	private int tuitionBalance;
	private static int costOfCourse=600;
	private static int id=1000;
	
	//Constructor :prompt user to enter Student's name and year
	public Student() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student first name ");
		this.firstname=sc.nextLine();
		
		System.out.println("Enter student last name ");
		this.lastname=sc.nextLine();
		
		System.out.println("Enter student class level ");
		this.gradeYear=sc.nextInt();
		setStudentId();
		//System.out.println("First name: "+this.firstname+" Last name: "+this.lastname+". Grade Year is :"+this.gradeYear);

		//System.out.println("First name: "+this.firstname+" Last name: "+this.lastname+". Grade Year is :"+this.gradeYear+" "+studentID);
	}
	
	//Generate an id
	private String setStudentId() {
		//Grade Level + ID
		id++;
		this.studentID= gradeYear +" "+id; 
		return studentID;
		
	}
	
	//Enroll courses
	public void enroll() {
		//Get inside a loop,user hits 0
		do {
			System.out.println("Enter a course to enroll (Q to quit)");
			Scanner sc=new Scanner(System.in);
			String course=sc.nextLine().toUpperCase();
			if(!course.equals("Q")){
				if(!courses.isEmpty()) {
					courses=courses+"\n"+course;
					tuitionBalance= tuitionBalance + costOfCourse;
				}
				else {
					courses=course;
					tuitionBalance= tuitionBalance + costOfCourse;
					}
			}
			else {
				break;
			}
		} while( 1 != 0);
		System.out.println("ENROLLED IN :"+ courses);
		System.out.println("TUITION BALANCE :"+ tuitionBalance);
	}
	
	//View balance 
	public void viewBalance() {
		System.out.println("Your balance is $ "+tuitionBalance );
	}
	
	//Pay tuition
	public void payTuitionBalance() {
		viewBalance();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your payment");
		int payment=sc.nextInt();
		tuitionBalance=tuitionBalance-payment;
		System.out.println("Thank you for your Payment of $ "+ payment);
		viewBalance();
	}
	
	//Show status
	public String showInfo() {
		return "Student Id: "+studentID+
				"\nName: "+ firstname+ " "+ lastname+
				"\nGrade Year: "+gradeYear+
				"\nCourses Enrolled: "+courses+
				"\nBalance: $" + tuitionBalance;
	}

}
