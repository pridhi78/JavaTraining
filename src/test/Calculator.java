package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Calculator {

	/*public static void main(String[] args) {
		Calculate add=new Addition();
		add.calculate(3, 4);
		Subtraction sub=new Subtraction();
		sub.calculate(8, 5);
		sub.calculate2(9, 5);
		System.out.println(add);
		boolean a=add instanceof Calculate;
		System.out.println(a);
		
		boolean s=Calculator instanceof Addition;
		System.out.println(a);
		

	}
	/////////////////////////////////////////////////////////////////////////////////////////////////	
	   static Iterator func(ArrayList mylist){
	      Iterator it=mylist.iterator();
	      while(it.hasNext()){
	         Object element = it.next();
	         System.out.println(element);
	         if(element=="###") {//Hints: use instanceof operator
	            System.out.println("I am in");
	            System.out.println(mylist.indexOf(element));
	            for(int i=mylist.indexOf(element)+1;i<mylist.size();i++) {
	            	System.out.println(mylist.get(i));
	            }
				break;
	         }
		else
		{
			System.out.println("I am out");
		}
			}
	      return it;
	      
	   }
	   @SuppressWarnings({ "unchecked" })
	   public static void main(String []args){
	      ArrayList mylist = new ArrayList();
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int m = sc.nextInt();
	      for(int i = 0;i<n;i++){
	         mylist.add(sc.nextInt());
	         System.out.println(mylist);
	      }
	      System.out.println(mylist);
	      mylist.add("###");
	      for(int i=0;i<m;i++){
	         mylist.add(sc.next());
	      }
	      System.out.println(mylist);
	      Iterator it=func(mylist);
	     /* while(it.hasNext()){
	         Object element = it.next();
	         //System.out.println((String)element);
	      }*/
	   
//////////////////////////////////////////////////////////////////////////////////////////////


		    /*public static String getSmallestAndLargest(String s, int k) {
		        String smallest = "";
		        String largest = "";
		        ArrayList arr=new ArrayList();
		        for(int i=0;i<s.length();i++) {
		        	if(i+k<=s.length()) {
		        	 String sub=s.substring(i, i+k);
		        	 arr.add(sub);
		        	 System.out.println(sub);
		        	 System.out.println(arr);
		        	}
		        	

			        char c=s.charAt(i);
					 int ascii =(int)c;	
					 //System.out.println(c+" "+ascii);
					 int x=ascii;
					 for(int j=0;j<s.length();j++)
					 {
						 char y=s.charAt(j);
						 int z=(int)y;
						if(x<y) {
							//System.out.println(j+": "+x+" x is less than "+z);
						}
					 }
		        }	
	        	for (int q=0;q<=arr.size();q++) {
	        		System.out.println(q);
	        		if(q+k<s.length()) {
	        		System.out.println("Inside if"+(int)q+k);	
	        		String h=arr.get(q).toString();
	        		int a=arr.get(q).toString().compareTo(arr.get(q+1).toString());
	        		if(a>0) {
	        			System.out.println(arr.get(q).toString() +" is greater than "+arr.get(q+1).toString());
	        		}
	        		if(a<0) {
	        			System.out.println(arr.get(q).toString() +" is smaller than "+arr.get(q+1).toString());
	        		}
	        		}
	        	}
		        // Complete the function
		     
		        // 'smallest' must be the lexicographically smallest substring of length 'k'
		        // 'largest' must be the lexicographically largest substring of length 'k'
		        
		        return smallest + "\n" + largest;
		    }


		    public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);
		        String s = scan.next();
		        int k = scan.nextInt();
		        scan.close();
		      
		        System.out.println(getSmallestAndLargest(s, k));
		    }*/
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	

	    /*public static String getSmallestAndLargest(String s, int k) {
	        String smallest = "";
	        String largest = "";
	        ArrayList arr=new ArrayList();
	        // Complete the function
	        for(int i=0;i<s.length();i++) {
	        	if(i+k<=s.length()) {
	        	 String sub=s.substring(i, i+k);
	        	 arr.add(sub);
	        	}
	        }
	        System.out.println("Before sorting array by sort function");
	        sorting(arr);
	        System.out.println("After sorting array by sort function");
        	for (int q=0;q<=arr.size();q++) {
        		if(q+k<s.length()) {	
        		String h=arr.get(q).toString();
        			for(int j=q+1;j<arr.size();j++) {	        		
			        	//int a=arr.get(q).toString().compareTo(arr.get(q+1).toString())
			        		if(arr.get(q).toString().compareTo(arr.get(j).toString())>0) {
			        		String temp=arr.get(q).toString();
			        		arr.set(q, arr.get(j).toString());
			        		arr.set(j, temp);
			        		}
        			}
        		}
        	}
        	System.out.println(arr);
	        // 'smallest' must be the lexicographically smallest substring of length 'k'
	        System.out.println(arr.get(0).toString());
	        // 'largest' must be the lexicographically largest substring of length 'k'
	        System.out.println(arr.get(arr.size()-1).toString());
	        return smallest + "\n" + largest;
	    }
	    static void sorting(ArrayList array) {
	    	//ArrayList list=new ArrayList();
	    	Collections.sort(array);
	    	System.out.println(array);
	    }

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(s, k));
	      
	    }*/
	///////////////////////////////////////////////////////////////////////////////////////////////////
	


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

	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////

	   static void isAnagram(String a, String b) {
	        // Complete the function
	    	char h='\0';
	        for(int i=0;i<a.length();i++) {	        	
	        	char c=a.charAt(i);
	        	int count = 0;
	        		for(int j=0;j<b.length();j++) {
	        			h=b.charAt(j);
	        			if(Character.compare(c, h)==0) {	        				
	        				count++;
	        				System.out.println("char at i "+i+" is "+c+" and char at j "+j+" is "+h);
	        			}

	        				
	        		}
	        		System.out.println("Count of character "+c+" of String a in String b char "+h+ " is "+count);		
	        }
	    }

	    public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        isAnagram(a, b);
	        //System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////
	   static void isAnagram(String a) {
		   int freq[]=new int[a.length()];
		   int i,j;
		   char string[]=a.toCharArray();
		   
		   for(i=0;i<a.length();i++) {
			   freq[i]=0;
			   for(j=0;j<a.length();j++) {
				   if(string[i]==string[j]) {
					   freq[i]++;
					  
				   }
			   }
		   }
		   for(i=0;i<freq.length;i++) {
			   if(string[i]!= ' ' && string[i]!= 0) {
			   System.out.println(string[i]+" - "+freq[i]);
			   }
		   }
		   
				   }
	
	static boolean isAnagram(String a,String b) {
		char string[]=a.toCharArray();
		Arrays.sort(string);
		char string2[]=b.toCharArray();
		Arrays.sort(string2);
		String x=new String(string);
		String y=new String(string2);
		if(x.equals(y)) {
			return true;
		}
		else 
			return false;
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
	
	
	

