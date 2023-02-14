package String_Excercise;

import java.util.Scanner;

public class Rev_String_Index {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		String ns[]=s.split(" ");
		
		int c=countIndex(ns);
		System.out.println(c);
		
		reverse(ns,c);
	}

	public static void reverse(String[] ns, int c) {
		String n="";
		for(int i=c-1; i>=0; i--) {
			n=n+ns[i]+" ";
		}
		System.out.println(n);
	}

	public static int countIndex(String[] ns) {
		int count=0;
		for(int i=0; i<ns.length; i++) {
			count++;
		}
		return count;
	}

}
