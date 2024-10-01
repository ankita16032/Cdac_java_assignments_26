package assignments_26;

import java.util.Scanner;

public class Assignment3 {

	private boolean validId = true;
	private boolean validAccessCard = true;
	private boolean Admin = true;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter validId as true or false: ");
		validId = sc.nextBoolean();
		System.out.println("Enter validAccessCard as true or false: ");
		validAccessCard = sc.nextBoolean();
		System.out.println("Enter Admin ad true or false");
		Admin=sc.nextBoolean();
	}

	public void checkValidId() {
		if (validId)
			System.out.println("id is valid");
		else
			System.out.println("id is not valid");
	}

	public void checkValidAccessCard() {
		if (validAccessCard)
			System.out.println("Access card is valid");
		else
			System.out.println("Access card is not valid");
	}

	public void checkAdmin() {
		if (Admin)
			System.out.println("admin is real");
		else
			System.out.println("admin is not real");
	}

	public void checkAccessControl() {
		if ((validId && validAccessCard) || Admin)
			System.out.println("Access Granted..");
		else
			System.out.println("Access Denied");
	}

	public void diaplay() {
		System.out.println("ValidId is " + validId);
		System.out.println("ValidAccessCard is " + validAccessCard);
	}
}
