import java.util.Scanner;

public class divingrightin
	{

	public static void main(String[] args) 
	{
		userName();
		userAge();
	    yearofBirth();
		
	}
	
	
	private static void userName()
		{
			Scanner userinput = new Scanner(System.in);
			System.out.println("What is your name?");
			String name = userinput.nextLine();
			
		}

	private static void userAge()
		{
			Scanner input1 = new Scanner(System.in);
			System.out.println("Can you also tell me you year of birth?");
			int yearofbirth = input1.nextInt();
			for(int i = yearofbirth; i<2018; i++)
				{
					int temp = i-yearofbirth;
					System.out.println("In " + i + " you were " + temp + " years old!");
				}
			
		}

	private static void yearofBirth()

		{
			Scanner input2 = new Scanner(System.in);
			System.out.println("So How old are you?");
			int age = input2.nextInt();
			if(age<17)
			{
				System.out.println("You are young.");
			}
			else if(age==17)
			{
				System.out.println("We are same age:)");
			}
			else if(age>17)
			{
				System.out.println("Oh, so you are an adult now.");
			}
			
			double i = age/7;
			System.out.println("Your ages transfer to dog years are aproximately " + i +".");
				
		}



	}
