package array_1D;
//create an array object and store and display one by one
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Store_Array_Display {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int a = sc.nextInt();
		
		int m[]=insert(a);
		display(m);
	}

	public static void display(int[] m) {
		for(int i=0; i<m.length; i++) {
			System.out.println(m[i]);
		}
		
	}

	public static int[] insert(int a) {
		int b[]=new int[a];
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<b.length; i++) {
			System.out.println("Enter the number at "+ i);
			b[i]=sc.nextInt();
		}
		return b;
	}
	

}
