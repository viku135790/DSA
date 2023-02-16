package String_Excercise;

import java.util.Scanner;

public class RemoveWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String x=sc.nextLine();
		String s[]=x.split(" ");
		System.out.println("Enter the word you want to remove ");
		String xx=sc.next();
		
		int count=updatedArr(s,xx);
		int ind=findIndex(xx,s);
		String ns=removeWord(s,ind,count);
		System.out.println(ns);
		
	}

	private static int updatedArr(String[] s, String xx) {
		int count=0;
		for(int i=0; i<s.length; i++) {
			if(!s[i].equalsIgnoreCase(xx)) {
				count++;
			}
		}
		return count;
		
	}

	private static String removeWord(String[] s, int ind, int count) {
		String ns="";
		String newarr[]=new String[count];
		for(int i=0; i<newarr.length; i++) {
			if(i<ind) {
				newarr[i]=s[i];
			}
			else if(i==ind) {
				newarr[i]=s[i+1];
			}
			else {
				newarr[i]=s[i+1];
			}
		}
		for(int j=0; j<newarr.length; j++) {
			ns=ns+newarr[j]+" ";
		}
		return ns;
		
	}

	private static int findIndex(String xx, String[] s) {
		int index=0;
		for(int i=0; i<s.length; i++) {
			if(s[i].equalsIgnoreCase(xx)){
				index=i;
			}
			
		}
		return index;
	}

	
}
