package assignments_26;

	import java.util.Scanner;

	public class Assignment4 {

		//private String citizen;
		private int age;
		private boolean citizen=true;
		
		Scanner sc = new Scanner(System.in);
		public void accept()
		{
			System.out.println("Enter age of Person: ");
			age=sc.nextInt();
			System.out.println("Enter citizenship as if present true, else false");
			citizen=sc.nextBoolean();
			
		}
		public void isCitizen()
		{
			if(citizen==true)
				System.out.println("You are the citizen");
			else
				System.out.println("You are not citizen");
		}
		public void eligibleToVote()
		{
			if(age>=18 &&  citizen)
				System.out.println("Person can vote");
			else
				System.out.println("Person can not vote");
		}
		public void display()
		{
			System.out.println("Mentioned Citizenship: "+citizen);
			System.out.println("Age is : "+age);
		}
	}


