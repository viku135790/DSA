package array_1D;

//find the largest number in array

public class Find_Largest {
	public static void main(String[] args) {
		int a[]= {10,450,80,800,300,40,90};
		
		int largest=findLargest(a);
		System.out.println(largest +" =  is the largest number");
	}

	public static int findLargest(int[] a) {
		
		int b=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]>b) {
				b=a[i];
			}
		}
		return b;
	}
	

}
