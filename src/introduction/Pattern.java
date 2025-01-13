package introduction;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {

		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter a number");
		int n= myObj.nextInt();
	
		int num=1;//printing numbers in pyramid pattern
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+"");
				num++;
				
			}System.out.println(" ");
		}
	}

}

output:
Enter a number
4
1 
23 
456 
78910 
