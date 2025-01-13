package introduction;
import java.util.Scanner;

public class Gradingsystem {

	public static void main(String[] args) {
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter marks:");
		int n= myObj.nextInt();
		if(n==100) 
		{
			System.out.println("S");
		}
		else if(n<=99 && n>=90)
		{
			System.out.println("A");
		}
		else if(n<=89&&n>=80)
		{
			System.out.println("B");
		}
		else if(n<=79&&n>=70)
		{
			System.out.println("C");
		}
		else if(n<=69&&n>=60)
		{
			System.out.println("D");
		}
		else if(n<=59&&n>=50)
		{
			System.out.println("B");
		}
		else if(n<=50)
		
		{
			System.out.println("F");
		}
		else {
			System.out.println("Invalid Input");
		}
	}
}




output:

Enter marks:
72
C

