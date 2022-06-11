package basicJava;

import java.util.Scanner;

public class Loops {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		factorial(n);
		
//		int i=1;
//		while(i<=n)
//		{
//			System.out.print(i+" ");
//			i++;
//		}
		
		
//		do {
//			System.out.print(i+" ");
//			i++;
//		}while(i<=n);
		
		
//		for(int i=1;i<=n;i+=2)   // i=i+2
//		{
//			System.out.print(i+" ");
//		}
		
	}
	
	public static void factorial(int num)
	{
		int fact=1;
		for(int i=2;i<=num;i++)
		{
			fact*=i;     //fact=fact*i
		}
		System.out.println("Factorial: "+fact);
	}

}
