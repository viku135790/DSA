package array_1D;

//sort char into descending order

public class DescChar {
	public static void main(String[] args) {
		char c[]= {'a','n','x','g'};
		desc(c);
		
	}

	public static void desc(char[] c) {
		char x=' ';
		
		for(int j=0; j<c.length; j++) {
			for(int i=0; i<c.length-1; i++) {
				if(c[i]>c[i+1]) {
					x=c[i];
					c[i]=c[i+1];
					c[i+1]=x;
				}
			}
		}
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]+" ");
		}
	}

}
