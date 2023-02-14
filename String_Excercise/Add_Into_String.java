package String_Excercise;

import java.util.*;
public class Add_Into_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String m=sc.nextLine();
		String []ss=m.split(" ");
		
		extraxt(ss);
		
	}


	public static void extraxt(String[] ss) {
		String ns[]=new String[ss.length+1];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the new string name");
		String ad=sc.next();
		
		for(int i=0; i<ns.length; i++) {
			if(i<ss.length) {
				ns[i]=ss[i];
			}
			
			else if(i==ss.length) {
				ns[i]=ad;
			}
		}
		
		
		for(int i=0; i<ns.length; i++) {
			System.out.print(ns[i]+" ");
		}
	}

}
