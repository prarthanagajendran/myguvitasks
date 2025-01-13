package introduction;

import java.util.Scanner;

public class Largestofthreenos {

	public static void main(String[] args) {
		 Scanner myObj=new Scanner(System.in);
			
		   System.out.print("Enter First number:");
		   int n1 =myObj.nextInt();
		   System.out.print("Enter Second number:");
		   int n2 =myObj.nextInt();
		   System.out.print("Enter Third number:");
		   int n3 =myObj.nextInt();
		   
		   int Largest=n1;//Largest of three numbers
				   
		   if(n2>Largest)
		   {
			   Largest=n2;
		   }
			if(n3>Largest) 
			{
			Largest=n3;
			}
			System.out.println("The Largest number is:"+Largest);
			}
		   
		   
	

}


output:
	Enter First number:3
	Enter Second number:8
	Enter Third number:5
	The Largest number is:8
