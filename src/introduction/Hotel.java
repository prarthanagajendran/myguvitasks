package introduction;

import java.util.Scanner;

public class Hotel {

	public static void main(String[] args )
		{
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter a number of month:");
		int month= myObj.nextInt();
		if(month<1||month>12)
		{
		System.out.print("Enter the valid number between 1 to 12");
		return;
		}
		Scanner myObj1=new Scanner(System.in);
		System.out.println("Enter the remt amount:");
		int rent= myObj1.nextInt();
		
		Scanner myObj2=new Scanner(System.in);
		System.out.println("Enter the number of days");
		int days= myObj2.nextInt();
		
		double Totaltariff ;
		
		switch(month)
		{
		case 4:
		case 5:
		case 6:
		case 11:
		case 12:
			
		Totaltariff = 1.20  * rent * days;
		break;
		default:
	    Totaltariff=rent * days;
		
		}	
		
		System.out.printf("Total rent: %.2f\n",+Totaltariff);
	    }

		
}

output:	
Enter a number of month:
4
Enter the remt amount:
1500
Enter the number of days
3
Total rent: 5400.00
			


