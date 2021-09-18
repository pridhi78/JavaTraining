package studentDatabaseApp2;

public class Student {	
	public String domain="InternationSchool";
	public String name;
	public String SSN;
	public String newID="";
	public String email;
	public String course;
	public int totalfee=8000;
	public int feePaid;
	private static  int ID=100;
	private static final int costOfCourse=200;
	
	public Student(String name,String SSN) {
	
		ID++;
		this.name=name;
		this.SSN=SSN;
		 getEmail();
		 getID();
	}
	private void getEmail() {
		email=name.toLowerCase()+ID+"@"+domain+".com";
	}
	
	public String getID() {
		int x=(int)((Math.random()*(9000-1000+1))+1000);
		
		if(SSN.length()>4) {
			newID=String.valueOf(ID)+String.valueOf(x)+SSN.substring(SSN.length()-4, SSN.length());
		}
		else {
			newID=String.valueOf(ID)+String.valueOf(x)+SSN;
		}
		return newID;
	}
	public void enroll(String courses) {
		this.course=courses+"\n"+this.course;
		System.out.println("Enrollment of a Student");
		System.out.println("Name of the Student="+name);
		System.out.println("SSN of the Student="+SSN);
		System.out.println("ID of the Student="+newID);
		System.out.println("Email Id of the Student="+email);
		System.out.println("Course of the Student="+course);
		
		System.out.println("Studend enrollment completed!!");
		totalfee=totalfee+costOfCourse;
	}
	
	public void pay(int feePaid) {
		
		System.out.println("Total fees to be paid:"+totalfee);
		System.out.println("fees paid:"+feePaid);
		this.feePaid=feePaid;
	}
	
	public void checkBalance() {
		int balance=totalfee-feePaid;
		System.out.println("Balance :"+balance);
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", SSN=" + SSN + ", ID=" + newID + "]";
	}
	
	public void showCourses() {
		System.out.println("Courses available:"+
		"\nMathematics"+
		"\nScience"+
		"\nHindi");
	}
}
