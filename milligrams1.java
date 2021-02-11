package schoolStuff;
import java.util.Scanner;
public class milligrams1{
	public static void main(String[] args) {
		//I'm not sure 100% what the question means. Can you please make the questions more clear
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter milligrams: ");
		double milli=sc.nextDouble();
		int kilo= (int)milli/1000000;
		int grams= ((int)milli-(kilo*1000000))/1000;
		double mili=milli-((kilo*1000000)+(grams*1000));
		System.out.println(kilo+" kilograms, "+ grams+" grams, and " +mili+" milligrams.");

		
		
	}

}
