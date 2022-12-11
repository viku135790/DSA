package array_1D;

//sort in ascending Order

public class Ascending {
	public static void main(String[] args) {
		int c[]= {40,30,25,48,78,56};
		asc(c);
		
	}
	private static void asc(int[] c) {
		int m=0;
		for(int  i=0; i<c.length; i++) {
			for(int j=0; j<c.length-1; j++) {
				if(c[j]>c[j+1]) {
					m=c[j];
					c[j]=c[j+1];
					c[j+1]=m;
				}
			}
		}
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]+" ");
		}
		
	}

}
