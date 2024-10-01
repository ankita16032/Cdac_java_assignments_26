package assignments_26;

import java.util.Scanner;

public class Assignment5 {

	private boolean bachelorsDegree=true;
	private boolean experience=true;
	private boolean criminalRecord=false;
	
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
		
		System.out.println("Have you done bachelorsDegree as true or false ");
		bachelorsDegree= sc.nextBoolean();
		System.out.println("Have a experience give value as true or false");
		experience=sc.nextBoolean();
		System.out.println("Have criminalRecord give value as true or false");
		criminalRecord = sc.nextBoolean();
	}
	
	
	public void isEligibleForJob()
	{
		if( (bachelorsDegree==true || experience==true) && criminalRecord==false)
			System.out.println("Eligible for job ");
		else
			System.out.println("Not Eligible for job ");
	}
	
	public void display()
	{
		System.out.println("bachelorsDegree: "+bachelorsDegree);
		System.out.println("experience: "+experience);
	}

}
