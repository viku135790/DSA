package String_Excercise;

/*	(ArrayIndexOutOfBoundsException) Using the two arrays shown below,
	write a program that prompts the user to enter an integer between 1 and 12 and then displays the months and its number of days corresponding to the integer entered. 
	Your program should display "wrong number" if the user enters a wrong number by catching ArrayIndexOutOfBoundsException.
	String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
 * */
import java.util.*;

public class Month_Details {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number between 1 to 12");
		int x=sc.nextInt();
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		getInfo(x, months, dom);
	}
	
	
	public static void getInfo(int x, String [] months, int dom[]){
		try {
			if(x<13) {
				for(int i=0; i<=months.length; i++) {
					if(x==i) {
						System.out.println("Month name is = "+months[i-1]);
						System.out.println("No of days in "+months[i-1]+" = "+dom[i-1]);
					}
				}
			}
			else if(x>=13) {
				throw new ArrayIndexOutOfBoundsException();
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Wrong number");
	        e.printStackTrace();
		}
	}

}
