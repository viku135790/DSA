package String_Excercise;

import java.util.Scanner;

public class Convert_Into_LowerCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String for covert into lowercase");
		String s=sc.next();
		
		lowerCase(s);
	}

	public static void lowerCase(String s) {
		char c[]=s.toCharArray();
		for(int i=0; i<c.length; i++) {
			if(c[i]>='A' && c[i]<='Z') {
				c[i]=(char)(c[i]+32);
			}
		}
		String ns=new String(c);
		System.out.println(ns);
	}

}
