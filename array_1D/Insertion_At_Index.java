package array_1D;
//insert  the index and add the value
import java.util.*;
public class Insertion_At_Index {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int a=sc.nextInt();
		
		int b[]=createArray(a);
		insert(b);
	}
	
	public static void insert(int[] b) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index");
		int ind=sc.nextInt();
		System.out.println("Enter the number u want to add");
		int add=sc.nextInt();
		int m[]=new int[b.length+1];
		
		for(int i=0; i<m.length; i++) {
			for(int k =0;k<b.length;k++) {
			if(ind>i) {
				m[i]=b[k];
			}
			else if(ind==i) {
				m[i]=add;
			}
			else {
				 m[i]=b[k+1];
			}
			}
			
		}
		
		for(int j=0; j<m.length; j++) {
			System.out.println(j+" = "+m[j]);
		}
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
