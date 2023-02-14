package String_Excercise;
//Check whether a character is a vowel or consonant
import java.util.*;
public class Sort_Character {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.nextLine();
		
		sortString(s);
	}

	private static void sortString(String s) {
		char c[]=s.toCharArray();
		Scanner sc=new Scanner(System.in);
		
			System.out.println("Press 1 for vowel and 2 for consonant");
			int x=sc.nextInt();
			switch(x) {
			case 1:{
				for(int i=0; i<c.length; i++) {
					if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u' || c[i]=='A' || c[i]=='E' || c[i]=='I' || c[i]=='O' || c[i]=='U') {
						System.out.print(c[i]+" ");
				}
				}
			}break;
			case 2:{
				for(int i=0; i<c.length; i++) {
					if(c[i]>='A' && c[i]<='Z' || c[i]>='a' && c[i]<='z') {
						if(c[i]!='a' || c[i]!='e' || c[i]!='i' || c[i]!='o' || c[i]!='u' || c[i]!='A' || c[i]!='E' || c[i]!='I' || c[i]!='O' || c[i]!='U') {
							System.out.print(c[i]+" ");
						}
					}
					
				}
			}break;
			
			}
			
		
	}

}
