import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("Enter Any Number For Table:");
		Scanner sc= new Scanner(System.in);
		int mul=sc.nextInt();
			for(int i=1;i<=12;i++)
			{
					
	     		System.out.println(mul + "*" + i + "=" + mul*i);

			}

	}
}
