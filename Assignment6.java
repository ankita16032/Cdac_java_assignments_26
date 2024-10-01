package assignments_26;

import java.util.Scanner;

public class Assignment6 {
	private int number;
	Scanner sc = new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter Number: ");
		number=sc.nextInt();		
	}
	public void checkNumber()
	{
	if(!(number>=10 && number<=20))
		System.out.println("number is not between 10 and 20");
	else
		System.out.println("number is between 10 and 20");
	}	
}
