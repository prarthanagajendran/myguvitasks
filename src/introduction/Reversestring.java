package introduction;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter a word");
		String a = myObj.nextLine();
		String reverse ="";
		
		int Length=a.length();
		
		for(int i=(Length-1); i>=0; i--)//Reverse the string
		{
			reverse = reverse +a.charAt(i);
		}
		   
		   System.out.println(reverse);

	}

}

output:
Enter a word
prarthana
anahtrarp
