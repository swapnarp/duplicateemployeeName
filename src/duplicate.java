

import java.util.Scanner;

//Write a Java Program to find the duplicate characters in a string.
public class duplicate {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a string");
		String s= sc.nextLine();
		char[] ch= s.toCharArray();
		StringBuilder sb = new StringBuilder();
		int count =0;
		for (int i=0;i<=s.length()-1;i++) {
			for (int j=i+1;j<=s.length()-1;j++) {
				if(ch[i]==ch[j]) {
					//System.out.println("duplicate characters are "+ch[j]);	
					count++;
				}	//break;                                            
			}
			}
		
		System.out.println("duplicate characters are ");
	
	}

}
