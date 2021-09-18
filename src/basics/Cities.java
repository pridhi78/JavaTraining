package basics;

public class Cities {

	public static void main(String[] args) {
	//Declare and define array
		String[] cities= {""};
		
	//Declare the array(only size)
		String[] states=new String[5];

	//Declare the array
		String[] countries;
		countries=new String[2];
		int i=0;
		do {
			System.out.println(states[i]);
			i++;
		}
		while(i<5);
		boolean stateFound=false;
		int n=0;
		while(stateFound) {
			String state=states[n];
			System.out.println(state);
			if(state=="abc") {
				System.out.println("");
			}
		}
	}

}
