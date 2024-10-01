package assignments_26;

import java.util.Scanner;

public class Assignment8 {

	private int num1;
	private int num2;
	private int num3;
	
	Scanner sc = new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter num1, num2, num3");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
	}
	public void display()
	{
	int greatest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
	System.out.println("greatest no is: "+greatest);
	}
	
}
