package test;

abstract class Mobile {

	Mobile(){
		System.out.println("Mobile is the base class");
	};
	public static int a=100;
	void run1(){
		System.out.println("Mobile run1 method");
	}
	void dialNumber() {
		System.out.println("Numbers are dialled from Nokia mobile");
	}
	public abstract void run();
}

