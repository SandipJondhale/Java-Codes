import java.util.Scanner;

public class NoEqualOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number: ");
		int b = sc.nextInt();
		System.out.println("Enter 3rd Number: ");
		int c = sc.nextInt();
		System.out.println("Enter 4th Number: ");
		int d = sc.nextInt();
		
		if(a == b && b == c && c == d)
		{
			System.out.println("Numbers are Equal");
		}
		else {
			System.out.println("Numbers are Not Equal");
		     }

		}

	}


