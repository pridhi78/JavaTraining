package test;

public class Addition extends Calculate{

	int i=100;
	void calculate(int a, int b) {
		int add=a+b;
		System.out.println("Sum is "+add);
		
	}

	@Override
	public int hashCode() {
		return i;
	}
}
