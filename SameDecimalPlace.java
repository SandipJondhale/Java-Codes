import java.util.Scanner;

public class SameDecimalPlace {

	public static void main(String[] args) {
		
		double a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Floating point Number:");
		double i = sc.nextDouble();
		a= Math.round(i*1000);
		a=a/1000;
		//System.out.println(a);
		
		
		
		Scanner s = new Scanner(System.in);
		double j = s.nextDouble();
		a= Math.round(j*1000);
		a=a/1000;
		//System.out.println(a);
		
		if(i == j) {
			System.out.println("Same up to three decimal places");
		}
		else {
			System.out.println("Not Same up to three decimal places");
		}
		}

	}

