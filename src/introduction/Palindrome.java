package introduction;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	
		
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter a word");
		String a = myObj.nextLine();
		String reverse ="";
		
		int Length=a.length();
		
		for(int i=(Length-1); i>=0; i--)//Palindrome
		{
			reverse = reverse +a.charAt(i);
		}
		 System.out.println(a.toLowerCase());
		 System.out.println(reverse.toLowerCase());
		if(a.toLowerCase().equals(reverse.toLowerCase()))
			{
				System.out.println("Given word is a Palindrome");
			}
			else 
			{
				System.out.println("Given word is not Palindrome");
			}
			
		}
	 
		
		
		}

output:

Enter a word
Malayalam
malayalam
malayalam
Given word is a Palindrome

