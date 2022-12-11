package array_1D;
//find the smallest number
public class Smallest_Num {
	public static void main(String[] args) {
		int c[]= {400,600,200,100,50,60,80,1,};
		
		int smallest=findSmallest(c);
		System.out.println(smallest+"  = is the smallest number");
	}

	public static int findSmallest(int[] c) {
		int s=400;
		for(int i=0; i<c.length; i++) {
			if(c[i]<s) {
				s=c[i];
			}
		}
		return s;
	}

}
