package bankDatabseApp;

public interface IRate {

	//Write a method that return Base rate
	default double getBaseRate() {
		return 2.5;
	}
}
