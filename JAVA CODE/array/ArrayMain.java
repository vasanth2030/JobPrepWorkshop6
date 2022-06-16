package array;

import java.util.Scanner;

public class ArrayMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the element: ");
			arr[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("The elements in the array are: ");
		printArray(arr);
		System.out.println("Sum of elements in the array: " + sumOfElementsInArray(arr));
		System.out.println("The largest element in the array: " + largestElementInArray(arr));
	}

	public static int sumOfElementsInArray(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i]; // sum = sum+arr[i]
		}
		return sum;
	}
	
	public static int largestElementInArray(int arr[])
	{
		if(arr.length<1)
			return -1;
		int largest=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>largest)
				largest=arr[i];
		}
		return largest;
	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
