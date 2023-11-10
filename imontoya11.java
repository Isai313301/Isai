import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		int num;
		int square;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = keyboard.nextInt();
		square = num * num;
		System.out.println("The answer is "+square);


	}
}
