package assignments_26;

import java.util.Scanner;

public class Assignment7 {
	private int temperature;
	private boolean raining=true;
	
	Scanner sc = new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter Temperature: ");
		temperature=sc.nextInt();
	}
	public void weatherCondition()
	{
		if(temperature>=20 && temperature<=30 && raining)
		System.out.println("It is safe to go outside");
		else
			System.out.println("It is not safe to go outside");
	}
}
