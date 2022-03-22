import java.util.Scanner;
public class InchToMeter {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Value for Inch: ");
		double inch = input.nextFloat();
		double meter = inch*0.0254;
		
		System.out.println("meter:" +meter);

	}

}
