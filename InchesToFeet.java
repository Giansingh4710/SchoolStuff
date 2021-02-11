package schoolStuff;
import java.util.Scanner;

public class InchesToFeet {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter inches: ");
		int inches=sc.nextInt();
		double feet=(double)inches/12;
		System.out.print(feet);
		
	}

}
