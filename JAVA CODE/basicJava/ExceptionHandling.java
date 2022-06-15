package basicJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {

		System.out.println("Start of program");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");

		try {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			div(num1,num2);
//			int div = num1 / num2;
//			System.out.println("Answer: " + div);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Inside IllegalArgumentException catch block");
		}
//		catch (Exception e) {
//			System.out.println("All exceptions are caught here.");
//		}
		catch (ArithmeticException e) {
			System.out.println("Inside arithmetic exception catch block.");
			System.out.println("Enter a non-zero divisor.");
		} catch (InputMismatchException e) {
			System.out.println("Inside InputMismatchException catch block.");
			System.out.println("Enter proper input.");
		}finally {
			System.out.println("Inside finally block.");
		}

		System.out.println("End of program");

	}
	
	public static void div(int a,int b) throws IllegalArgumentException

	{
		System.out.println(a/b);
		throw new IllegalArgumentException("Manually thrown exception");
	}
}
