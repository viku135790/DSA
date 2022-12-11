package array_1D;
//WAP to delete an array element from any index
import java.util.*;
public class Delete_Array_Element {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int a=sc.nextInt();
		
		int c[]=createArray(a);
		System.out.println("Array is created");
		
		int n[]=delete(c);
		for(int i=0; i<n.length; i++) {
			System.out.println(i+" = "+n[i]);
		}
	}

	public static int[] delete(int[] c) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index u want to delete");
		int d=sc.nextInt();
		int x[]=new int[c.length-1];
		for(int i=0; i<x.length; i++) {
			if(d>i) {
				x[i]=c[i];
			}
			else {
				x[i]=c[i];
			}
		}
		return x;
	}

	public static int[] createArray(int a) {
		Scanner sc=new Scanner(System.in);
		int b[]=new int[a];
		for(int i=0; i<b.length; i++) {
			System.out.println("Enter the number at "+ i);
			b[i]=sc.nextInt();
		}
		for(int i=0; i<b.length; i++) {
			System.out.println(i+" = "+b[i]);
		}
		return b;
	}

}
