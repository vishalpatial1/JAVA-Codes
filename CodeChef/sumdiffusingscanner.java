import java.util.Scanner;

class sumdiffusingscanner
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner read = new Scanner(System.in); 
		int a = read.nextInt();
		int b = read.nextInt();
		System.out.println("Sum is: " + (a+b));
		System.out.println("Difference is: " + (a-b));
	}
}
