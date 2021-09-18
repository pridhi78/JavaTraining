package studentDatabaseApp2;

public class studentDatabaseApp2 {
	private static int ID;

	public static void main(String[] args) {
		Student su =new Student("Pridhi", "2655525");

		su.enroll("Maths");
		su.enroll("Hindi");
		su.showCourses();
		su.pay(900);
		su.checkBalance();
		String studentDetail=su.toString();
		System.out.println(studentDetail);
	}

}
