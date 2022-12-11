package array_1D;
//find the largest character

public class Laegest_Char {
	public static void main(String[] args) {
		char c[]= {'a','b','m','d'};
		
		char x=findLargest(c);
		System.out.println(x);
	}

	private static char findLargest(char[] c) {
		
		char max=' ';
		for(int i=0; i<c.length; i++) {
			if(c[i]>max) {
				max=c[i];
			}
		}
		return max;
	}

}
