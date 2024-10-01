package assignments_26;

import java.util.Scanner;

public class Assignment1 {

	private int age;
	private double income;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter age: ");
		age = sc.nextInt();
		System.out.println("Enter income: ");
		income = sc.nextDouble();

	}

	public void checkAge() {
		if (age >= 18 && age <= 60 && income >= 25000)
			System.out.println("Person is eligible for loan");
		else
			System.out.println("Person is not eligible for loan");
	}

	public void display() {
		System.out.println("Age is: " + age);
		System.out.println("Income is: " + income);
	}

}
