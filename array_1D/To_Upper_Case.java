package array_1D;

//convert int to upper case

public class To_Upper_Case {
	public static void main(String[] args) {
		char c[]= {'a','x','w','m','p'};
		
		convertUpper(c);
		
	}

	private static void convertUpper(char[] c) {
		for(int i=0; i<c.length; i++) {
			if(c[i]>='a' && c[i]<='z') {
				c[i]=(char)(c[i]-32);
				System.out.print(c[i]+" ");
			}
		}
	}

}
