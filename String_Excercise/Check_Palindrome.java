package String_Excercise;

import java.util.*;
public class Check_Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to check palindrome");
		String s=sc.next();
		
		String ns=palindrome(s);
		if(s.equals(ns)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

	 public static String palindrome(String s) {
		char c[]=s.toCharArray();
		String rev="";
		for(int i=0; i<c.length; i++) {
			rev=c[i]+rev;
		}
		String ns=new String(rev);
		return ns;
	}

}
