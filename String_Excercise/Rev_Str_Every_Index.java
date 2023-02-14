package String_Excercise;

import java.util.Scanner;

public class Rev_Str_Every_Index {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		String ns[]=s.split(" ");
		
		int c=countIndex(ns);
		
		reverse(ns,c);
	}

	public static void reverse(String[] ns, int c) {
		String n="";
		for(int i=c-1; i>=0; i--) {
			n=ns[i];
			String ext=extract(n);
			System.out.print(ext);
			System.out.print(" ");
		}
		
	}

	private static String extract(String n) {
		String rev="";
		for(int i=0; i<n.length(); i++) {
			rev=n.charAt(i)+rev;
		}
		return rev;
	}

	public static int countIndex(String[] ns) {
		int count=0;
		for(int i=0; i<ns.length; i++) {
			count++;
		}
		return count;
	}

}
