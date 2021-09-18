package basics;

import java.util.Scanner;

public class FibnnaciApp {
	public static void main(String[] args) {
		int n=1;
		int array2[]= {4,5,90,1};
		
		String a="dnjwdjwhuwhcw";
		System.out.println();
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String x=s.replaceAll("\\s+"," ").replaceAll("[,!,?._'@]+", " ").replaceAll("  "," ").trim();
        String[] st=x.split(" ");
        int count=0;
        String z=st[0];
        System.out.println(z.isEmpty());
        for(String b: st) 
        {
            count++;
         }
        System.out.println(count);
        for(String a: st) 
        {
            System.out.println(a);
         }
        scan.close();
        //System.out.println(tokens(s));
        
		//System.out.println(factorial(n));
		//System.out.println(minimum(array2));
		//System.out.println(maximum(array2));
		//System.out.println(average(array2));
        
	}
	
	private static void split(String string) {
		// TODO Auto-generated method stub
		
	}

	/*public static String tokens(String s) {
		String[] st=s.split(" ");
		int count=0;
		for(String a: st) {
	        count++;
	        return a;
	        }
		
		
		
	}*/

	public static int fib(int n) {
		if(n==0) {
			return 0;
		}
		else if (n==1){
			return 1;
		}	
		return ((fib(n-1))+(fib(n-2)));
		
	}
	
	public static int sumFunc(int n){

		int sum=0;

		for(int i=1;i<=n;i++){

		sum=i+sum;

		}

		return sum;}
	
	public static int factorial(int n){

		if(n==0 || n==1){

		return 1;

		}

		return factorial(n-1)*n;

		}
	
	public static int minimum(int[] array1) {
		int smallest=0;
		for(int i=0;i<array1.length;i++) {
			smallest=array1[0];
			if(array1[i]<smallest) {
				smallest=array1[i];
			}
		}
		return smallest;
		
	}
	
	public static int maximum(int[] array1) {
		int largest=0;
		for(int i=0;i<array1.length;i++) {
			
			if(array1[i]>largest) {
				largest=array1[i];
			}
		}
		return largest;
		
	}
	
	public static int average(int[] array1) {
		int sum=0;
		for(int i=0;i<array1.length;i++) {
			
				sum=array1[i]+sum;
		}
		return sum/array1.length;
		
	}
	
	
}
