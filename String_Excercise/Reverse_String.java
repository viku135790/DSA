package String_Excercise;
import java.util.*;
public class Reverse_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		reverse(s);
	}

	public static void reverse(String s) {
		String ns="";
		for(int i=0; i<s.length(); i++) {
			ns=s.charAt(i)+ns;
		}
		System.out.println(ns);
		
	}
	

}
