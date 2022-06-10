package basicJava;

import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Start of program.");
		System.out.println();
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

//		int age = sc.nextInt();
//		if(age>=18)
//		{
//			System.out.println("You are an adult.");
//		}

//		if(num==0)
//		{
//			System.out.println("The number is zero");
//		}
//		else if(num%2==0)
//		{
//			System.out.println("Even number");
//		}
//		else
//		{
//			System.out.println("Odd number");
//		}

//		switch (num) {
//		case 1:
//			System.out.println("Monday");
//			break;
//
//		case 2:
//			System.out.println("Tuesday");
//			break;
//
//		case 3:
//			System.out.println("Wednesday");
//			break;
//
//		case 4:
//			System.out.println("Thursday");
//			break;
//
//		case 5:
//			System.out.println("Friday");
//			break;
//
//		case 6:
//			System.out.println("Saturday");
//			break;
//
//		case 7:
//			System.out.println("Sunday");
//			break;
//
//		default:
//			System.out.println("Invalid number");
//		}
		
		String result;
		result= (num%2==0)?"Even":"Odd";
//		result= (num==0)?"Zero":(num%2==0)?"Even":"Odd";
		
		System.out.println(result+" number.");

		System.out.println();
		System.out.println("End of program.");

	}

}
