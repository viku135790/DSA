package String_Excercise;

import java.util.Scanner;

public class Rev_Str {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		String ns[]=s.split(" ");
		for(int i=0; i<ns.length; i++) {
			String x=extract(ns[i]);
			System.out.print(x);
			System.out.print(" ");
		}
	}

	public static String extract(String x) {
		String rev="";
		for(int i=0; i<x.length(); i++) {
			rev=x.charAt(i)+rev;
		}
		return rev;
	}

}
