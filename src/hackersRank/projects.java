package hackersRank;

import java.util.Scanner;

public class projects {
	
	/*    public static String getSmallestAndLargest(String s, int k) {
    String smallest = "";
    String largest = "";
    // Complete the function
        for(int i=0;i<s.length();i++) {
            if(i+k<=s.length()) {
                String sub1=s.substring(i,i+k);
                if(i==0){
                    smallest=sub1;
                }
                if(sub1.compareTo(largest)>0){
                    largest=sub1;
                }
                else if(sub1.compareTo(smallest)<0){
                  smallest=sub1;  
                }
                }
    
    // 'smallest' must be the lexicographically smallest substring of length 'k'

    // 'largest' must be the lexicographically largest substring of length 'k'
        }
    return smallest + "\n" + largest;
}


public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    int k = scan.nextInt();
    scan.close();
  
    System.out.println(getSmallestAndLargest(s, k));
}
}
*/
	static boolean isAnagram(String a ,String b) {
		a=a.toLowerCase();
		b=b.toLowerCase();
		
		boolean ret=false;
		StringBuilder c=new StringBuilder(b);
		
		if(a.length()==b.length()) {
			for(int i =0;i<a.length();i++) {
				for(int j=0;j<c.length();j++) {
					if(a.charAt(i)==c.charAt(j)) {
						c.deleteCharAt(j);
						if(i==a.length()-1 && c.length()==0) {
							ret=true;
							break;
						}
						break;
					}
				}
			}
	
		}return ret;
	}
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret=isAnagram(a,b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
