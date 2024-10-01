package assignments_26;

import java.util.Scanner;

public class Assignment2 {

	private int sub1;
	private int sub2;
	private int sub3;
	private float avg;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter scores for three subjects as sub1,sub2,sub3");
		sub1 = sc.nextInt();
		sub2 = sc.nextInt();
		sub3 = sc.nextInt();
	}

	public void isPass() {
		avg = (sub1 + sub2 + sub3) / 3;
		System.out.println("Avg is: " + avg);
		if (avg >= 60 && sub1 > 40 && sub2 > 40 && sub3 > 40)
			System.out.println("Student Pass an exam");
		else
			System.out.println("Student Fail an Exam");
	}

	public void display() {
		System.out.println("Score for sub1: " + sub1);
		System.out.println("Score for sub2: " + sub2);
		System.out.println("Score for sub3: " + sub3);
	}
}
